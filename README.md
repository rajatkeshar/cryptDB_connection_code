# cryptDB_connection_code
This Repo contains the code for cryptDB connection with NodeJS &amp; JAVA

## Node_Connection

	- $cd node_connection/
	- $node app.js
	- API :
		1. - URL: http://localhost:8080/postData
		   - Method: POST
		   - REQ: { "name": "Rajat", "email": "Rajat@gmail.com" }
		   - RES: { "msg": "Inserrted Successfully", "rows": rows }

		2. - URL: http://localhost:8080/getData
		   - Method: GET
		   - REQ: NULL
		   - RES: { "name": "Rajat", "email": "Rajat@gmail.com" }
		

## JAVA_Connection

	- $cd java_connection/
	- $javac -cp /home/rajat/oodles/POC_java/mysql-connector-java-5.1.47.jar:/home/rajat/oodles/POC_java/ MySqlCon.java

	- $java -cp /home/rajat/oodles/POC_java/mysql-connector-java-5.1.47.jar:/home/rajat/oodles/POC_java/ MySqlCon
