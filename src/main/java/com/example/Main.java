package com.example;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.notes.Note;
import com.example.notes.TestMethod;

public class Main {
	public static void main(String args[]) {
		final Logger log = LoggerFactory.getLogger(Main.class);

		Class clazz = Skullcracker.class;

		// Find information on class annotation at runtime.
		Note note = (Note)clazz.getAnnotation(Note.class);
		log.info("Note author ({})", note.author());

		// Find methods at runtime
		Method[] methods = clazz.getMethods();

		Skullcracker instance = new Skullcracker();

		for (Method method : methods) {
			if (method.isAnnotationPresent(TestMethod.class)) {
				try {
					method.invoke(instance);
				} catch (IllegalAccessException ex) {
					log.error("Error accessing method at runtime.", ex);
				} catch (InvocationTargetException ex) {
					log.error("Error invoking target at runtime.", ex);
				}
			}
		}
	}
}