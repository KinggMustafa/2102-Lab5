Overview
This Spring Boot app provides a simple quiz interface, password quality checker, and email validation tool. It uses Thymeleaf templates for the UI and REST APIs for backend services. AJAX enables dynamic loading for quiz questions.

Features
REST API provides quiz questions as JSON.
Thymeleaf UI renders user interfaces.
AJAX integration loads quiz questions from the backend.
Additional tools include password strength evaluation and email format validation.
Requirements
Java 17+, Maven 3.6+, and an internet connection for dependencies.

Project Structure
src/main/java contains controllers and models.
src/main/resources/templates houses Thymeleaf HTML files for the UI.
src/main/resources/static/css contains CSS files for styling.
pom.xml is the Maven configuration file.
Getting Started
Clone the repository by running git clone <> and navigate into the folder with cd <repository-folder>.
Build the project with ./mvnw clean install to install dependencies.
Run the application using ./mvnw spring-boot:run.
Technologies
Spring Boot, Thymeleaf, AJAX, jQuery, Bootstrap.

Running Tests
Run unit tests by entering ./mvnw test.

This summary provides a quick overview of the app’s features, setup, and commands.
