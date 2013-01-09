java-from-yesteryear
====================
Basic example on how to create and execute a jar.

javac com/example/Platypus.java
jar cfm Platypus.jar Manifest.txt com/example/Platypus.class
java -jar Platypus.jar