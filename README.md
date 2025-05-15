# 🧑‍💼 Employee Service

**Employee Service** is a Spring Boot microservice responsible for managing employee records, department assignments, and enforcing role-based access control (`ADMIN`, `EMPLOYEE`). It provides RESTful APIs designed to integrate with HR, Payroll, and Authentication systems in a microservices architecture.

---

## 🚀 Features

- ✅ Create, update, delete employees (ADMIN only)
- ✅ View own profile (EMPLOYEE)
- ✅ Assign departments to employees
- ✅ Secure APIs with role-based access control
- ✅ Uses DTOs to expose clean and secure data
- ✅ In-memory H2 database for local development
- ✅ Ready for integration in a microservice ecosystem

---

## ⚙️ Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- Spring Security
- MySQL database
- Maven

---

## 📁 Project Structure
employee-service/
├── controller/             # REST API endpoints (e.g., EmployeeController)
├── service/                # Business logic layer (e.g., EmployeeService)
├── repository/             # JPA repository interfaces (e.g., EmployeeRepository)
├── entity/                 # JPA entity classes (e.g., Employee, Department)
├── dto/                    # Data Transfer Objects (e.g., EmployeeDTO)
├── config/                 # Security, CORS, JWT config
├── resources/
│   └── application.properties  # Spring Boot configuration
└── EmployeeServiceApplication.java  # Main Spring Boot entry point

---
## 🛠️ How to Run

### 📦 Prerequisites

- Java 17+
- Maven 3.8+

### ▶️ Run the app

# Clone the repo
git clone https://github.com/soultef/employee-service.git
cd employee-service

# 🧰 Configuration

## application.properties
----Copy and paste the following in the application.property file----
# MySQL Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/bookstoredb
spring.datasource.username=root        # replace with your MySQL username
spring.datasource.password=password    # replace with your MySQL password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.properties.hibernate.format_sql=true


# Hibernate (JPA) Configuration
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true

# Connection Pooling (HikariCP - Default)
spring.datasource.hikari.maximum-pool-size=10
spring.datasource.hikari.minimum-idle=2
spring.datasource.hikari.idle-timeout=30000
spring.datasource.hikari.max-lifetime=60000

# Run the app
mvn spring-boot:run

The app will start on:
👉 http://localhost:8080

# 🧪 Test the API
You can test the service with:
🧪 Postman or curl
🧪 Swagger (optional – add springdoc-openapi dependency)

# 📦 Build Artifact
Run this to package the app:
mvn clean package
Output JAR: target/employee-service-1.0.0.jar

# 🔄 CI/CD with GitHub Actions
The project includes a simple CI workflow at:
.github/workflows/ci.yml

It will:
 Build the app
 Run tests
 Upload the JAR as a build artifact

# 🧭 Future Enhancements
 JWT-based authentication
 Docker & Docker Compose support
 Department as a standalone service
 Integration with API Gateway & Service Registry
 Centralized configuration with Spring Cloud Config

📄 License
This project is licensed under the MIT License © 2025 [Solomon Demisse]


