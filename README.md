## Building a subscription with Spring Boot, Spring Security, JWT

![App Screenshot](screenshot.png)



## Steps to Setup the Spring Boot Back end app

1. **Clone the application**

	```bash
	git clone https://github.com/raushan-kumar802/subscription.git
	cd subscription
	```

2. **Create MySQL database**

	```bash
	create database public_service
	```

3. **Change MySQL username and password as per your MySQL installation**

	+ open `src/main/resources/application.properties` file.

	+ change `spring.datasource.username` and `spring.datasource.password` properties as per your mysql installation
4. **Change SubscriptionController**

	+ open `com.subscription.client.subscription.controller` file.

	+ change `mail.setMailFrom`  add a EmailId.

5. **Run the app**

	You can run the spring boot app by typing the following command -

	```bash
	mvn spring-boot:run
	```

	The server will start on port 8083.

	You can also package the application in the form of a `jar` file and then run it like so -

	```bash
	mvn package
	java -jar target/subscription-0.0.1-SNAPSHOT.jar
	```



