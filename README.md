java-from-yesteryear
====================

Create the library.jar

javac library/library/SpellBook.java
cd library
jar cfm ../library.jar Manifest.txt library/SpellBook.class
cd ..

Compile the main classes
javac -classpath ./library.jar main/com/Adventurer.java
java -classpath ./library.jar:./main com.Adventurer