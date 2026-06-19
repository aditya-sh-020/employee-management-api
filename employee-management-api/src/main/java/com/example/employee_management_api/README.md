# Employee Management System

A Spring Boot REST API project for managing employee records with CRUD operations.

## Tech Stack

- Java 17
- Spring Boot 3
- Spring Data JPA
- MySQL
- Maven
- Postman

## Features

- Create Employee
- Get All Employees
- Get Employee By ID
- Update Employee
- Delete Employee

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | /api/employees | Create Employee |
| GET | /api/employees | Get All Employees |
| GET | /api/employees/{id} | Get Employee By ID |
| PUT | /api/employees/{id} | Update Employee |
| DELETE | /api/employees/{id} | Delete Employee |

## Run Project

1. Clone repository

2. Configure MySQL database

3. Run:

mvn spring-boot:run

## Database

MySQL database is used with Spring Data JPA.

## Author

Aditya