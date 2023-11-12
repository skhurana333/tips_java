build image first to use yaml files
================================
docker build -t java-docker_skh .

Yaml files in this project use this image.


if want to run the server manually
=================================
To Start
java -jar target/tips-0.0.1-SNAPSHOT.jar

To check
http://hostname:8080
