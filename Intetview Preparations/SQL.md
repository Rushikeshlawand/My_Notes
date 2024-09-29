# SQL Interview Questions and Answers for Freshers

# Important MySQL Topics for Interviews

## 1. SQL Basics
- **DDL (Data Definition Language)** – `CREATE`, `ALTER`, `DROP`, `TRUNCATE`
- **DML (Data Manipulation Language)** – `INSERT`, `UPDATE`, `DELETE`
- **DQL (Data Query Language)** – `SELECT`, `JOIN`, `GROUP BY`, `ORDER BY`
- **DCL (Data Control Language)** – `GRANT`, `REVOKE`
- **TCL (Transaction Control Language)** – `COMMIT`, `ROLLBACK`, `SAVEPOINT`

## 2. Data Types
- Numeric, String, Date and Time data types
- Difference between `CHAR` and `VARCHAR`
- Use of `TEXT`, `BLOB`

## 3. Joins and Unions
- Inner Join, Left Join, Right Join, Full Outer Join(not in SQL)
- Self Join
- Cross Join
- UNION and UNION ALL

## 4. Indexes
- Types of Indexes – Primary Key, Unique, Composite, Full-Text
- Index Performance, Advantages and Disadvantages

## 5. Normalization and Denormalization
- Normal Forms (1NF, 2NF, 3NF, BCNF)
- Advantages and use cases of normalization
- When to denormalize a database

## 6. Subqueries and Nested Queries
- Single Row Subquery vs Multiple Row Subquery
- Correlated Subqueries
- EXISTS and NOT EXISTS

## 7. Stored Procedures and Functions
- Syntax and differences between stored procedures and functions
- Use of `IN`, `OUT`, `INOUT` parameters
- Error Handling in Stored Procedures

## 8. Views
- Creating, Modifying, and Dropping Views
- Indexed Views
- View limitations

## 9. Triggers
- BEFORE and AFTER triggers
- Triggers for `INSERT`, `UPDATE`, `DELETE`
- Trigger limitations

## 10. Transactions
- **ACID Properties** (Atomicity, Consistency, Isolation, Durability)
- Transaction control with `COMMIT`, `ROLLBACK`, `SAVEPOINT`
- **Isolation Levels** – Read Uncommitted, Read Committed, Repeatable Read, Serializable
- **Locking mechanisms** – Shared Lock, Exclusive Lock

## 11. Optimization
- Query Optimization using `EXPLAIN`
- Index Optimization
- Query Caching
- Partitioning (Range, List, Hash, Key)

## 12. Database Design
- Primary Key vs Foreign Key
- Composite Keys
- One-to-One, One-to-Many, Many-to-Many relationships
- **Cascading Actions** (`ON DELETE CASCADE`, `ON UPDATE CASCADE`)

## 13. Security
- User Management (Creating Users, Granting Privileges, and Roles)
- Encryption techniques
- SQL Injection Prevention

## 14. Backup and Recovery
- Types of Backups – Logical (mysqldump), Physical
- Point-in-time Recovery
- Database Replication for High Availability

## 15. Replication
- Master-Slave Replication
- Multi-Master Replication
- Replication Failover and Delays

## 16. JSON Support in MySQL
- Storing and querying JSON data
- JSON functions (`JSON_EXTRACT`, `JSON_OBJECT`, etc.)

## 17. Full-Text Search
- `MATCH()` and `AGAINST()` functions
- Full-Text Index limitations

## 18. Common Interview Questions
- Complex queries (e.g., Find nth highest salary)
- Use of Window Functions (`RANK()`, `ROW_NUMBER()`, `LEAD()`, `LAG()`)


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
```sql
SELECT * FROM employees WHERE salary = 50000;
```

## 2. `!=` or `<>` (Not Equal)
- Checks if the values of two expressions are not equal.
```sql
SELECT * FROM employees WHERE salary != 50000;
```

## 3. `>` (Greater Than)
- Checks if the value on the left is greater than the value on the right.
```sql
SELECT * FROM employees WHERE salary > 50000;


## 4. `<` (Less Than)
- Checks if the value on the left is less than the value on the right.
```sql
SELECT * FROM employees WHERE salary < 50000;

```
## 5. `>=` (Greater Than or Equal To)
- Checks if the value on the left is greater than or equal to the value on the right.
```sql
SELECT * FROM employees WHERE salary >= 50000;

```
## 6. `<=` (Less Than or Equal To)
- Checks if the value on the left is less than or equal to the value on the right.
```sql
SELECT * FROM employees WHERE salary <= 50000;

```
## 7. `AND`
- Combines two conditions and returns TRUE if both conditions are TRUE.
```sql
SELECT * FROM employees WHERE salary > 50000 AND department = 'HR';

```
## 8. `OR`
- Combines two conditions and returns TRUE if at least one of the conditions is TRUE.
```sql
SELECT * FROM employees WHERE salary > 50000 OR department = 'HR';

```
## 9. `NOT`
- Negates a condition, returning TRUE if the condition is FALSE.
```sql
SELECT * FROM employees WHERE NOT salary > 50000;

```
## 10. `BETWEEN`
- Selects values within a specified range (inclusive of the start and end values).
```sql
SELECT * FROM employees WHERE salary BETWEEN 40000 AND 60000;

```
## 11. `IN`
- Checks if a value matches any value in a list of values.
```sql
SELECT * FROM employees WHERE department IN ('HR', 'Finance', 'IT');

```
## 12. `LIKE`
- Searches for a specified pattern in a column (often used with `%` and `_` wildcards).
```sql
SELECT * FROM employees WHERE name LIKE 'J%';

```
## 13. `IS NULL`
- Checks if a column contains a NULL value.
```sql
SELECT * FROM employees WHERE phone_number IS NULL;

```
## 14. `IS NOT NULL`
- Checks if a column does not contain a NULL value.
```sql
SELECT * FROM employees WHERE phone_number IS NOT NULL;

```
## 15. `+` (Addition)
- Adds two numbers.

```sql
SELECT name, salary + 5000 AS total_salary FROM employees;

```
## 16. `-` (Subtraction)
- Subtracts the second number from the first.
```sql
SELECT name, salary - 2000 AS net_salary FROM employees;

```
## 17. `*` (Multiplication)
- Multiplies two numbers.
```sql
SELECT name, salary * 1.10 AS increased_salary FROM employees;

```
## 18. `/` (Division)
- Divides the first number by the second.
```sql
SELECT name, salary / 2 AS part_time_salary FROM employees;

```
## 19. `%` (Modulo)
- Returns the remainder when dividing two numbers.
```sql
SELECT * FROM employees WHERE employee_id % 2 != 0;

```
## 20. `||` or `+` (Concatenation)
- Concatenates two or more strings into one string (syntax varies between SQL dialects).
```sql
SELECT first_name || ' ' || last_name AS full_name FROM employees;
```

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

# SQL Joins

SQL Joins are a fundamental concept in database management that allows you to combine rows from two or more tables based on a related column between them. Understanding joins is crucial for retrieving meaningful data from a relational database.

## Types of Joins

1. **INNER JOIN**
An INNER JOIN is a type of join that combines rows from two or more tables based on a related column between them. It returns only the rows where there is a match in both tables.

## Key Points:
Combines Rows: It pulls data from two tables where conditions are met.
Returns Matches Only: If there is no matching row in either table, that row will not appear in the results.
Common Use Case: Often used when you want to retrieve data that is related across different tables.

2. **LEFT JOIN (or LEFT OUTER JOIN)**
A LEFT JOIN is a type of join in SQL (Structured Query Language) that allows you to combine rows from two tables based on a related column. It includes all the records from the left table and the matched records from the right table. If there’s no match, NULL values are returned for columns from the right table.

## Key Points:
Left Table: The first (or left) table from which you want to retrieve all rows.
Right Table: The second (or right) table from which you want to retrieve matching rows.
NULL Values: If there's no match in the right table, the result will show NULL for those columns.

3. **RIGHT JOIN (or RIGHT OUTER JOIN)**
type of SQL operation that combines rows from two tables based on a related column between them, returning all the rows from the right table and the matched rows from the left table. If there is no match, NULL values are returned for columns from the left table.

## Key Points:
Tables Involved: You need two tables to perform a RIGHT JOIN.
Right Table: The table from which you want all rows.
Left Table: The table that may or may not have matching records.

4. **FULL JOIN (or FULL OUTER JOIN)**
A FULL JOIN (or FULL OUTER JOIN) is a type of join in SQL that combines the results of both a LEFT JOIN and a RIGHT JOIN. It returns all records from both tables, along with matched records where available. If there is no match, the result will contain NULLs for missing values.

## Key Points
Purpose: To retrieve all records from two tables, showing all matches and filling in gaps with NULLs.

5. **CROSS JOIN**
A CROSS JOIN is a type of join operation in SQL that combines every row from one table with every row from another table. This results in a Cartesian product of the two tables. Here’s a simple breakdown of what that means and how to use it:

## Key Points:

A CROSS JOIN produces a set that contains all possible combinations of rows from the tables involved.
If Table A has m rows and Table B has n rows, the result will have m * n rows.
Use Case:

CROSS JOIN is often used when you need to combine every record from one table with every record from another. This is less common than other types of joins but can be useful in specific scenarios, like creating combinations or in analyses involving every possible pair of entities.

6. **SELF JOIN**
A self join is a type of join in SQL where a table is joined with itself. This is useful when you want to compare rows within the same table or when the data is hierarchical. Here's how it works, step by step:

## Key Points to Understand Self Joins
Same Table: In a self join, you reference a single table twice, giving each instance a different alias. This allows you to treat it like two separate tables.

Use Cases: Common use cases include:

Finding relationships within the same dataset.
Hierarchical data, like employees and their managers.
Comparing rows for data integrity checks.

# ACID Properties in SQL Databases

ACID is an acronym that describes the key properties of database transactions. Each property ensures the reliability and integrity of the database.

## 1. Atomicity
- **Definition**: A transaction is treated as a single, indivisible unit.
- **Explanation**: This means that either all operations within the transaction are completed successfully, or none are. If any operation fails, the entire transaction is rolled back.
- **Example**: If a bank transfer involves subtracting money from one account and adding it to another, both actions must succeed or fail together. 

## 2. Consistency
- **Definition**: A transaction must leave the database in a valid state.
- **Explanation**: It ensures that any transaction will bring the database from one valid state to another, maintaining all predefined rules, such as constraints and cascades.
- **Example**: If a transaction violates a constraint (like attempting to insert a duplicate key), it will not complete, keeping the database consistent.

## 3. Isolation
- **Definition**: Transactions are executed in isolation from one another.
- **Explanation**: This ensures that transactions do not interfere with each other. Even if transactions are run concurrently, it will appear as if they are executed one after the other.
- **Example**: If two transactions are trying to read and write to the same data at the same time, isolation ensures that one transaction completes its process before the other begins.

## 4. Durability
- **Definition**: Once a transaction is committed, it will remain so, even in the event of a system failure.
- **Explanation**: This property ensures that completed transactions are saved permanently in the database.
- **Example**: After a successful transaction, even if there’s a power failure, the changes made by that transaction will persist in the database.

## Summary
Understanding ACID properties is crucial for designing reliable and robust database systems. Each property plays a significant role in maintaining the integrity of transactions, thereby enhancing data reliability.


# Understanding SQL Views

SQL Views are virtual tables that allow you to present data in a specific way without storing it physically in the database. They can simplify complex queries, improve security by restricting access to a subset of data, and encapsulate complex logic.

## Key Points

- **Virtual Table**: A view does not store data itself; it derives the data from the tables in the database.
- **Simplicity**: A view can encapsulate complex SQL logic, making it easier to retrieve data.
- **Security**: By using views, you can restrict access to certain data while allowing users to access the view.
- **Updatable Views**: Some views are updatable, meaning you can modify the underlying data through the view.

## Creating a View

To create a view, you use the `CREATE VIEW` statement followed by the view name and the SQL query that defines the view.

### Syntax

```sql
CREATE VIEW view_name AS
SELECT column1, column2, ...
FROM table_name
WHERE condition;
```

# Stored Procedure in SQL

## What is a Stored Procedure?

A **Stored Procedure** is a precompiled collection of SQL statements stored in a database, which can be executed as a single unit. Stored procedures can accept parameters, execute SQL logic, and return results, making them highly useful for repetitive tasks or complex operations.

Stored procedures help in modularizing code, improving performance by reducing the need to compile SQL statements multiple times, and enhancing security by limiting direct access to tables.

## Key Characteristics of Stored Procedures:
1. **Precompiled**: Stored procedures are compiled and stored in the database, improving performance when executed multiple times.
2. **Reusable**: Once written, a stored procedure can be executed as many times as needed without having to rewrite the SQL queries.
3. **Parameter Support**: They can accept input parameters and provide output parameters, making them flexible for different inputs.
4. **Security**: Stored procedures provide better control over data access. Users can be given permission to execute procedures without accessing the underlying tables directly.
5. **Modularization**: Procedures help in organizing database operations into separate logical units, improving code readability and maintainability.

## Advantages of Stored Procedures:
- **Improved Performance**: SQL code inside the procedure is compiled once and can be executed multiple times without recompiling.
- **Reduced Network Traffic**: Instead of sending multiple queries over the network, only a call to the procedure is made.
- **Enhanced Security**: By encapsulating the SQL logic, stored procedures can protect against SQL injection attacks.
- **Code Reusability**: Complex queries can be reused without rewriting.

---

## Syntax for Creating a Stored Procedure

```sql
CREATE PROCEDURE procedure_name
    [ (parameter datatype [IN | OUT | INOUT], ...) ]
BEGIN
    -- SQL statements
END;
```