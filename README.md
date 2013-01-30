Download and setup a web container (http://download.eclipse.org/jetty/)

curl -O http://repo1.maven.org/maven2/javax/servlet/servlet-api/2.5/servlet-api-2.5.jar
javac -cp ./servlet-api-2.5.jar servlet/com/example/SimpleServlet.java
cd servlet
jar cf ../war/WEB-INF/lib/servlet.jar com/
jar cf servlet.war WEB-INF/

http://localhost:8080/servlet/SimpleServlet

http://docs.oracle.com/javaee/6/api/javax/servlet/http/HttpServlet.html