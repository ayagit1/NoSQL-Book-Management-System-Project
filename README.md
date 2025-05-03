# 📚 NoSQL Book Management System

## Overview

This project presents a full-stack **Book Management System** built using **Spring Boot** for the backend, **Thymeleaf** for the frontend, and **MongoDB** as the NoSQL database. The system is designed to manage books and user interactions efficiently, leveraging the flexibility and scalability of document-oriented databases.

The project is a practical demonstration of how traditional Java enterprise development frameworks like Spring Boot can be integrated with modern NoSQL databases to create dynamic, scalable, and data-intensive web applications.

## Objectives

* To design and develop a web-based system that utilizes **MongoDB** for data storage.
* To implement a complete **CRUD** interface for book and user management.
* To build a responsive and dynamic user interface using **Thymeleaf**.
* To apply **Spring Boot** and **Spring Data MongoDB** for clean, modular, and scalable architecture.

## Technologies Used

* **Java**, **Spring Boot**, **Spring Data MongoDB**
* **MongoDB** – NoSQL database
* **Thymeleaf** – Template engine for frontend rendering
* **Maven** – Build tool
* **Lombok** – Code generation (optional)
* **Bootstrap/CSS** – For basic styling

## Functional Modules

* **Book Management**

  * Add, update, delete, and list books
  * View detailed book information
* **Search & Filtering**

  * Search by title, author, genre, etc.
* **User Management**

  * Basic user simulation and borrowing behavior (if implemented)
* **Thymeleaf-based Views**

  * Dynamic HTML templates rendered on the server side
* **MongoDB Integration**

  * Flexible schema and fast querying using `@Document` and repository interfaces

## Project Structure

```
src/
├── main/
│   ├── java/com/example/bookmanager/
│   │   ├── controller/     # Web controllers (BookController, etc.)
│   │   ├── model/          # Domain models (Book.java)
│   │   ├── repository/     # MongoDB repositories
│   │   └── BookManagerApplication.java  # Main app entry
│   └── resources/
│       ├── templates/      # Thymeleaf HTML templates
│       ├── static/         # CSS/JS (if any)
│       └── application.properties
```

## Setup Instructions

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/nosql-book-management.git
   cd nosql-book-management
   ```

2. Ensure MongoDB is running locally or update the URI in `application.properties`:

   ```properties
   spring.data.mongodb.uri=mongodb://localhost:27017/bookdb
   ```

3. Build and run the application:

   ```bash
   mvn spring-boot:run
   ```

4. Access the application in your browser at:

   ```
   http://localhost:8080
   ```

## Sample Endpoints & Views

* `/books` – View all books
* `/books/add` – Add new book (form)
* `/books/edit/{id}` – Edit a book
* `/books/delete/{id}` – Delete a book
* `/books/search?title=xyz` – Search by title and Author

## Academic Relevance

This project illustrates the application of **NoSQL database systems** in web development by integrating MongoDB into a Spring MVC architecture. It demonstrates practical usage of **Spring Boot**, **Spring Data MongoDB**, and **Thymeleaf**, combining backend logic with server-side HTML rendering — providing both conceptual depth and implementation skills for real-world enterprise systems.

## Author

**Aya Amarass & Alex Huey** :
Master 2 in Big Data & Business Analytics – CYTECH
📧 [aya.amarass@gmail.com](mailto:aya.amarass@gmail.com)
