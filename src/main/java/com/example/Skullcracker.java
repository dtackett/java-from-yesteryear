package com.example;

import com.example.notes.Note;
import com.example.notes.TestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Note(author="Devon")
public class Skullcracker {
	final Logger log = LoggerFactory.getLogger(getClass());

	public void oneThing() {
		log.info("One thing");
	}

	@TestMethod
	public void twoThing() {
		log.info("Two thing");
	}

	public void threeThing() {
		log.info("Three thing");
	}

	@TestMethod
	public void four() {
		log.info("Four");
	}
}