java-from-yesteryear
====================

Simple introduction to logging.

http://slf4j.org/manual.html

curl -O 'http://slf4j.org/dist/slf4j-1.7.2.tar.gz'
tar -xvf slf4j-1.7.2.tar.gz
javac -cp ./slf4j-1.7.2/slf4j-api-1.7.2.jar HelloWorld.java
java -cp ./slf4j-1.7.2/slf4j-api-1.7.2.jar:./slf4j-1.7.2/slf4j-simple-1.7.2.jar:. HelloWorld