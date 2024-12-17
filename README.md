This is a simple Student Information Management RESTful CRUD application built using Spring Boot. It allows you to perform Create, Read, Update, and Delete operations on student data. The project follows a clean architecture with a focus on best practices.**Student Info CRUD Application using Spring Boot
This is a simple Student Information Management RESTful CRUD application built using Spring Boot. It allows you to perform Create, Read, Update, and Delete operations on student data. The project follows a clean architecture with a focus on best practices.

Features 🚀
Add Student Data: Insert student details like name, address, and phone number.
Retrieve All Students: Fetch a list of all students.
Get Student By ID: Fetch specific student details using their unique ID.
Update Student Data: Update existing student records.
Update Single Entity: Update only specific fields of the student record.
Delete Student Record: Remove student data from the system.
Tech Stack 🛠️
Java: Programming Language
Spring Boot: Framework for RESTful services
Spring Data JPA: Database interaction and ORM
H2 Database (or other): Default in-memory database
Maven: Dependency management
Prerequisites ✅
Ensure the following software is installed:

Java Development Kit (JDK) 11+
Maven 3+
IDE (IntelliJ, Eclipse, or STS)
Installation & Setup ⚙️
Follow these steps to set up the project on your local machine:

Clone the Repository


git clone https://github.com/your-username/student-info-crud.git
cd student-info-crud
Import the Project

Open your IDE and import the project as a Maven project.
Configure Application Properties
Modify the application.properties file to set up your database (example: H2, MySQL, or PostgreSQL). Default configuration for H2:

properties

spring.datasource.url=jdbc:h2:mem:studentdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
Build the Project

mvn clean install
Run the Application


mvn spring-boot:run
Access the Application
The application will start on http://localhost:8080.

REST API Endpoints 📝
Here are the available endpoints for the Student CRUD operations:

HTTP Method	Endpoint	Description
POST	/api/student/create	Add a new student
GET	/api/student/all	Retrieve all students
GET	/api/student/{id}	Retrieve student by ID
PUT	/api/student/update	Update a student record
PATCH	/api/student/update/{id}	Update a single entity
DELETE	/api/student/delete/{id}	Delete a student record
Example JSON Payloads 📦
Add Student (POST /api/student/create)

{
  "name": "John Doe",
  "number": "1234567890",
  "address": "123 Street, City"
}
Update Student (PUT /api/student/update)

{
  "id": 1,
  "name": "Jane Doe",
  "number": "0987654321",
  "address": "456 Avenue, City"
}
Partial Update Student (PATCH /api/student/update/{id})

{
  "name": "Updated Name"
}
Exception Handling 🚫
Custom exception handling is implemented for:

Invalid ID or resource not found
Invalid or null input data
Example error response:


{
  "message": "Id not found",
  "status": "404 NOT FOUND"
}
Run in Postman or Swagger 🧪
Use Postman to test each endpoint by sending HTTP requests.
Alternatively, integrate Springdoc Swagger for an interactive API UI:
Add springdoc-openapi-ui dependency.
Access Swagger at: http://localhost:8080/swagger-ui.html
Directory Structure 📂
bash
Copy code
student-info-crud/
│
├── src/main/java/com/crudstudent/student_info
│   ├── controller/       # Controller layer
│   ├── services/         # Service implementation
│   ├── repository/       # Repository (JPA)
│   ├── model/            # Data model (StudentDataInfo)
│   └── exceptionhandler/ # Custom exceptions
│
├── src/main/resources/
│   ├── application.properties
│
├── pom.xml               # Maven dependencies
└── README.md             # Project documentation

Future Enhancements 🌟
Implement pagination for retrieving students.
Add validation for input fields.
Integrate a front-end (React/Angular) for UI interaction.
Contribution 🤝
Contributions are welcome!
Fork this repository, create a new branch, and submit a Pull Request.
