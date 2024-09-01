# SQL Interview Questions and Answers for Freshers

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
# What is a Database?

A Database is defined as a structured form of data storage in a computer or a collection of data in an organized manner and can be accessed in various ways. It is also the collection of schemas, tables, queries, views, etc. Databases help us with easily storing, accessing, and manipulating data held on a computer. The Database Management System allows a user to interact with the database.
# Does SQL support programming language features?

It is true that SQL is a language, but it does not support programming as it is not a programming language; it is a command language. We do not have conditional statements in SQL like for loops or if..else; we only have commands that we can use to query, update, delete, etc., data in the database. SQL allows us to manipulate data in a database.
# Difference between CHAR and VARCHAR2 datatype in SQL

| Feature                  | CHAR                                     | VARCHAR2                                      |
|--------------------------|------------------------------------------|-----------------------------------------------|
| Length                   | Fixed length                             | Variable length                               |
| Usage                    | Used for character strings of fixed length | Used for character strings of variable length |
| Storage Example          | If defined as `CHAR(5)`, only strings of exactly 5 characters can be stored | If defined as `VARCHAR2(5)`, strings of length 1 to 5 can be stored |

# What do you mean by Data Definition Language?

Data Definition Language or DDL allows the execution of queries like CREATE, DROP, and ALTER. These are the queries that define the data.

# What do you mean by Data Manipulation Language?

Data Manipulation Language or DML is used to access or manipulate data in the database. It allows us to perform the following functions:

- Insert data or rows in a database
- Delete data from the database
- Retrieve or fetch data
- Update data in a database

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



