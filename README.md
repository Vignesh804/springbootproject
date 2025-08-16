# Employee Management System (Spring Boot + MySQL)

This is a **Spring Boot web application** for managing employees.  
It allows you to **add, edit, delete, and view employees** with details like `Name`, `Email`, and `Contact`.

## 🚀 Features
- Add new employees  
- View employee list  
- Edit employee details  
- Delete employees  
- MySQL database integration  
- Thymeleaf templates for UI  

## 🛠️ Technologies Used
- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA (Hibernate)**
- **MySQL Database**
- **Thymeleaf (Frontend templates)**
- **Maven** (build tool)
- **Spring MVC**

## 📂 Project Structure
```
employee/
 ├── src/main/java/...   # Java source code
 ├── src/main/resources  # application.properties, templates, static files
 ├── pom.xml             # Maven dependencies
 ├── README.md
 ├── .gitignore
 └── requirements.txt
```

## ⚙️ Setup Instructions

### 1. Clone the repository
```bash
git clone https://github.com/your-username/employee-management.git
cd employee-management
```

### 2. Configure MySQL Database
Create a database in MySQL:
```sql
CREATE DATABASE employee;
```

Update `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Run the Application
```bash
mvn spring-boot:run
```

### 4. Access in Browser
```
http://localhost:8080
```

## 📸 Screenshots
- **Home Page**
- **Employee List**
- **Add/Edit Employee**
- **MySQL Database Integration**

## 🧑‍💻 Author
Developed by **Vignesh G**
