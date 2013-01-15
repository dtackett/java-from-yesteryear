java-from-yesteryear
====================
Classpath fun!

cd monkey
javac Animal.java
cd ../rabbit
javac Animal.java
cd ../project
javac -classpath ../monkey/ Project.java
java -classpath ../monkey:. Project
java -classpath ../rabbit:. Project