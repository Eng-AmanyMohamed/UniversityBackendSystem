# 🎓University Management Backend

This Spring Boot project is built as part of the **Banque Misr Backend Internship** to manage students, courses, and categories. It demonstrates entity relationships, DTOs, and clean architecture practices.

## 🔧 Technologies
- Java 17+
- Spring Boot
- Spring Data JPA
- Mysql Database
- Postman / cURL for testing

## 📚 Features
- Create and view students
- Create and view courses (with category)
- Associate students with courses
- Avoid recursion via DTOs or @JsonIgnore

## 📁 Structure
- `models/`: JPA entities
- `repository/`: Spring Data repositories
- `dto/`: Data Transfer Objects
- `controller/`: REST APIs

## 🧪 Sample Endpoints (cURL)
##  🧑‍🎓 Student Endpoints
```
# Create a new student
curl -X POST http://localhost:8080/students \
  -H "Content-Type: application/json" \
  -d '{"name": "Ali", "email": "ali@example.com"}'

# Get all students
curl http://localhost:8080/students

# Get student by ID
curl http://localhost:8080/students/1

```
---

## 📚 Course Endpoints
```
# Create a new course
curl -X POST http://localhost:8080/courses \
  -H "Content-Type: application/json" \
  -d '{"title": "Spring Boot 101", "category": {"id": 1}}'

# Get all courses
curl http://localhost:8080/courses

```
---

## 🗂️ Category Endpoints
```
# Create a new category
curl -X POST http://localhost:8080/categories \
  -H "Content-Type: application/json" \
  -d '{"name": "Backend"}'

# Get all categories
curl http://localhost:8080/categories


```

