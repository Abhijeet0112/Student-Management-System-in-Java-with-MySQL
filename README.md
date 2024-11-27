Project Description: Student Management System in Java with MySQL

The Student Management System is a console-based Java application designed to manage student records using MySQL for database operations. The system provides a user-friendly interface to perform CRUD (Create, Read, Update, Delete) operations on student data.

---

Features:
1. Insert New Student  
   - Collects student details (name, phone number, address) via user input.  
   - Inserts the data into the MySQL database.  
   - Displays a confirmation message upon successful insertion.

2. Update Student Details 
   - Updates a student's record by specifying the roll number.  
   - Allows modification of name, phone number, and address.  
   - Provides feedback if the record does not exist.

3. Delete Student Record
   - Deletes a student record by roll number.  
   - Confirms deletion or displays an error if the student does not exist.

4. Retrieve Student by Roll Number 
   - Fetches and displays the details of a specific student.  
   - Includes roll number, name, phone number, address, admission date, and last update timestamp.

5. Retrieve All Students  
   - Lists all student records in the database.  
   - Displays comprehensive details for each student.

6. Exit  
   - Allows the user to exit the application gracefully.

---

Key Components:
1. Database Connection: 
   - Utilizes `DBConnect` class to establish a connection with the MySQL database.

2. DAO Layer: 
   - The `StudentDao` class encapsulates all database operations (insert, update, delete, fetch).  
   - Ensures separation of concerns and modular design.

3. Entity Class:  
   - The `Student` class models the student entity with attributes like roll number, name, phone number, address, admission date, and last update timestamp.

4. Driver Class:  
   - Contains the main method to drive the application logic.  
   - Implements a menu-driven interface for user interaction.

---

Tools and Technologies:
- Programming Language: Java
- Database: MySQL
- Libraries: JDBC for database connectivity
- IDE: Eclipse
- Architecture: MVC (Model-View-Controller)

---

Application Flow:
1. User chooses an option from the menu.
2. Based on the choice, the application interacts with the `StudentDao` for the corresponding database operation.
3. Outputs the result of the operation to the console.

---

Highlights:
- Scalability: Modular design allows for easy enhancement.
- Reliability: Validates user input and ensures robust error handling.
- Real-time Data Management: Displays dynamic data from the MySQL database.

This project is ideal for learning the basics of Java, JDBC, and database operations while demonstrating a practical implementation of CRUD operations.

-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: localhost    Database: jdbcdemo
-- ------------------------------------------------------
-- Server version	8.0.40

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `rollno` int NOT NULL AUTO_INCREMENT,
  `sname` varchar(45) NOT NULL,
  `phno` varchar(20) NOT NULL,
  `address` varchar(45) NOT NULL,
  `add_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `lase_update` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`rollno`),
  UNIQUE KEY `phno` (`phno`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-27 17:18:20
