java-from-yesteryear
====================

Sample ObjectMapper code.

  curl -O 'http://jackson.codehaus.org/1.9.11/jackson-all-1.9.11.jar'
  java -cp target/server.jar:./jackson-all-1.9.11.jar com.example.ObjectMapperExample;


Sample jersey setup. To start the jetty server run the following command from the root directory.

	mvn jetty:run
	
GET

	curl -H "Accept: application/json" http://localhost:8080/grape
	curl http://localhost:8080/coffee-pot
	curl http://localhost:8080/coffee-pot?type=tea	
	
POST

	curl -X POST -H "Content-Type: application/json" -d '{"wrangled":"false"}' http://localhost:8080/grape
	