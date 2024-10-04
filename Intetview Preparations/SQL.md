
# Important MySQL Topics for Interviews
| Feature             | SQL (Relational Database)                             | NoSQL (Non-Relational Database)                     |
|---------------------|-------------------------------------------------------|-----------------------------------------------------|
| Data Model          | Structured data with predefined schema (tables)       | Unstructured, semi-structured, or structured data   |
| Schema              | Fixed schema, data must adhere to the defined schema  | Dynamic schema, flexible data formats               |
| Scalability         | Vertical scalability (adding more resources to a single server) | Horizontal scalability (distributing data across multiple servers) |
| Transactions        | ACID properties (Atomicity, Consistency, Isolation, Durability) | Typically follows BASE model (Basically Available, Soft state, Eventually consistent) |
| Query Language      | Structured Query Language (SQL)                       | Varies (e.g., MongoDB uses JSON-like queries, Cassandra uses CQL) |
| Performance         | Better for complex queries and transactions           | Optimized for high-volume read/write operations and scalability |
| Examples            | MySQL, PostgreSQL, Oracle                             | MongoDB, Cassandra, Couchbase, DynamoDB             |
| Use Cases           | Traditional applications (e.g., banking, ERP systems) | Big data, real-time analytics, content management, IoT |

# SQL vs NoSQL: Use Cases

Understanding when to use SQL (Relational Databases) versus NoSQL (Non-Relational Databases) is crucial for designing efficient and scalable applications. Below are common use cases for each, along with examples to help illustrate their applications.

## SQL (Relational Databases) Use Cases

| **Use Case**                        | **Description**                                                                                 | **Examples**                         |
|-------------------------------------|-------------------------------------------------------------------------------------------------|--------------------------------------|
| **Transactional Systems**           | Systems that require reliable transactions with ACID properties to ensure data integrity during operations like banking, order processing, and inventory management. | **Banking Systems**, **ERP Systems**, **Order Management Systems** |
| **Enterprise Resource Planning (ERP)** | Managing and integrating important parts of a business, such as inventory, order management, accounting, human resources, and CRM. | **SAP ERP**, **Oracle ERP**          |
| **Customer Relationship Management (CRM)** | Handling structured data related to customer interactions, sales tracking, and customer support. | **Salesforce**, **Microsoft Dynamics** |
| **Content Management Systems (CMS)** | Managing structured content with predefined relationships, suitable for applications like websites and blogs. | **WordPress**, **Drupal**            |
| **E-commerce Platforms**            | Managing product catalogs, user orders, inventory, and transactions where data integrity and consistency are critical. | **Shopify**, **Magento**             |
| **Data Warehousing and Business Intelligence** | Storing and analyzing large volumes of structured data for reporting and analytics. | **Amazon Redshift**, **Google BigQuery** |

### Why Choose SQL for These Use Cases?
- **Structured Data:** Well-suited for applications requiring a fixed schema and structured data.
- **Complex Queries:** Supports complex joins and transactions, making it ideal for applications that need to perform intricate queries.
- **Data Integrity:** Ensures data consistency and integrity through ACID compliance.

## NoSQL (Non-Relational Databases) Use Cases

| **Use Case**                      | **Description**                                                                                 | **Examples**                         |
|-----------------------------------|-------------------------------------------------------------------------------------------------|--------------------------------------|
| **Big Data and Real-Time Analytics** | Handling large volumes of unstructured or semi-structured data with the ability to scale horizontally. | **Hadoop**, **MongoDB**              |
| **Content Management and Delivery** | Managing diverse content types with flexible schemas, allowing for rapid changes and scalability. | **Couchbase**, **Contentful**        |
| **Internet of Things (IoT) Applications** | Managing high-velocity data streams from numerous devices, requiring scalability and real-time processing. | **Cassandra**, **DynamoDB**          |
| **Social Networks**               | Managing interconnected data with high read and write throughput, supporting features like user profiles, posts, and relationships. | **Neo4j**, **Cassandra**             |
| **Mobile Applications**           | Supporting flexible data models to accommodate evolving app requirements and rapid development cycles. | **Firebase**, **MongoDB**            |
| **Real-Time Web Applications**    | Providing low-latency data access for features like live chats, gaming, and real-time feeds.     | **Redis**, **MongoDB**               |
| **Geospatial Applications**       | Storing and querying geospatial data efficiently for location-based services.                    | **Elasticsearch**, **MongoDB**       |
| **Caching and Session Management**| Offering fast in-memory data storage to manage user sessions and cache frequently accessed data. | **Redis**, **Memcached**             |
| **Flexible Content Storage**      | Storing varied and evolving data structures without the need for a fixed schema.                 | **Document Stores (e.g., MongoDB)**  |
| **Log and Event Data Storage**    | Collecting and analyzing logs or event data in real-time for monitoring and alerting.            | **Elasticsearch**, **Apache Kafka**  |

### Why Choose NoSQL for These Use Cases?
- **Scalability:** Designed to scale horizontally, making them ideal for applications that need to handle large amounts of data and high traffic.
- **Flexible Schemas:** Allow for flexible and dynamic data models, which is beneficial for applications with evolving data requirements.
- **Performance:** Optimized for specific data access patterns, providing high performance for read/write operations.
- **Variety of Data Models:** Supports various data models like document, key-value, column-family, and graph, catering to different application needs.

## Summary Table

For a quick overview, here's a summary table comparing SQL and NoSQL use cases:

| **Use Case**                      | **SQL Databases**                                        | **NoSQL Databases**                                  |
|-----------------------------------|----------------------------------------------------------|------------------------------------------------------|
| **Transactional Systems**         | Ideal for banking, ERP, and order processing             | Less suited for complex transactions                 |
| **Enterprise Resource Planning**  | Supports structured data and complex queries             | Not typically used for ERP systems                   |
| **Customer Relationship Management** | Manages structured customer data and relationships      | Can handle flexible customer data models             |
| **Content Management Systems**    | Suitable for structured content with predefined schemas  | Flexible schemas for dynamic content                 |
| **E-commerce Platforms**          | Ensures data integrity for products and transactions     | Scales to handle high traffic and user sessions       |
| **Big Data and Analytics**        | Limited scalability for massive datasets                 | Designed for handling large-scale, unstructured data  |
| **IoT Applications**              | May struggle with high-velocity data streams             | Optimized for high-throughput and real-time data      |
| **Social Networks**               | Can face scalability issues with interconnected data     | Excels in managing relationships and large-scale data |
| **Mobile Applications**           | Provides consistent data structures                      | Offers flexibility for rapid development and changes  |
| **Real-Time Web Applications**    | Not optimized for low-latency requirements               | Provides fast data access for real-time features      |
| **Geospatial Applications**       | Supports structured geospatial data                      | Efficiently handles geospatial queries and storage    |
| **Caching and Session Management**| Not ideal for in-memory data storage                     | Perfect for managing sessions and caching             |

## Choosing Between SQL and NoSQL

When deciding between SQL and NoSQL databases, consider the following factors:

- **Data Structure:** If your data is highly structured and relationships between entities are important, SQL is typically the better choice. If your data is unstructured or semi-structured, NoSQL offers more flexibility.
  
- **Scalability Needs:** For applications that require horizontal scalability to handle large volumes of data and high traffic, NoSQL databases are generally more suitable.
  
- **Transaction Requirements:** If your application demands strong transactional support with ACID compliance, SQL databases are preferable.
  
- **Development Speed and Flexibility:** NoSQL databases allow for rapid development and iteration, especially when the data model is expected to evolve over time.
  
- **Performance:** Consider the specific performance characteristics needed. NoSQL databases can offer superior performance for certain types of read and write operations.

Ultimately, the choice between SQL and NoSQL depends on the specific requirements and constraints of your project. In some cases, a hybrid approach using both types of databases might be the most effective solution.

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

# **What is a Schema?**
A schema in the context of a database is a blueprint or structure that defines the organization of data within the database. 

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

# What are Table and Field?

## Table

A **Table** in a database is a structured set of data organized into rows and columns. Each row, known as a **record**, represents a single entry in the table, while each column, known as a **field**, represents a specific attribute or piece of data associated with each record. Tables are fundamental building blocks in a database, and they hold the actual data that users interact with.

In MS SQL Server, tables are designated within the database and are often associated with a specific schema, which is a logical grouping of database objects. For example, in a table representing employees, each row might correspond to a different employee, and each column might represent different attributes like employee ID, name, department, and salary.

## Field

A **Field** in a database management system (DBMS) refers to a single piece of information from a record. It is the smallest unit of data that can be accessed within a table. Fields are the columns in a table, and each field in a table typically contains data of a specific data type, such as integers, text, or dates.

For instance, in an "Employees" table, the "Name" field would store the name of each employee, while the "Salary" field would store their respective salaries. Fields define the structure of the data stored in a table and are critical for organizing and retrieving data efficiently.

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


# What is an Index?

An **index** in SQL is a database object that improves the speed of data retrieval operations on a table. It works like the index of a book, allowing the database engine to find the desired data more quickly without scanning the entire table row by row. Indexes are created on columns of a table that are frequently used in `WHERE` clauses, joins, or sorting.


## How Indexes Work

When you create an index on a table, the database engine creates a **data structure** (usually a B-tree or hash) that holds the index information. This structure allows the database to quickly locate and retrieve data based on the indexed columns.

For example, when you query a table using an indexed column in the `WHERE` clause, the database engine uses the index to find the rows directly, instead of scanning every row in the table.

### Example of Creating an Index
```sql
CREATE INDEX idx_lastname ON employees(last_name);
```
This creates an index named `idx_lastname` on the `last_name` column of the `employees

## Types of Indexes
1. **Primary Index (Primary Key)**
   - Automatically created when a primary key is defined.
   - Ensures that the column(s) are unique and not null.
   - Provides fast access to the data using the primary key.

2. **Unique Index**
   - Enforces the uniqueness of the indexed column(s).
   - Can be created manually to ensure no duplicate values are allowed in a column, except for `NULL` values.

3. **Non-Unique Index**
   - An index that allows duplicate values in the indexed column(s).
   - Helps improve performance on columns used in queries but doesn't enforce uniqueness.

4. **Clustered Index**
   - Sorts and stores the rows of a table based on the indexed column(s).
   - Each table can have only one clustered index because it physically rearranges the table data.
   - Typically created by default on a primary key.

5. **Non-Clustered Index**
   - Does not alter the physical order of the table data.
   - Creates a separate structure that points to the table rows.
   - A table can have multiple non-clustered indexes.

6. **Composite Index**
   - An index that is created on multiple columns of a table.
   - Useful when queries use multiple columns in the `WHERE` clause or for sorting.
   - Example: `CREATE INDEX idx_name ON employees (first_name, last_name);`

7. **Full-Text Index**
   - Used for advanced text searching within columns that contain large textual data.
   - Provides more powerful search capabilities like searching for words, phrases, or forms of words.

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
## Benefits of Indexes
### Improved Query Performance
Indexes significantly speed up SELECT queries by reducing the amount of data scanned.
### Efficient Sorting
Indexes can help sort data more efficiently, improving query performance for ORDER BY clauses.
### Faster Joins
Indexes improve join performance, especially when joining large tables


## What is a Constraint?

A **constraint** in SQL is a rule enforced on a table's data to ensure its accuracy and integrity. Constraints are used to define specific rules for the data in a table. They help in maintaining the data quality by restricting the types of data that can be entered into a column. SQL constraints can be applied at the column or table level, and they ensure that data entered into the database meets certain criteria.

### 1. **NOT NULL Constraint**

- Ensures that a column cannot have a `NULL` value.
- It is used when a field is mandatory and must contain a valid value.
- **Example**: Ensuring that a user’s email field is always filled.

```sql
CREATE TABLE users (
    user_id INT,
    email VARCHAR(100) NOT NULL
);
```

###  2. **UNIQUE Constraint**

- Ensures that all the values in a column or set of columns are unique.
- No duplicate values are allowed.
- It can be applied to one or more columns.
- Example: Ensuring that usernames are unique in a system.
```sql
CREATE TABLE users (
    user_id INT,
    username VARCHAR(50) UNIQUE
);
```

###   3. **PRIMARY KEY Constraint**

- A combination of NOT NULL and UNIQUE. It uniquely identifies each record in a table.
- Each table can only have one primary key, which can consist of one or more columns.
- Example: Creating a primary key on the user_id column.
```sql
CREATE TABLE users (
    user_id INT PRIMARY KEY,
    username VARCHAR(50) UNIQUE
);
```

###   4. **FOREIGN KEY Constraint**

- Enforces a link between two tables by establishing a relationship between a column in one table and the primary key in another.
- It maintains referential integrity between the two tables.
- Example: Establishing a foreign key relationship between an orders table and a users table.
```sql
CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);
```

###    5. **CHECK Constraint**

- Ensures that all values in a column satisfy a specific condition.
- It is used to restrict the range of values for a column.
- Example: Restricting age to be greater than or equal to 18.
```sql
CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    age INT CHECK (age >= 18)
);
```

###     6. **DEFAULT Constraint**

- Assigns a default value to a column when no value is provided.
- Helps ensure that columns have values when inserting data.
- Example: Providing a default value for the status column.
```sql
CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    order_date DATE,
    status VARCHAR(20) DEFAULT 'pending'
);
```

### 7. AUTO_INCREMENT Constraint (MySQL specific)
- Automatically generates a unique number for a column when a new record is inserted.
- Typically used for primary key columns.
- Example: Automatically generating a user_id for new records.
```sql
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50)
);
```


# Keys in MySQL

Keys in MySQL are attributes or sets of attributes that help identify and maintain relationships between records in database tables. They ensure that data remains organized and helps in efficient data retrieval.

## 1. **Primary Key**

- A **primary key** is a unique identifier for each record in a table.
- It must contain unique values and cannot contain `NULL` values.
- Each table can only have one primary key, which may consist of a single column or multiple columns (composite key).
- **Example**:

```sql
CREATE TABLE users (
    user_id INT PRIMARY KEY,
    username VARCHAR(50)
);
```
## 2. Composite Key
- A composite key is a primary key made up of two or more columns. It uniquely identifies a record using a combination of values from multiple columns.
- It is useful when a single column is not sufficient to uniquely identify records.
-  **Example**:

```sql
CREATE TABLE orders (
    order_id INT,
    product_id INT,
    PRIMARY KEY (order_id, product_id)
);
```
## 3. Foreign Key
- A foreign key establishes a relationship between two tables by linking a column in one table to the primary key in another.
- It ensures referential integrity, meaning values in the foreign key column must match values in the primary key column of the referenced table.
- Example:
```sql
CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);
```
## 4. Unique Key
- A unique key ensures that all values in a column or group of columns are unique across the table.
- Unlike primary keys, a table can have multiple unique keys.
- It allows NULL values, but each non-null value must be unique.
- Example:
```sql
CREATE TABLE users (
    user_id INT,
    email VARCHAR(100) UNIQUE
);
```
## 5. Candidate Key
- A candidate key is a column or set of columns that can uniquely identify records in a table.
- Every table can have multiple candidate keys, but only one of them is selected as the primary key.
- Example: In a table, both user_id and email can be candidate keys because both uniquely identify records.

## 6. Alternate Key
- An alternate key is any candidate key that is not selected as the primary key.
- It still uniquely identifies records but is not used as the primary identifier.
- Example: If user_id is the primary key, then email can be an alternate key.

## 7. Super Key
- A super key is a set of one or more columns that can uniquely identify records in a table.
- A super key can include additional attributes beyond what is necessary to uniquely identify a record.
- Example: If a table has a user_id and email, then both user_id, or the combination of user_id and email, are super keys.



## What is Normalization?

**Normalization** is the process of structuring a relational database to reduce data redundancy and improve data integrity. It involves decomposing a database into smaller, manageable tables and establishing relationships among them to ensure efficient and consistent data storage.

## Types of Normal Forms
### 1. **First Normal Form (1NF)**

- A table is in **1NF** if:
  - All columns contain atomic (indivisible) values.
  - Each column must contain values of a single type.
  - Each column must have a unique name.
  - The order of the data does not matter.

### 2. **Second Normal Form (2NF)**
- A table is in **2NF** if:
  - It is already in 1NF.
  - All non-key attributes are fully functionally dependent on the primary key (no partial dependency).

### 3. **Third Normal Form (3NF)**

- A table is in **3NF** if:
  - It is already in 2NF.
  - There are no transitive dependencies (non-key attributes do not depend on other non-key attributes).

### 4. **Boyce-Codd Normal Form (BCNF)**

- A table is in **BCNF** if:
  - It is already in 3NF.
  - For every functional dependency (X → Y), X should be a super key.

### 5. **Fourth Normal Form (4NF)**

- A table is in **4NF** if:
  - It is already in BCNF.
  - It has no multi-valued dependencies (no attribute in a table should depend on another attribute).

### 6. **Fifth Normal Form (5NF)**

- A table is in **5NF** if:
  - It is already in 4NF.
  - It cannot be decomposed into any smaller tables without losing data.

### 7. **Domain-Key Normal Form (DKNF)**

- A table is in **DKNF** if:
  - It is based on the principle of constraints and domain integrity.
  - It requires that all constraints in the table be a consequence of the domain and key constraints.


# Aggregate Functions in SQL

Aggregate functions are used to perform calculations on multiple rows of a dataset and return a single value. They are often used in conjunction with the `GROUP BY` clause to summarize data. Here are some commonly used aggregate functions:

## Common Aggregate Functions

1. **COUNT()**
   - Counts the number of rows that match a specified condition.
   - **Example**:
     ```sql
     SELECT COUNT(*) AS total_users
     FROM users;
     ```
     This query returns the total number of users in the `users` table.

2. **SUM()**
   - Calculates the total sum of a numeric column.
   - **Example**:
     ```sql
     SELECT SUM(salary) AS total_salary
     FROM employees;
     ```
     This query returns the total salary of all employees in the `employees` table.

3. **AVG()**
   - Calculates the average value of a numeric column.
   - **Example**:
     ```sql
     SELECT AVG(age) AS average_age
     FROM users;
     ```
     This query returns the average age of users in the `users` table.

4. **MAX()**
   - Returns the maximum value from a column.
   - **Example**:
     ```sql
     SELECT MAX(price) AS highest_price
     FROM products;
     ```
     This query returns the highest price of products in the `products` table.

5. **MIN()**
   - Returns the minimum value from a column.
   - **Example**:
     ```sql
     SELECT MIN(order_date) AS earliest_order
     FROM orders;
     ```
     This query returns the date of the earliest order in the `orders` table.

## Using Aggregate Functions with GROUP BY

Aggregate functions can be used with the `GROUP BY` clause to group rows that have the same values in specified columns.

### Example:
```sql
SELECT department_id, COUNT(*) AS total_employees, AVG(salary) AS average_salary
FROM employees
GROUP BY department_id;
```

# SQL Clauses

SQL clauses are components of SQL statements that specify conditions, filters, and operations on data. They play a crucial role in retrieving, modifying, and managing data in a database.

## Common SQL Clauses

### 1. **SELECT Clause**

- Used to specify the columns to be retrieved from a table.
- You can use it to select one or more columns.

**Example**:
```sql
SELECT column1, column2 FROM table_name;
```

### 2. FROM Clause
- Specifies the table from which to retrieve the data.
- It can include joins to combine data from multiple tables.
- Example:
```sql
SELECT * FROM employees;
```

### 3. WHERE Clause
- Filters the results based on specified conditions.
- Only rows that meet the conditions will be returned.
- Example:
```sql
SELECT * FROM employees WHERE department = 'Sales';
```

### 4. ORDER BY Clause
- Sorts the result set based on one or more columns.
- You can specify ascending (ASC) or descending (DESC) order.
- Example:
```sql
SELECT * FROM employees ORDER BY last_name ASC;
```
### 5. GROUP BY Clause
- Groups rows that have the same values in specified columns into summary rows.
- Often used with aggregate functions like COUNT(), SUM(), etc.
- Example:
```sql
SELECT department, COUNT(*) FROM employees GROUP BY department;
```
### 6. HAVING Clause
- Filters groups created by the GROUP BY clause based on specified conditions.
- It is used in conjunction with aggregate functions.
- Example:
```sql
SELECT department, COUNT(*) AS employee_count 
FROM employees 
GROUP BY department 
HAVING COUNT(*) > 5;
```
### 8. LIMIT Clause
- Specifies the maximum number of records to return in the result set.
- Useful for pagination and controlling the amount of data retrieved.
- Example:
``` sql
SELECT * FROM employees LIMIT 10;
```
# Set Operations in SQL

Set operations in SQL are used to combine the results of two or more `SELECT` statements. The most commonly used set operations are `UNION`, `INTERSECT`, and `EXCEPT`. These operations help to manipulate and analyze data from multiple tables or queries.

## Common Set Operations

### 1. **UNION**

- Combines the results of two or more `SELECT` statements and removes duplicate rows.
- All `SELECT` statements must have the same number of columns with similar data types.

**Example**:
```sql
SELECT city FROM customers
UNION
SELECT city FROM suppliers;
```
This query returns a distinct list of cities from both the customers and suppliers tables.

### 2. UNION ALL
- Similar to UNION, but includes all duplicates in the result set.
- It is faster than UNION because it does not remove duplicates.
- Example:
```sql
SELECT city FROM customers
UNION ALL
SELECT city FROM suppliers;
```
This query returns a list of all cities from both tables, including duplicates.

### 3. INTERSECT
- Returns only the rows that are common to both SELECT statements.
- Both SELECT statements must have the same number of columns with similar data types.
- Example:
```sql
SELECT city FROM customers
INTERSECT
SELECT city FROM suppliers;
```
This query returns a list of cities that are present in both the customers and suppliers tables.


# Triggers in SQL

A **trigger** in SQL is a special type of stored procedure that automatically executes (or "fires") in response to specific events on a particular table or view. Triggers are commonly used to enforce business rules, maintain data integrity, and automatically perform actions based on data changes.

## Key Aspects of Triggers

### Types of Triggers

1. **BEFORE Triggers**
   - Executes before an `INSERT`, `UPDATE`, or `DELETE` operation on a table.
   - Used to validate or modify data before it is committed to the database.

   **Example**:
   ```sql
   CREATE TRIGGER before_insert_user
   BEFORE INSERT ON users
   FOR EACH ROW
   BEGIN
       SET NEW.created_at = NOW();
   END;
    ```
2.   **AFTER Triggers**

- Executes after an INSERT, UPDATE, or DELETE operation on a table.
- Used for auditing, logging changes, or performing additional actions after data modification.
- Example:
```sql
CREATE TRIGGER after_update_user
AFTER UPDATE ON users
FOR EACH ROW
BEGIN
    INSERT INTO user_logs (user_id, action, timestamp)
    VALUES (NEW.id, 'Updated', NOW());
END;
```
This trigger logs each update to the users table in a separate user_logs table.
## When to Use Triggers
- Data Validation: Ensure that data meets specific criteria before being inserted or updated.
- Auditing: Automatically log changes to important tables for tracking purposes.
- Enforcing Business Rules: Implement complex business logic that cannot be easily expressed using constraints.

# Stored Procedures in SQL

A **stored procedure** is a set of precompiled SQL statements that can be executed as a single unit. Stored procedures are stored in the database and can be invoked by applications or users, making them an essential part of database management and application development.

### Benefits of Using Stored Procedures

1. **Modularity**
   - Stored procedures promote modular programming by allowing you to encapsulate complex SQL logic into a single callable routine. This makes code easier to read and maintain.

2. **Performance**
   - Since stored procedures are precompiled, they can execute faster than individual SQL statements sent to the database server. This reduces the amount of information sent over the network.

3. **Security**
   - Stored procedures can enhance security by restricting direct access to the underlying tables. Users can be granted permission to execute the stored procedure without needing access to the actual tables.

4. **Code Reusability**
   - Stored procedures allow you to write SQL code once and reuse it in multiple applications or modules, reducing redundancy.

5. **Transaction Management**
   - They can handle transactions more effectively, allowing for operations to be rolled back in case of an error.

### Creating a Stored Procedure

To create a stored procedure, you use the `CREATE PROCEDURE` statement. Here’s the syntax:


```sql
CREATE PROCEDURE GetUserInfo(IN user_id INT)
BEGIN
    SELECT * FROM users WHERE id = user_id;
END;
```
- To execute a stored procedure, you use the CALL statement:

```sql
CALL GetUserInfo(1);
```

# ACID
- ACID is an acronym that describes the key properties of database transactions. Each property ensures the reliability and integrity of the database.

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

