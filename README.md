# 🛒 E-Commerce Backend System (Spring Boot)

A production-style backend application built using **Spring Boot**, **Spring Data JPA**, **MySQL**, and **Spring Security**.  
This project demonstrates clean backend architecture, validation, global exception handling, and secure API design.

---

## 🚀 Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- Spring Security
- JWT (JSON Web Token)
- MySQL
- Maven
- Postman

---

## 🏗️ Project Architecture

Controller → Service → Repository → Database
↓
DTOs
↓
Global Exception Handling


**Key architectural principles used:**
- Layered architecture (Controller, Service, Repository)
- DTO-based request & response handling
- Centralized exception handling
- Stateless authentication

---

## 🔐 Authentication & Authorization

- JWT-based authentication
- Stateless security (no sessions)
- Password encryption using **BCrypt**
- Role-based access ready structure

### Public APIs
- `POST /auth/register`
- `POST /auth/login`

### Protected APIs
- `/users/**` (requires JWT token)

---

## 📦 Features Implemented

### User Module
- Create user with validation
- Prevent duplicate email registrations
- Secure password storage
- Auto-generated timestamps

### Validation
- Field-level validation using:
    - `@NotBlank`
    - `@Email`
- Clean validation error responses

### Global Exception Handling
- Centralized exception handling using `@RestControllerAdvice`
- Meaningful HTTP status codes:
    - **400 Bad Request** → Validation errors
    - **409 Conflict** → Duplicate email
    - **401 Unauthorized** → Missing / invalid token

---
## Screenshots(Results) : -

<img width="1920" height="1080" alt="Screenshot 2026-01-15 110543" src="https://github.com/user-attachments/assets/5b3866ec-3ab5-4e2b-862c-2bd5a6c6f6b3" />

<img width="1013" height="878" alt="Screenshot 2026-01-15 114701" src="https://github.com/user-attachments/assets/bdd8f559-2d4d-4590-af4f-36e740e48ef7" />

<img width="1567" height="971" alt="Screenshot 2026-01-15 115204" src="https://github.com/user-attachments/assets/edd63fb6-50d2-4e44-ba41-c89432585c49" />

<img width="924" height="889" alt="Screenshot 2026-01-16 115118" src="https://github.com/user-attachments/assets/21bfe602-36f9-45e8-9bee-e71167c01712" />

<img width="921" height="851" alt="Screenshot 2026-01-16 120043" src="https://github.com/user-attachments/assets/1d672ae4-4c5c-4c85-874a-cb2c99471583" />



## 🧪 API Testing

All APIs are tested using **Postman**.

### Sample Request (Create User)

http

POST /users

Authorization: Bearer <JWT_TOKEN>

json

{

  "name": "Backend User",
  
  "email": "backend@gmail.com"
  
}

Sample Validation Error Response
json

{
  "name": "Name is required",
  "email": "Invalid email format"
}

🗄️ Database Schema

Users Table
Column	Type	Constraints
id	BIGINT	Primary Key

name	VARCHAR	Not Null

email	VARCHAR	Unique, Not Null

password	VARCHAR	Not Null

created_at	TIMESTAMP	Auto-generated


▶️ How to Run the Project
Clone the repository

1.Create a MySQL database named ecommerce_db

2.Update database credentials in application.properties

3.Run the application

Test APIs using Postman

📌 Configuration (application.properties)

spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=root
spring.datasource.password=Amma@7758

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

spring.jpa.open-in-view=false
🎯 What This Project Demonstrates
Clean backend architecture

Secure REST API development

Real-world Spring Boot practices

Proper validation & error handling

Resume-ready backend project design

👨‍💻 Author

OMVIKAS INDLA

A backend project to demonstrate practical Spring Boot, JPA, and security concepts used in real-world backend systems.

