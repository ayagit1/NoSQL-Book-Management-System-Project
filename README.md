# 📚 NoSQL Book Management System

Welcome to the **NoSQL Book Management System** project! This is a web application designed to manage a collection of books. It allows users to browse books, search by title or author, view details, and even add ratings and comments. Built using **Spring Boot**, **MongoDB**, **Thymeleaf**, and **Bootstrap**, this application provides a robust and user-friendly interface for managing your book collection.

## Table of Contents

1. [Overview](#overview)
2. [Technologies Used](#technologies-used)
3. [Key Features](#key-features)
4. [Getting Started](#getting-started)

   * [Prerequisites](#prerequisites)
   * [Setup Instructions](#setup-instructions)
5. [Project Structure](#project-structure)
6. [Running the Application](#running-the-application)
7. [Contributing](#contributing)

---

## Overview

The **NoSQL Book Management System** is a full-stack web application where users can:

* **View books** in a paginated list.
* **Search** for books by title or author.
* **View detailed information** about each book, including its description, ratings, and comments.
* **Rate books** on a scale from 1 to 5.
* **Add comments** to books for user feedback.
* **Add, edit, and delete books** from the system.

The back-end is built with **Spring Boot** and connected to **MongoDB** (a NoSQL database) for storing book data. **Thymeleaf** handles dynamic content rendering, while **Bootstrap** ensures the interface is responsive and visually appealing.

---

## Technologies Used

This project leverages the following technologies:

* **Spring Boot**: A Java framework that simplifies the creation of web applications. It handles the business logic and HTTP requests in this project.
* **MongoDB**: A NoSQL database used to store book data. MongoDB's flexibility allows for easy scaling and fast access to large datasets.
* **Thymeleaf**: A server-side Java template engine used to render HTML content dynamically, allowing us to create interactive user interfaces with minimal complexity.
* **Bootstrap**: A popular CSS framework for building responsive, mobile-first web pages. It provides pre-built components that are easily customizable.
* **FontAwesome**: A library of icons used throughout the project to enhance the UI, making it more user-friendly and visually engaging.

---

## Key Features

Here are the main features of the **NoSQL Book Management System**:

1. **Home Page with Pagination**:

   * Displays a paginated list of books.
   * Each book card includes essential details such as title, author, genre, and year.

2. **Search by Title or Author**:

   * Allows users to search for books by title or author, with results displayed in a paginated format.

3. **Book Details**:

   * Shows detailed information about each book, including description, average rating, and a list of user comments.

4. **Add, Edit, and Delete Books**:

   * Users can add new books, update existing ones, and delete books from the system.

5. **Rate Books**:

   * Users can rate books from 1 to 5, and the average rating is displayed.

6. **Add Comments**:

   * Users can leave comments on books to share their thoughts and feedback.

7. **Responsive Design**:

   * The app is mobile-friendly, thanks to Bootstrap, which automatically adjusts the layout for different screen sizes.

---

## Getting Started

### Prerequisites

Before running this application, ensure you have the following installed on your machine:

* **Java 17 or higher** (to run Spring Boot).
* **MongoDB Atlas** account (or any other MongoDB instance).

### Setup Instructions

1. **Clone the repository**:
   Clone the project repository to your local machine:

   ```bash
   git clone https://github.com/your-username/no-sql-book-management-system.git
   ```

2. **Navigate to the project directory**:

   ```bash
   cd no-sql-book-management-system
   ```

3. **Set up MongoDB**:

   * Create a MongoDB Atlas cluster if you don't have one already.
   * Replace the connection URI in `src/main/resources/application.properties` with your own MongoDB URI:

     ```properties
     spring.data.mongodb.uri=mongodb+srv://<username>:<password>@cluster0.xjslic1.mongodb.net/bookdb?retryWrites=true&w=majority&appName=Cluster0
     ```

4. **Build the project**:
   Use Maven to build the project:

   ```bash
   mvn clean install
   ```

5. **Run the application**:
   Start the Spring Boot application:

   ```bash
   mvn spring-boot:run
   ```

6. **Access the application**:
   Open your web browser and go to `http://localhost:8080` to see the application in action.

---

## Project Structure

Here's a quick breakdown of the project structure:

* **/src/main/java/com/example/project**: Contains all the backend Java files, including controllers, services, and repositories.
* **/src/main/resources/templates**: Contains Thymeleaf templates for the user interface (HTML files).
* **/src/main/resources/static**: Contains static files such as CSS, images, and JavaScript.
* **/src/main/resources/application.properties**: Contains configuration settings, including the MongoDB URI and Spring Boot settings.

---

## Running the Application

Once the application is running, visit `http://localhost:8080` to view the homepage. The homepage will display a list of books that you can interact with:

* **Browse the books**: View a paginated list of books with their title, author, genre, and publication year.
* **Search for books**: Use the search bar to find books by title or author.
* **Add, edit, or delete books**: Use the buttons provided to manage books in the system.
* **Rate books**: You can give books a rating between 1 and 5.
* **Add comments**: Share your thoughts on books by adding comments.

---

## Contributions

This project was developed by **Aya Amarass** and **Alex Huey** as part of the NoSQL Class of the Master 2 in Big Data & Business Analytics at CYTECH - CY CERGY PARIS UNIVERSITY. If you have any suggestions or improvements, feel free to create an issue or a pull request.

---
This README provides all the essential information for anyone who wants to understand, use, or contribute to your project. Make sure to replace placeholders (like repository URL and MongoDB URI) with the actual details of your project.
