# 🎓 Student-Course Management Backend

This Spring Boot project is built as part of the **Banque Misr Backend Internship** to manage students, courses, and categories. It demonstrates entity relationships, DTOs, and clean architecture practices.

## 🔧 Technologies
- Java 17+
- Spring Boot
- Spring Data JPA
- H2 (for in-memory testing)
- Lombok (optional)
- Postman / cURL for testing

## 📚 Features
- Create and view students
- Create and view courses (with category)
- Associate students with courses
- Avoid recursion via DTOs or @JsonIgnore

## 📁 Structure
- `models/`: JPA entities
- `services/`: Business logic
- `repository/`: Spring Data repositories
- `dto/`: Data Transfer Objects
- `controller/`: REST APIs

## 🧪 Sample Endpoints (cURL)



