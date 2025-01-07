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
