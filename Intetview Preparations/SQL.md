# SQL Interview Questions and Answers for Freshers

# What is a Database?

A Database is defined as a structured form of data storage in a computer or a collection of data in an organized manner and can be accessed in various ways. It is also the collection of schemas, tables, queries, views, etc. Databases help us with easily storing, accessing, and manipulating data held on a computer. The Database Management System allows a user to interact with the database.

## 1. What is SQL?

SQL stands for Structured Query Language. It is a language used to interact with the database, i.e., to create a database, create a table in the database, retrieve data or update a table in the database, etc. SQL is an ANSI (American National Standards Institute) standard. Using SQL, we can do many things. For example, we can execute queries, insert records into a table, update records, create a database, create a table, delete a table, etc.

## Diagram: What is SQL?

```plaintext
        +-----------------------------+
        |             SQL              |
        +-----------------------------+
          |          |          |     
          |          |          |     
  +-------v---+  +---v-------+  +-----v----+
  | Create    |  | Insert    |  | Execute  |
  | Database  |  | Records   |  | Queries  |
  +-----------+  +-----------+  +----------+
          |          |          |     
          |          |          |     
  +-------v---+  +---v-------+  +-----v----+
  | Create    |  | Update    |  | Delete   |
  | Table     |  | Records   |  | Table    |
  +-----------+  +-----------+  +----------+
```

# SQL vs NoSQL

| **Feature**             | **SQL**                                            | **NoSQL**                                          |
|-------------------------|----------------------------------------------------|----------------------------------------------------|
| **Data Model**           | Relational (tables with rows and columns)          | Non-relational (key-value, document, graph, etc.)  |
| **Schema**               | Fixed schema with a predefined structure           | Schema-less or dynamic schema                      |
| **Scalability**          | Vertical scalability (adding power to a single server) | Horizontal scalability (adding more servers)        |
| **Query Language**       | Structured Query Language (SQL)                    | Varies (e.g., JSON, query APIs, etc.)              |
| **Data Integrity**       | Strong ACID properties (Atomicity, Consistency, Isolation, Durability) | BASE properties (Basically Available, Soft state, Eventual consistency) |
| **Examples**             | MySQL, PostgreSQL, Oracle                          | MongoDB, Cassandra, Redis                          |
| **Use Cases**            | Complex queries, multi-row transactions            | Big data, real-time applications, distributed data |

# Does SQL support programming language features?

It is true that SQL is a language, but it does not support programming as it is not a programming language; it is a command language. We do not have conditional statements in SQL like for loops or if..else; we only have commands that we can use to query, update, delete, etc., data in the database. SQL allows us to manipulate data in a database.

# Data Types in SQL

| Data Type  | Description                                             | Example                 |
|------------|---------------------------------------------------------|-------------------------|
| INT        | Integer value                                           | 123                     |
| VARCHAR(n) | Variable-length character string with a maximum of 'n' characters | 'John Doe'              |
| DATE       | Date value                                              | '2021-10-15'            |
| FLOAT      | Floating-point number                                   | 3.14                    |
| BOOLEAN    | Logical value (True/False)                              | True                    |
| CHAR(n)    | Fixed-length character string with a length of 'n' characters | 'ABC'                   |
| TEXT       | Variable-length text data                               | 'Lorem ipsum...'        |
| DECIMAL(p, s) | Exact numeric value with a precision of 'p' total digits and 's' digits after the decimal point | 12.345                  |


# Difference between CHAR and VARCHAR2 datatype in SQL

| Feature                  | CHAR                                     | VARCHAR2                                      |
|--------------------------|------------------------------------------|-----------------------------------------------|
| Length                   | Fixed length                             | Variable length                               |
| Usage                    | Used for character strings of fixed length | Used for character strings of variable length |
| Storage Example          | If defined as `CHAR(5)`, only strings of exactly 5 characters can be stored | If defined as `VARCHAR2(5)`, strings of length 1 to 5 can be stored |

# Types of SQL Commands
 
SQL commands can be categorized into the following types:

1. **Data Definition Language (DDL)**: DDL commands are used to define the structure of database objects such as tables, indexes, and views. Examples of DDL commands include CREATE, RENAME, TRUNCATE, ALTER, and DROP.

2. **Data Manipulation Language (DML)**: DML commands are used to manipulate data stored in the database. These commands include SELECT, INSERT, UPDATE, and DELETE.

3. **Data Control Language (DCL)**: DCL commands are used to control access to data stored in the database. Commands like GRANT and REVOKE fall under this category.

4. **Transaction Control Language (TCL)**: TCL commands are used to manage transactions within a database. Commands like COMMIT, ROLLBACK, and SAVEPOINT are part of TCL.

5. **Data Query Language (DQL)**: DQL commands are used to retrieve data from the database. The most common DQL command is SELECT.

# What do you mean by Data Manipulation Language?

Data Manipulation Language or DML is used to access or manipulate data in the database. It allows us to perform the following functions:

- Insert data or rows in a database
- Delete data from the database
- Retrieve or fetch data
- Update data in a database

# **What is a Schema?**

A schema in the context of a database is a blueprint or structure that defines the organization of data within the database. 

# What is a View in SQL?

A **View** in SQL is a virtual table that represents the result of a stored query. Unlike a real table, a view does not store data itself but rather provides a way to look at data from one or more tables in a structured and filtered manner. 

A view consists of rows and columns just like a regular table, but it is dynamically generated when queried. Views are particularly useful for:

- Simplifying complex queries: By creating a view, you can encapsulate complex joins and conditions, making it easier to work with data.
- Enhancing security: Views can restrict access to certain data by exposing only specific columns or rows based on conditions.
- Providing a consistent interface: Even if the underlying table structures change, views can be maintained to provide a consistent data interface to users and applications.

For example, you can create a view by selecting fields from one or more tables in the database. The view can include all the rows of a table or filter specific rows based on conditions. This allows you to tailor the data presentation according to your needs without altering the actual tables.

# What are Table and Field?

## Table

A **Table** in a database is a structured set of data organized into rows and columns. Each row, known as a **record**, represents a single entry in the table, while each column, known as a **field**, represents a specific attribute or piece of data associated with each record. Tables are fundamental building blocks in a database, and they hold the actual data that users interact with.

In MS SQL Server, tables are designated within the database and are often associated with a specific schema, which is a logical grouping of database objects. For example, in a table representing employees, each row might correspond to a different employee, and each column might represent different attributes like employee ID, name, department, and salary.

## Field

A **Field** in a database management system (DBMS) refers to a single piece of information from a record. It is the smallest unit of data that can be accessed within a table. Fields are the columns in a table, and each field in a table typically contains data of a specific data type, such as integers, text, or dates.

For instance, in an "Employees" table, the "Name" field would store the name of each employee, while the "Salary" field would store their respective salaries. Fields define the structure of the data stored in a table and are critical for organizing and retrieving data efficiently.

# What is a Default Constraint?

A **DEFAULT constraint** in SQL is used to automatically assign a predefined value to a column when a new record is inserted into a table, and no specific value is provided for that column. This ensures that a column has a default, consistent value even when it is left out during an INSERT operation.

The DEFAULT constraint is particularly useful for setting up default values that should apply across all new records, such as assigning a default status, date, or other fixed values. 

For example, if you have a table for orders and you want the "order_status" column to default to "Pending" when a new order is created without specifying a status, you would use the DEFAULT constraint:

```sql
CREATE TABLE Orders (
    order_id INT,
    customer_id INT,
    order_date DATE,
    order_status VARCHAR(20) DEFAULT 'Pending'
);
```
# Keys in SQL

In SQL, keys are crucial for defining relationships between tables and ensuring data integrity. Below are the different types of keys used in SQL:

## 1. Primary Key

The **Primary Key** is a unique identifier for each record in a table. It ensures that each record can be uniquely identified. A table can have only one primary key, and it must contain unique values. The primary key column(s) cannot contain `NULL` values.


## 2.Foreign Key

The Foreign Key is a column (or a set of columns) in one table that uniquely identifies rows in another table. It establishes a relationship between two tables. The foreign key in the child table references the primary key in the parent table.

# SQL Table Example with Foreign Key

## **Users Table**

| **Column**   | **Data Type** | **Description**        |
|--------------|---------------|------------------------|
| `user_id`    | INT           | Primary Key, Auto Increment |
| `username`   | VARCHAR(50)   | Username of the user   |
| `email`      | VARCHAR(100)  | Email address          |
| `created_at` | TIMESTAMP     | Account creation date  |

## **Orders Table**

| **Column**    | **Data Type** | **Description**               |
|---------------|---------------|-------------------------------|
| `order_id`    | INT           | Primary Key, Auto Increment    |
| `user_id`     | INT           | Foreign Key (References `user_id` in Users table) |
| `order_date`  | TIMESTAMP     | Date of the order             |
| `total_amount`| DECIMAL(10, 2)| Total amount of the order     |

## 3. Unique Key

The Unique Key constraint ensures that all values in a column are different. It is similar to the primary key, except a table can have multiple unique keys, and they can contain NULL values (but each NULL is considered unique).

# SQL Operators

## 1. `=` (Equal)
- Checks if the values of two expressions are equal.

## 2. `!=` or `<>` (Not Equal)
- Checks if the values of two expressions are not equal.

## 3. `>` (Greater Than)
- Checks if the value on the left is greater than the value on the right.

## 4. `<` (Less Than)
- Checks if the value on the left is less than the value on the right.

## 5. `>=` (Greater Than or Equal To)
- Checks if the value on the left is greater than or equal to the value on the right.

## 6. `<=` (Less Than or Equal To)
- Checks if the value on the left is less than or equal to the value on the right.

## 7. `AND`
- Combines two conditions and returns TRUE if both conditions are TRUE.

## 8. `OR`
- Combines two conditions and returns TRUE if at least one of the conditions is TRUE.

## 9. `NOT`
- Negates a condition, returning TRUE if the condition is FALSE.

## 10. `BETWEEN`
- Selects values within a specified range (inclusive of the start and end values).

## 11. `IN`
- Checks if a value matches any value in a list of values.

## 12. `LIKE`
- Searches for a specified pattern in a column (often used with `%` and `_` wildcards).

## 13. `IS NULL`
- Checks if a column contains a NULL value.

## 14. `IS NOT NULL`
- Checks if a column does not contain a NULL value.

## 15. `+` (Addition)
- Adds two numbers.

## 16. `-` (Subtraction)
- Subtracts the second number from the first.

## 17. `*` (Multiplication)
- Multiplies two numbers.

## 18. `/` (Division)
- Divides the first number by the second.

## 19. `%` (Modulo)
- Returns the remainder when dividing two numbers.

## 20. `||` or `+` (Concatenation)
- Concatenates two or more strings into one string (syntax varies between SQL dialects).

# SQL Functions

## 1. COUNT()
- Returns the total number of rows in a table or the number of non-NULL values in a specific column.

## 2. SUM()
- Returns the total sum of a numeric column.

## 3. AVG()
- Returns the average value of a numeric column.

## 4. MIN()
- Returns the smallest value in a column.

## 5. MAX()
- Returns the largest value in a column.

## 6. ROUND()
- Rounds a numeric value to a specified number of decimal places.

## 7. LENGTH()
- Returns the length of a string (in characters).

## 8. CONCAT()
- Concatenates two or more strings into one string.

## 9. NOW()
- Returns the current date and time.

## 10. UPPER()
- Converts all characters in a string to uppercase.

## 11. LOWER()
- Converts all characters in a string to lowercase.

## 12. COALESCE()
- Returns the first non-NULL value from a list of expressions.

## 13. ISNULL()
- Checks if an expression is NULL and returns a specified value if it is.

## 14. LEFT() / RIGHT()
- Returns a specified number of characters from the left or right side of a string.

## 15. SUBSTRING()
- Extracts a portion of a string based on position and length.

## 16. REPLACE()
- Replaces all occurrences of a specified substring within a string with another substring.

## 17. ABS()
- Returns the absolute (positive) value of a number.

## 18. FLOOR() / CEIL()
- `FLOOR()` rounds a number down to the nearest integer, while `CEIL()` rounds it up to the nearest integer.


# SQL Constraints

## 1. PRIMARY KEY
- Ensures that a column or combination of columns has unique values and cannot contain NULL. It uniquely identifies each record in a table.

## 2. FOREIGN KEY
- A column (or combination of columns) that creates a relationship between two tables. It enforces referential integrity by ensuring that the value in the foreign key column must exist in the referenced table.

## 3. UNIQUE
- Ensures that all values in a column are distinct, preventing duplicate values in the column.

## 4. NOT NULL
- Prevents NULL values from being inserted into a column, ensuring that a field always contains a value.

## 5. CHECK
- Ensures that all values in a column satisfy a specific condition or expression.

## 6. DEFAULT
- Assigns a default value to a column if no value is provided during the insertion of a new record.

## 7. AUTO_INCREMENT
- Automatically generates a unique number for the column, usually used for primary keys.

## 8. INDEX
- Improves the speed of data retrieval operations on a table by creating an index on one or more columns.
