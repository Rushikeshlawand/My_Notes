# Java

## Definition
Java is a high-level, object-oriented programming language developed by James Gosling at Sun Microsystems and released in 1995. It is designed to have as few implementation dependencies as possible, making it a write-once, run-anywhere (WORA) language. This means compiled Java code can run on all platforms that support Java without the need for recompilation.

## Real-Time Use
- **Mobile Applications:** Java is the primary language for developing Android apps.
- **Web Development:** Java is used for building server-side applications, handling requests, and managing databases. Frameworks like Spring and Hibernate make web development easier.
- **Enterprise Software:** Java is widely used in large organizations for building enterprise-grade applications due to its stability and scalability. Examples include banking systems and inventory management software.
- **Embedded Systems:** Java is also used in embedded systems, such as Blu-ray players and other consumer devices.


## Is Java Platform Independence

Yes, Java is a Platform Independent language.

Unlike many programming languages, the `javac` compiler in Java compiles the program into a bytecode or `.class` file. This file is independent of the software or hardware on which it was compiled, but it requires a preinstalled JVM (Java Virtual Machine) in the operating system for further execution of the bytecode.

Although the JVM is platform-dependent, the bytecode can be created on one system and executed on any other system, regardless of the hardware or software being used. This characteristic is what makes Java platform-independent.


## Top Java Features

- **Simple:** Java is easy to understand with a straightforward syntax.
- **Platform Independent:** Java programs can run on any software and hardware, producing the same result across different platforms.
- **Interpreted:** Java is both an interpreted and a compiler-based language.
- **Robust:** Java includes features like garbage collection and exception handling that contribute to its robustness.
- **Object-Oriented:** Java supports object-oriented programming concepts such as classes, objects, and the four pillars of OOP (Encapsulation, Inheritance, Polymorphism, Abstraction).
- **Secured:** Java allows for the sharing of applications without exposing the actual code, enhancing security.
- **High Performance:** Java is faster than many traditional interpreted languages.
- **Dynamic:** Java supports dynamic loading of classes and interfaces.
- **Distributed:** Java enables file access and method calls from any machine connected to the network.
- **Multithreaded:** Java can manage multiple tasks simultaneously by using multiple threads.
- **Architecture Neutral:** Java is not dependent on the underlying hardware architecture.

# Different Data Types in Java

## Primitive Data Types

Primitive data types are basic types that hold single values and have no special methods or properties. There are 8 primitive data types in Java:

| **Data Type** | **Description**                              | **Size** | **Range**                                             |
|---------------|----------------------------------------------|----------|-------------------------------------------------------|
| `boolean`     | Stores a value of `true` or `false`          | N/A      | `true` or `false`                                     |
| `byte`        | Stores an 8-bit signed two’s complement integer | 1 byte   | -128 to 127                                           |
| `char`        | Stores a single 16-bit Unicode character      | 2 bytes  | 0 to 65,535 (Unicode values)                         |
| `short`       | Stores a 16-bit signed two’s complement integer | 2 bytes  | -32,768 to 32,767                                     |
| `int`         | Stores a 32-bit signed two’s complement integer | 4 bytes  | -2,147,483,648 to 2,147,483,647                       |
| `long`        | Stores a 64-bit signed two’s complement integer | 8 bytes  | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| `float`       | Stores a single-precision 32-bit IEEE 754 floating-point | 4 bytes  | Approximately ±3.40282347E+38 (6-7 decimal places)   |
| `double`      | Stores a double-precision 64-bit IEEE 754 floating-point | 8 bytes  | Approximately ±1.79769313486231570E+308 (15-16 decimal places) |

## Non-Primitive Data Types

Non-primitive data types are reference types that hold references to objects rather than the actual values. They include:

| **Data Type** | **Description**                              |
|---------------|----------------------------------------------|
| `String`      | Represents a sequence of characters.        |
| `Array`       | Holds multiple values of the same type.     |
| `Class`       | Defines a blueprint for objects.            |
| `Object`      | The base class for all classes.              |
| `Interface`   | Defines methods that can be implemented by classes. |

### Explanation

- **Primitive Data Types:** They are predefined by the language and are not objects. They store data directly and have fixed sizes and ranges.
  
- **Non-Primitive Data Types:** They are created by the user and can store complex data. They hold references to objects and can have methods and properties.


## Types of Java Applications

- **Console-Based Applications:** Applications that run in a command-line interface (CLI) without a graphical user interface (GUI). They interact with users through text-based input and output.

- **GUI Applications:** Applications with a graphical user interface (GUI) that allow users to interact with the software through graphical elements like windows, buttons, and icons. Java provides libraries like Swing and JavaFX for building GUI applications.

- **Web Applications (Servlet-Based):** Applications that run on a web server and are accessed through a web browser. Java Servlets and JavaServer Pages (JSP) are commonly used for developing web applications.

- **Desktop Applications:** Standalone applications that run on a desktop or laptop computer. They can be developed using Java Swing, JavaFX, or other GUI libraries.

- **Mobile Applications:** Applications designed to run on mobile devices, such as smartphones and tablets. Java is used for Android app development.

- **Database Applications (JDBC):** Applications that interact with databases using Java Database Connectivity (JDBC). JDBC provides a standard API for connecting to and manipulating databases from Java applications.

- **Multithreaded Applications:** Applications that perform multiple tasks simultaneously by utilizing threads. Java's built-in support for multithreading allows developers to create applications that can handle concurrent operations.

- **Network Applications (Server-Client):** Applications that communicate over a network, where one application acts as a server and another as a client. Java provides libraries and APIs for network programming to create server-client applications.
## Components of Java

| **Component** | **Description**                                                                                                                                                                                                                                                                     |
|---------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **JDK**       | The Java Development Kit (JDK) is a comprehensive development environment that includes all essential tools, libraries, and documentation for Java development. It encompasses the JRE and additional tools like the Java compiler (`javac`), debugger (`jdb`), and various utilities. |
| **JRE**       | The Java Runtime Environment (JRE) is a software bundle that provides the necessary runtime libraries, class libraries, and JVM implementation to execute Java applications. It offers the runtime environment required for running Java programs but lacks development tools.         |
| **JVM**       | The Java Virtual Machine (JVM) is a virtual machine that executes compiled Java bytecode, allowing Java programs to run independently across different hardware and operating systems. It handles memory management, garbage collection, and bytecode interpretation or JIT compilation.  |


## What is JIT?

**JIT (Just-in-Time) Compiler** is a part of the JRE (Java Runtime Environment) designed to enhance the performance of Java applications during runtime. Here’s how it works:

1. **Source Code Compilation:** The Java source code is first compiled into bytecode using the `javac` compiler.
2. **Bytecode Processing:** The bytecode is then passed to the JVM (Java Virtual Machine).
3. **JIT Compilation:** JIT, which is a part of the JVM, compiles the bytecode into native machine code at runtime.
4. **Method Invocation:** JIT is activated when a method is invoked. Once a method is compiled by JIT, the JVM directly calls the compiled machine code instead of interpreting the bytecode.
5. **Performance Improvement:** By calling the compiled code directly, JIT increases the performance and speed of Java applications.

This process allows Java applications to run faster and more efficiently by reducing the overhead of interpreting bytecode during execution.

## What is a Classloader?

A **classloader** is a component of the JRE (Java Runtime Environment). Its primary function is to dynamically load Java classes and interfaces into the JVM (Java Virtual Machine) during the execution of bytecode or .class files. 

### Key Points:
- **Dynamic Loading:** Classloaders load classes and interfaces at runtime, rather than at compile-time.
- **Independence from Files:** The Java runtime system does not need to know about the underlying files and file systems due to the classloading mechanism.


## Comparison of Java Access Modifiers

| **Modifier** | **Same Class** | **Same Package** | **Subclass** | **Different Package** |
|--------------|----------------|------------------|--------------|-----------------------|
| **public**   | Yes            | Yes              | Yes          | Yes                   |
| **protected**| Yes            | Yes              | Yes          | No                    |
| **default**  | Yes            | Yes              | No           | No                    |
| **private**  | Yes            | No               | No           | No                    |

### Explanation

- **`public`**: 
  - Accessible from any class, regardless of package.
  - Used when you want the member to be accessible from anywhere.

- **`protected`**: 
  - Accessible within the same package and by subclasses (even if they are in different packages).
  - Used when you want the member to be accessible within the package and by subclasses.

- **`default`** (no modifier): 
  - Also known as package-private.
  - Accessible only within the same package.
  - Used when you want the member to be accessible only within the package.

- **`private`**: 
  - Accessible only within the same class.
  - Used when you want to restrict access to the member from outside the class.

# Types of Operators in Java

Java provides various types of operators to perform different operations. Here’s a breakdown of the different operators available:

| **Operator Type**      | **Operators**                                | **Description**                                      |
|------------------------|----------------------------------------------|------------------------------------------------------|
| **Arithmetic Operators** | `+`, `-`, `*`, `/`, `%`                     | Used for mathematical operations.                    |
| **Unary Operators**    | `+`, `-`, `++`, `--`, `!`                   | Operates on a single operand to perform operations such as increment, decrement, and logical negation. |
| **Assignment Operator**| `=`, `+=`, `-=`, `*=`, `/=`, `%=`           | Used to assign values to variables. Includes compound assignment operators. |
| **Relational Operators** | `==`, `!=`, `<`, `>`, `<=`, `>=`           | Used to compare values and determine relational conditions. |
| **Logical Operators**  | `&&`, `||`, `!`, `&`, `^`                   | Used to perform logical operations. `&&` and `||` are logical AND and OR, while `&` and `^` are bitwise operations that can also act as logical operators. |
| **Ternary Operator**   | `? :`                                       | A shorthand for `if-else` statement. It evaluates a boolean expression and returns one of two values based on the result. |
| **Bitwise Operators**  | `&`, `|`, `^`, `~`, `<<`, `>>`, `>>>`       | Used for operations on bits and binary numbers. Includes bitwise AND, OR, XOR, NOT, and shift operations. |
| **Shift Operators**    | `<<`, `>>`, `>>>`                           | Used to shift bits to the left or right. |
| **Instanceof Operator**| `instanceof`                                | Tests whether an object is an instance of a specific class or subclass. |

### Summary

- **Arithmetic Operators** perform basic mathematical operations.
- **Unary Operators** operate on a single operand to perform increment, decrement, and logical negation.
- **Assignment Operators** assign values to variables and include compound assignment operators.
- **Relational Operators** compare two values and return a boolean result.
- **Logical Operators** perform logical operations on boolean values and bits.
- **Ternary Operator** provides a concise way to perform conditional expressions.
- **Bitwise Operators** manipulate individual bits of integer types.
- **Shift Operators** shift bits to the left or right.
- **Instanceof Operator** checks the type of an object at runtime.


## Explain `public static void main(String args[])` in Java

In Java, the entry point of a program is the `main` method, declared as `public static void main(String args[])`. Each part of this declaration has a specific meaning:

- **public:** This is an access modifier that makes the `main` method accessible from outside the class. It is necessary for the Java Virtual Machine (JVM) to invoke the `main` method from outside the class, as it is not called by other methods within the class.

- **static:** This keyword means that the `main` method can be called without creating an instance of the class. This is important because the JVM needs to call the `main` method directly, without needing to instantiate the class first, thus avoiding unnecessary memory allocation.

- **void:** This keyword specifies that the `main` method does not return any value. The `main` method is designed to execute the program and does not need to return anything to the caller.

- **main:** This is the name of the method and signifies that it is the main entry point of the program. The JVM looks for this specific method signature to start the execution of the program.

- **String args[]:** This is an array of `java.lang.String` objects that stores command-line arguments passed to the program. It allows the program to accept input from the command line when it is executed.

## What Will Happen if We Don't Declare the `main` Method as `static`?

If you declare the `main` method without using the `static` keyword, the program will not behave as expected. Here’s why:

- **Non-Static Main Method:** If the `main` method is not declared as `static`, it will not be recognized as the entry point of the Java application by the JVM (Java Virtual Machine). As a result, the JVM will not be able to invoke this method to start the execution of the program.
  
- **Compilation:** You can declare the `main` method without `static` and compile it without errors. However, you won’t be able to run the program as expected because the JVM relies on the `main` method being `static` to start the program.

### Example

```java
public class Example {
    public void main(String[] args) {
        System.out.println("This will not be the entry point.");
    }
} 
```

## What Are Packages in Java?

Packages in Java are used to group related classes, interfaces, and other types into a single namespace. This organization provides access protection and helps manage namespaces effectively.

- **Purpose of Packages:**
  - **Prevent Naming Conflicts:** By grouping related types, packages help avoid naming collisions.
  - **Access Control:** Packages control access to classes and their members, allowing for more secure code.
  - **Easier Organization:** Packages make it easier to locate and use related classes and interfaces.

## What Are the Advantages of Packages in Java?

1. **Avoid Name Clashes:** Packages help in preventing naming conflicts by grouping related classes and interfaces into distinct namespaces.
2. **Easier Access Control:** Packages allow control over access to classes and members, providing better encapsulation and security.
3. **Hidden Classes:** Packages can include classes that are not visible outside the package, which helps in encapsulating implementation details.
4. **Improved Organization:** It becomes easier to locate and manage related classes and interfaces, enhancing code organization and maintainability.

## How Many Types of Packages Are There in Java?

1. **User-Defined Packages:**
   - Created by developers to organize their own classes and interfaces.
   - Example:
     ```java
     package com.example.myapp;
     
     public class MyClass {
         // Class contents
     }
     ```

2. **Built-In Packages:**
   - Provided by the Java Standard Library.
   - Examples include `java.lang`, `java.util`, `java.io`, etc.
   - These packages come with Java and offer a wide range of pre-defined classes and interfaces.

# Can We Declare Pointers in Java?

No, Java does not support pointers. Unlike languages such as C and C++, Java does not allow direct manipulation of memory addresses through pointers. This design decision enhances the security and stability of Java applications.

## Reasons for Lack of Pointer Support in Java

- **Security:** Pointers can lead to security vulnerabilities such as buffer overflows and unauthorized memory access. By not supporting pointers, Java reduces the risk of such security issues.
  
- **Memory Management:** Java provides automatic memory management through garbage collection. This eliminates the need for direct memory manipulation, which is handled by the Java Virtual Machine (JVM).

- **Simplicity and Safety:** By abstracting away memory management and avoiding pointers, Java simplifies programming and reduces the likelihood of errors that can arise from manual memory management.

In summary, the absence of pointers in Java contributes to its robustness, security, and ease of use.


# What Is a Static Variable?

In Java, the `static` keyword is used to declare variables and methods that are shared among all instances of a class. A static variable is a class-level variable that is common to all objects of the class. This means that only one copy of the static variable is created, and it is shared among all instances of the class.

## Characteristics of Static Variables

- **Shared Among All Instances:** All instances of the class share the same static variable. Any changes made to the static variable by one instance will be reflected in all other instances.

- **Class-Level Variable:** Static variables are associated with the class itself rather than any particular instance. They can be accessed using the class name or through an instance of the class.

- **Initialization:** Static variables are initialized only once when the class is first loaded. They retain their values across all instances of the class.

## Example

Here’s an example demonstrating the use of a static variable in Java:

```java
public class Example {
    // Static variable
    static int count = 0;

    // Constructor
    public Example() {
        count++;
    }

    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();
        Example obj3 = new Example();

        System.out.println("Number of instances created: " + Example.count);
    }
}
```

# Constructor

Constructors are special methods in object-oriented programming used to initialize objects. When you create an object of a class using the `new` keyword, the constructor is automatically invoked to perform any necessary setup for the object.

## Types of Constructors

1. **Default Constructor**
   - **Definition:** A constructor that takes no arguments and initializes the object with default values.
   - **Use:** Automatically provided by Java if no other constructors are defined. It initializes object attributes with default values (e.g., `null` for objects, `0` for numeric types, `false` for boolean).

2. **Parameterized Constructor**
   - **Definition:** A constructor that takes one or more arguments to initialize the object with specific values.
   - **Use:** Allows you to create an object with an initial state defined by the arguments passed to the constructor.

## Purpose of Constructors

- **Initializing Object Attributes:** Constructors are typically used to assign initial values to an object's attributes. This ensures that objects are created in a consistent state.
  
- **Performing Validation Checks:** Constructors can be used to validate the data used to create an object. This helps prevent errors and ensures that objects are always in a valid state.
  
- **Controlling Object Creation:** Constructors can be designed to take arguments, allowing you to specify the initial state of the object and control how objects are created.

## Example

Here is an example demonstrating the use of both default and parameterized constructors in Java:

```java
public class Person {
    // Attributes
    String name;
    int age;

    // Parameterized Constructor
    public Person(String name, int age) {
        // Initialize attributes
        this.name = name;
        this.age = age;
    }

    // Default Constructor
    public Person() {
        // Initialize with default values
        this.name = "Unknown";
        this.age = 0;
    }

    // Method to display person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person();

        // Displaying information
        person1.displayInfo();
        person2.displayInfo();
    }
}
```
# This Keyword

In object-oriented programming, the `this` keyword is a special reference that refers to the current object instance. It's particularly useful within methods and constructors of a class to interact with the object's own properties and methods.

## Common Uses of the `this` Keyword

- **Referencing Object Attributes:** When a method needs to access or modify an attribute (variable) of the current object, you can use `this` followed by a dot (`.`) and the attribute name. This helps avoid naming conflicts with local variables that might have the same name within the method.

- **Invoking Current Class Methods:** You can use `this` to call other methods defined within the same class. This can be helpful when a method needs to perform additional operations on the current object.

- **Calling Current Class Constructor:** Inside a constructor, you can use `this()` to call another constructor of the same class. This is useful for creating constructors with different parameter sets or for achieving specific initialization logic.

- **Passing the Current Object as an Argument:** In some cases, you might want to pass the current object instance as an argument to another method. You can use `this` to achieve this.


# `final`, `finally`, `finalize`

In Java, `final`, `finally`, and `finalize` serve different purposes and are used in various contexts:

## `final`

The `final` keyword is used to define constants and to prevent modification of variables, methods, and classes.

- **Final Variables:** Once a variable is declared as `final`, its value cannot be changed after initialization. This is used to define constants.

-**Final Methods:** A method declared as final cannot be overridden by subclasses. This ensures that the method's behavior remains consistent. & A class declared as final cannot be subclassed. This is used to prevent inheritance.

  ```java
  public class Constants {
      public static final int MAX_VALUE = 100;

      public static void main(String[] args) {
          System.out.println("Max Value: " + MAX_VALUE);
          // MAX_VALUE = 200; // This will cause a compilation error
      }
  }
```

-**finally:** The finally block is used in exception handling to ensure that a block of code is executed after a try block, regardless of whether an exception is thrown or not. It's typically used to release resources or perform cleanup.

  ```java

public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("In try block.");
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
```

-**finalize:** The finalize method is part of the Object class and is used to perform cleanup before an object is garbage collected. It is called by the garbage collector before an object’s memory is reclaimed. However, it is not recommended for general resource management because its execution is not guaranteed.

  ```java

public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("In try block.");
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
```


## What is Methods?

Methods are like mini-programs within a program. They are a set of codes that perform a particular task and return the result to the caller. They help organize code, making it more readable, reusable, and modular. Understanding methods is essential for writing efficient and maintainable Java code. Methods are used to expose the behavior of an object.

### Advantages:
- **Reusability:** Methods enable writing code once and using it multiple times, enhancing modularity and maintenance.
- **Abstraction:** Methods hide complex logic, offering a simpler interface for better readability and comprehension.
- **Improved Readability:** Breaking code into named methods enhances readability and understanding.
- **Encapsulation:** Methods encapsulate complex logic and data for easier management.

# Exception Handling in Java

## Definition

Exception handling in Java is a mechanism to handle runtime errors, ensuring that the normal flow of the application is maintained. An exception is an event that disrupts the normal flow of the program. When an exception occurs, Java creates an exception object, which contains information about the error and then hands it off to the runtime system to handle.

### Types of Exceptions

1. **Checked Exceptions**: Exceptions that are checked at compile-time.
   - Example: `IOException`, `SQLException`.

2. **Unchecked Exceptions**: Exceptions that occur at runtime and are not checked at compile-time.
   - Example: `ArithmeticException`, `NullPointerException`.

3. **Error**: Indicates serious problems that a reasonable application should not try to catch.
   - Example: `OutOfMemoryError`, `StackOverflowError`.

## Real-Time Examples

### Example 1: Division by Zero

In a banking application, if you try to calculate the interest rate using a division operation, and the divisor is zero, it will throw an `ArithmeticException`.

```java
public class BankApplication {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }
    }
}
```
# Implementation

## Basic Exception Handling with `try-catch`

### 1. `try` Block

The code that might throw an exception is enclosed in a `try` block.

### 2. `catch` Block

This block catches and handles the exception. It can also provide custom error messages.

### 3. `finally` Block

This block is always executed, whether an exception is thrown or not. It is generally used for cleanup code, such as closing files or releasing resources.

### 4. `throw` Keyword

This keyword is used to explicitly throw an exception from a method or any block of code.

### 5. `throws` Keyword

This keyword indicates that a method might throw an exception, alerting the caller to handle it.

```java

public class BasicExceptionHandling {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Rest of the code executes...");
    }
}
```

### Multithreading and Concurrency

# Multithreading and Concurrency

## Definition
Multithreading in Java is a process of executing multiple threads simultaneously. Each thread runs independently, allowing efficient utilization of the CPU. Concurrency refers to the ability of a program to make progress on multiple tasks at the same time, improving performance and responsiveness.

## Real-Time Example
Consider a server handling multiple client requests simultaneously. If the server processes requests one at a time, it becomes slow and unresponsive. By using multithreading, the server can handle multiple requests concurrently, improving user experience.

## Implementation
### 1. Extending the `Thread` class
One way to create a thread is by extending the `Thread` class and overriding its `run` method.

### 2. Implementing the `Runnable` interface
Another way is to implement the `Runnable` interface and pass an instance of the implementing class to a `Thread` object.

### 3. Using the `ExecutorService`
The `ExecutorService` is a higher-level replacement for managing and executing threads. It provides thread pooling and better control over thread execution.

### Example: Extending `Thread` Class
```java
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
```

# Memory Management in Java

## Garbage Collection

Java's garbage collection (GC) mechanism automatically manages memory allocation and deallocation, helping to prevent memory leaks and optimize resource usage.

### Understanding Java’s Garbage Collection Mechanism

1. **Automatic Memory Management**: Java automatically allocates and deallocates memory, reducing the need for manual memory management by the programmer.
   
2. **Heap Memory**: Java applications use heap memory for object allocation. The heap is divided into the Young Generation (where new objects are allocated) and the Old Generation (where long-lived objects are moved).

3. **Garbage Collection Algorithms**:
   - **Mark and Sweep**: This algorithm marks objects that are still in use and then sweeps away objects that are no longer reachable.
   - **Generational Garbage Collection**: This method divides the heap into different generations (Young, Old) and applies different GC strategies to each generation. Young Generation uses minor GC, while Old Generation uses major GC.
   - **Garbage-First (G1) Collector**: A low-latency garbage collector that divides the heap into regions and aims to achieve predictable pause times.

4. **GC Tuning**: Java provides various JVM options to tune garbage collection, such as `-Xms` for initial heap size and `-Xmx` for maximum heap size.

### Example

Here’s a simple example demonstrating how garbage collection works:

```java
public class GarbageCollectionExample {
    public static void main(String[] args) {
        GarbageCollectionExample obj1 = new GarbageCollectionExample();
        obj1 = null; // obj1 is no longer reachable

        // Request garbage collection
        System.gc(); // Suggests the JVM to perform garbage collection
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called.");
        super.finalize();
    }
}
```

# Memory Leaks in Java

## Definition

Memory leaks occur when an application retains references to objects that are no longer needed, preventing them from being garbage collected. This can lead to increased memory usage and eventually cause the application to run out of memory.

## How to Avoid Memory Leaks in Java Applications

1. **Avoid Long-Lived References**

   Ensure that objects are no longer referenced after their use. For example, avoid keeping references to large data structures if they are no longer needed.

```java
   // Example of avoiding long-lived references
   List<Object> largeList = new ArrayList<>();
   // Use the list
   largeList = null; // Allow the garbage collector to reclaim the memory
```
# JDBC (Java Database Connectivity)

JDBC (Java Database Connectivity) is an API in Java that allows Java applications to interact with relational databases. It provides a standard interface for connecting to databases, executing SQL queries, and handling results.

# File Handling in Java

File handling in Java allows you to read from and write to files. Java provides various classes for file operations, including `FileReader`, `FileWriter`, `BufferedReader`, and `BufferedWriter`. These classes are part of the `java.io` package.

## Reading Files

### Using `FileReader` and `BufferedReader`

- **FileReader**: Used to read the contents of a file in a character stream.
- **BufferedReader**: Reads text from a character-based input stream, buffering characters for efficient reading.

### Example: Reading a File

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {
    public static void main(String[] args) {
        String filePath = "example.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
# Annotations in Java

Annotations in Java are metadata that provide data about a program but are not part of the program itself. They are used to give instructions to the compiler, provide information to tools, or help during runtime.

## Built-in Annotations

### `@Override`

- **Purpose**: Indicates that a method is intended to override a method in a superclass.
- **Usage**: Helps the compiler detect errors if the method does not correctly override a method in the superclass.

```java
public class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
```

# Generics in Java

Generics in Java enable you to write flexible and reusable code while providing type safety. They allow you to define classes, methods, and interfaces that can operate on various types while still enforcing type constraints.

## Generic Classes

A generic class is a class that can work with any data type. It is defined with a type parameter that can be specified when creating an instance of the class.

# Java Enums

Enums (short for enumerations) in Java are a special data type that enables a variable to be a set of predefined constants. They provide a way to define and use a fixed set of constants, which can make your code more readable and maintainable.

## Declaring and Using Enums

Enums are declared using the `enum` keyword. Each constant in the enum is a public static final instance of the enum type. Enums can be used in switch statements, loops, and other constructs.

### Example: Basic Enum Declaration

```java
public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            case SATURDAY: case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Midweek days.");
        }
    }
}
```
# Enum Constructors, Methods, and Fields

Enums in Java can have fields, methods, and constructors. However, there are specific rules and practices associated with each:

## Fields

Enums can have fields to store data associated with each constant. Fields are used to hold information that can vary between different constants.

### Example: Enum with Fields

```java
public enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 6.9911e7),
    SATURN(5.688e+26, 5.8232e7),
    URANUS(8.681e+25, 2.5362e7),
    NEPTUNE(1.024e+26, 2.4622e7);

    private final double mass; // in kilograms
    private final double radius; // in meters

    // Constructor
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    // Getter methods
    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}
```

# Inner Classes in Java

Inner classes in Java are classes defined within another class. They allow for logically grouping classes that are only used in one place, improving encapsulation and readability. Java provides several types of inner classes, each serving a specific purpose.

## Types of Inner Classes

### 1. Static Nested Classes

- **Definition**: Static nested classes are nested classes that are declared with the `static` keyword. They do not have access to the instance variables and methods of the outer class but can access its static members.
- **Usage**: Use static nested classes when you want to group classes that are logically related but do not need access to the instance members of the outer class.

#### Example

```java
public class OuterClass {
    private static String outerStaticField = "Static Field";

    static class StaticNestedClass {
        void display() {
            System.out.println("Accessing from StaticNestedClass: " + outerStaticField);
        }
    }

    public static void main(String[] args) {
        StaticNestedClass nestedClass = new StaticNestedClass();
        nestedClass.display();
    }
}
```
# Immutable Classes in Java

Immutable classes are a core concept in Java programming, ensuring that objects cannot be modified once they are created. Immutability provides various benefits, including simplicity, thread-safety, and reliability.

## Understanding the Concept of Immutability

An immutable object is one whose state cannot be modified after it is created. Once an instance of an immutable class is initialized, its fields cannot be changed. This makes immutable objects inherently thread-safe since their state remains constant.

## How to Create Immutable Classes in Java

To create an immutable class in Java, follow these steps:

1. **Declare the Class as `final`**: Prevents the class from being subclassed.
2. **Make All Fields `private` and `final`**: Ensures that fields can only be assigned once.
3. **Provide No Setter Methods**: Prevents modification of fields.
4. **Initialize All Fields via Constructor**: Ensure that fields are initialized only once during object creation.
5. **Provide a Public Getter Method for Each Field**: Allows read-only access to the fields.
6. **Ensure Proper Handling of Mutable Objects**: If your class contains mutable objects (e.g., arrays), ensure that they are not modified after initialization.

### Example of an Immutable Class

```java
public final class ImmutableClass {
    private final int value;
    private final String name;

    // Constructor to initialize fields
    public ImmutableClass(int value, String name) {
        this.value = value;
        this.name = name;
    }

    // Getter methods
    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
```
# File Handling in Java

File handling in Java allows you to read from and write to files. Java provides various classes for file operations, including `FileReader`, `FileWriter`, `BufferedReader`, and `BufferedWriter`. These classes are part of the `java.io` package.

## Reading Files

### Using `FileReader` and `BufferedReader`

- **FileReader**: Used to read the contents of a file in a character stream.
- **BufferedReader**: Reads text from a character-based input stream, buffering characters for efficient reading.

### Example: Reading a File

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {
    public static void main(String[] args) {
        String filePath = "example.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```



<h1>OOP's</h1>
<h2>what is Array?</h2>
An array is a data structure that can hold a fixed number of elements, typically of the same data type, in a specific order. 
Arrays are used in programming to store multiple values in a single variable, and they allow for efficient access and manipulation of the elements based on their index positions.
Characteristics of Arrays<br>
Fixed Size: The size of an array is determined when it is created and cannot be changed.<br>
Indexed: Each element in an array can be accessed using its index, which is a number representing its position in the array. Indexing typically starts from 0.<br>
Homogeneous Elements: All elements in an array are of the same type (e.g., all integers, all strings).<br>
Efficient Access: Arrays allow for constant time complexity O(1)O(1) for accessing elements using their index.

<h2>Types of Arrays</h2>
One-dimensional Array: A single row of elements. Example arr = [1, 2, 3, 4]<br>
Multi-dimensional Array: Arrays of arrays, such as two-dimensional (2D) arrays, which can be thought of as tables or matrices. Example:matrix = [[1, 2], [3, 4]]

<h2>Classses and Objects</h2>
Object-oriented programming (OOP) is a programming paradigm based on the concept of "objects," 
which can contain data in the form of fields (attributes or properties) and code in the form of procedures (methods or functions).
A "class" serves as a blueprint or template for creating objects. It defines the properties (attributes) and behaviors (methods) that all objects of that class will have.
An "object" is an instance of a class. It represents a unique entity in a program, with its own set of attributes and behaviors defined by the class.

<h2>Declaring Classes, Creating Objects, and Accessing Object Members</h2>
To declare a class in Java, you use the class keyword followed by the class name and a pair of curly braces {} to define the class body. 
Within the class body, you define fields (variables) to represent attributes and methods to define behaviors.
To create an object of a class, you use the new keyword followed by the class name and parentheses (). This allocates memory for the object and initializes its attributes based on the class definition.
You can access the members (fields and methods) of an object using the dot . operator. For example, objectName.fieldName accesses a field, and objectName.methodName() invokes a method.

<h2>Abstraction</h2>
in Java is a core concept of object-oriented programming (OOP) that focuses on hiding the complex implementation details of a system and exposing only the necessary and relevant parts to the user. It helps in reducing programming complexity and effort by allowing the programmer to focus on what an object does instead of how it does it.

<h2>Interface</h2>
In Java, an interface is a reference type that can contain constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. By using interfaces, you can achieve a form of abstraction by specifying what methods a class must implement without dictating how these methods should be implemented. This allows for greater flexibility and decoupling in your code.

//interface is 100% abstraction 
all the methods or attributes are default public,static,final.
we implement the interface not extend
interface help us to multiple inheritence

<h2>Inheritance</h2>
is a fundamental concept in object-oriented programming (OOP) that allows a new class (called a subclass or derived class) to inherit properties and behaviors (methods) from an existing class (called a superclass or base class). This mechanism promotes code reusability, modularity, and the creation of hierarchical relationships between classes.
<h2>Types of Inheritance in Java</h2>
Single Inheritance: A subclass inherits from one superclass.<br>
Multilevel Inheritance: A subclass inherits from another subclass, forming a chain.<br>
Hierarchical Inheritance: Multiple subclasses inherit from a single superclass.

<h2>Polymorphism</h2>
The word polymorphism means having many forms. In simple words, we can define Java Polymorphism as the ability of a message to be displayed in more than one form.
Real-life Illustration of Polymorphism: A person can have different characteristics at the same time. Like a man, at the same time, is a father, a husband, and an employee. 
So, the same person possesses different behaviors in different situations. This is called polymorphism.  Method Overloading is a Compile-time polymorphism.

<h2>Method Overloading</h2>
it allows methods in the same class to have the same name but different signatures.
Method Overloading allows methods in the same class to have the same name but different signatures.
Signatures can differ by the number or type of input parameters, or a combination of both.
It's also known as Compile-time Polymorphism, Static Polymorphism, or Early binding.
In Method Overloading, the compiler selects the appropriate method based on the arguments provided during compile time.
When calling an overloaded method, Java gives priority to the child argument over the parent argument.<br>

Signatures can differ by the number or type of input parameters, or a combination of both.
It's also known as Compile-time Polymorphism, Static Polymorphism, or Early binding.
In Method Overloading, the compiler selects the appropriate method based on the arguments provided during compile time.
When calling an overloaded method, Java gives priority to the child argument over the parent argument.

<h2>advantages of method Overloading</h2>
Readability and Reusability: Enhances code clarity and promotes reusability by using the same method name for different functionalities.<br>
Reduced Complexity: Simplifies code by eliminating the need for distinct method names, making program logic easier to manage.<br>
Efficient Execution: Implementations to specific scenarios, enabling efficient task execution.<br>
Flexible Access: Allows accessing methods with slight variations in arguments and types, enhancing flexibility.<br>
Diverse Initialization: Extends to constructors, enabling diverse object initialization, and enhancing object creation flexibility<br>



<h2>what is StringBuilder</h2>
StringBuilder is a class used to create mutable (modifiable) sequences of characters. Unlike String, which is immutable, StringBuilder allows you to modify the content without creating a new object for each modification, making it more efficient for scenarios where frequent modifications are required.
<h2>Key Features of StringBuilder</h2>
Mutable: Unlike String, StringBuilder objects can be modified after they are created.
Efficient: More efficient for concatenating multiple strings compared to String due to reduced overhead from creating new objects.
Not Thread-Safe: Methods in StringBuilder are not synchronized, meaning they are not thread-safe. Use StringBuffer if thread safety is required.<br>
Common Methods in StringBuilder<br>
append(): Adds a string representation of any data type to the current sequence.<br>
insert(): Inserts a string at the specified index.<br>
replace(): Replaces characters in a substring with another string.<br>
delete(): Removes characters from the sequence.<br>
reverse(): Reverses the sequence.<br>
toString(): Converts the sequence to a String object.<br>
Not thread safe <br>
Not synchronised <br>
Faster

<h2>what isStringBuffer</h2>
StringBuffer is a class used for creating and manipulating sequences of characters. Like StringBuilder, StringBuffer is mutable, meaning its content can be modified after creation. However, StringBuffer is synchronized, making it thread-safe for use in concurrent programming environments.
<h2>Key Features of StringBuffer</h2>
Mutable: StringBuffer objects can be modified after they are created, unlike String.<br>
Thread-Safe: Methods in StringBuffer are synchronized, ensuring that it is safe to use in multi-threaded environments.<br>
Efficiency: More efficient for concatenating multiple strings compared to String due to reduced overhead from creating new objects.<br>
Common Methods in StringBuffer
append(): Adds a string representation of any data type to the current sequence.<br>
insert(): Inserts a string at the specified index.<br>
replace(): Replaces characters in a substring with another string.<br>
delete(): Removes characters from the sequence.<br>
reverse(): Reverses the sequence.<br>
toString(): Converts the sequence to a String object.<br>
Thread safe<br>
Synchronised<br>
Slower<br>

<h2>Recursion </h2>
Recursion is a programming technique where a function calls itself directly or indirectly to solve a problem. It's a fundamental concept in computer science and can be a powerful tool for solving problems that exhibit repetitive structures or can be broken down into smaller, similar sub-problems.
<h2>Key Concepts of Recursion</h2>
Base Case: Every recursive function must have one or more base cases — specific conditions where the function stops calling itself and returns a value. This prevents infinite recursion.
Recursive Case: This is where the function calls itself with different arguments to solve a smaller instance of the same problem.
Stack Usage: Recursion uses the call stack to store intermediate values and function calls. Each recursive call adds a new frame to the stack, which is popped off when the base case is reached.
* used to complex Q by dividing big problems into smaller.
* it uses recursion stack, it takes more memory.
* approach is top to bottom & bottom to top.


Time and space complexity are metrics used to evaluate the efficiency of algorithms. 

<h2>Time Complexity</h2>
Time complexity measures the amount of time an algorithm takes to complete as a function of the length of the input. 
It is usually expressed using Big O notation, which describes the upper bound of the algorithm's running time.

<h2>Space Complexity</h2>
Space complexity measures the amount of memory an algorithm uses as a function of the length of the input. It includes both the memory
needed for the input data and any additional memory used by the algorithm. Space complexity is also expressed using Big O notation.

3 Time Complexity- Best Ω (Omega), Average θ (Theta), Worst O (Big O)<br>
O(1): Constant time - the running time is independent of the input size.<br>
O(n): Linear time - the running time grows linearly with the input size.<br>
O(n^2): Quadratic time - the running time grows quadratically with the input size.<br>
O(log n): Logarithmic time - the running time grows logarithmically with the input size.


<h1> DSA </h2>

<h2>Linked List </h2>

A LinkedList in Java is a linear and fundamental data structure that stores the Java components. It offers Java users an efficient, flexible way to store and work with various Java elements.
Java LinkedList allows dynamic size adjustment as and when elements are subtracted or added. Here in this tutorial, you will learn what is LinkedList, its needs, its operation, demonstration, LinkedList in a data structure, and much more.
A linked list is a linear data structure where elements are stored in nodes, and each node points to the next node in the sequence.

<h2>Types of Linked Lists</h2>
Singly Linked List: Each node points to the next node.<br>
Doubly Linked List: Each node points to both the next and the previous node.<br>
Circular Linked List: The last node points back to the first node, forming a circle.<br>

<h2>Basic Operations</h2>
○ Insertion: Adding a new node at the beginning, end, or middle of the list.<br>
○ Deletion: Removing a node from the list.<br>
○ Traversal: Iterating through the list to access or manipulate nodes.<br>
○ Search: Finding a node with a specific value or index.

<h2>Advantages</h2>
○ Dynamic size: Linked lists can grow or shrink in size during execution.<br>
○ Ease of insertion and deletion: Adding or removing nodes doesn't require shifting elements, unlike arrays.<br>
○ Versatility: Different types of linked lists offer flexibility based on the application needs.

<h2>Disadvantages</h2>
○ Memory Overhead: Each node in a linked list requires extra memory for storing the link.<br>
○ Traversal: Sequential access is slower compared to arrays because elements are not stored contiguously in memory.<br>
○ No Random Access: Unlike arrays, accessing an element at a particular index requires traversing from the beginning.


<h2>Why Use Linked Lists</h2>

1. Dynamic Size: Unlike arrays, linked lists can grow and shrink in size dynamically. This makes them suitable for situations where the number of elements is unknown or varies significantly.<br>
2. Efficient Insertions/Deletions: Insertions and deletions in a linked list are more efficient compared to arrays. Adding or removing elements can be done in constant time O(1) if the position is known, without the need to shift elements like in arrays.<br>
3. Memory Utilization: Linked lists do not require a contiguous block of memory. This can help in better memory utilization, especially in systems with limited memory or fragmented memory.<br>
4. Flexible Data Structures: Linked lists form the basis for implementing various other data structures such as stacks, queues, and graphs. They provide a flexible way to represent these structures.<br>
5. Ease of Expansion: Adding new elements to a linked list does not require resizing or copying the existing elements, unlike dynamic arrays which might need to allocate new memory and copy old elements during resizing.


<h2>A doubly linked list</h2>

in Java is a data structure where each node contains references to both the next and the previous node in the sequence. This allows for traversal of the list in both directions.


<h2>Notes</h2>

*A DS in which elements are stored in non contiouos allocation memory <br>
Each element in LL is a node.<br>
*node is 2 types<br>
1. data types<br>
2. address which hold address of next node.<br>
1st node called special node "head". 
Last node callend "tail". having address null.
insetion & deletion happens in constant time.

<h2>Stack</h2>
Stack is a linear data structure based on based on LIFO(Last In First Out) principle in which the insertion of a new element and removal of an existing element takes place at the same end represented as the top of the stack.
To implement the stack, it is required to maintain the pointer to the top of the stack , which is the last element to be inserted because we can access the elements only on the top of the stack.

<h2>LIFO(Last In First Out) Principle in Stack:</h2>

This strategy states that the element that is inserted last will come out first. You can take a pile of plates kept on top of each other as a real-life example. The plate which we put last is on the top and since we remove the plate that is at the top, we can say that the plate that was put last comes out first.

<h2>Methods in Stack Class</h2>
1. push(element): Adds a new element to the stack's top.
2. pop(): Removes and returns the topmost element in the stack.
3. peek(): Returns the topmost stack element without deleting it.
4. empty(): Returns a boolean result that determines if the stack is empty.
5. size(): Gives the stack's element count.
<h2>Applications of Stack in Java</h2>
Stacks check for balanced parentheses, match XML and HTML tags, and validate code syntax.<br>
A stack allows the evaluation of expressions, especially infix, postfix, and prefix expressions. A stack can convert infix expressions to postfix or prefix forms.<br>
Stacks are frequently used by backtracking algorithms, including depth-first search (DFS), to retain track of visited nodes and return to earlier stages during exploration.

<h2>Queue</h2>
Queue in Java is a data structure for handling collections of duplicate items. The elements are stored in first-in, first-out (FIFO) queues. The line begins at the front and extends to the rear. Each Queue method has an exception-throwing and a value-returning variant in case the former fails.<br>

 Queue is a Linear Data Structure that works on First-in-First-Out (FIFO) principle.

It has two pointers, 'Front' that points to the beginning of the queue and 'Rear' that points to the end of the queue.

The 'Front' and 'Rear' pointers are manipulated constantly to always point to the beginning and end of queue.

It can be implemented using Arrays and Linked Lists.

<h2>operations</h2>
Enqueue: 
Add an element to the end of the queue
Dequeue: 
Remove an element from the front of the queue
IsEmpty: 
Check if the queue is empty
IsFull: 
Check if the queue is full
Peek: 
Get the value of the front of the queue without removing it<br>
note:
the remove() method throws an exception, while the poll() method returns null

<h2>HashMap</h2>
HashMap in Java is an integral part of the collections framework. It is located in the java.util package. It implements the Java Map interface in its most basic form. It saves the data as a key-value mapping, where each key corresponds to exactly one data type value. Here is a tutorial blog on how to use HashMap in Java.<br>

Hashing is a technique that gives you a convenient way to store and
search for elements in large datasets.

<h2>Advantages of HashMap</h2>

Fast retrieval: HashMap provides constant-time access to elements. This means the time to retrieve or insert elements remains constant, even as the size of the HashMap increases.<br>
Efficient storage: HashMap uses a hashing function to map keys to indices in an underlying array, allowing a fast lookup of values based on keys. The hashing function distributes the entries across different buckets, ensuring efficient data storage and retrieval.<br>
Flexibility: HashMap allows for storing null keys and values, offering flexibility in handling data. Additionally, HashMap can store key-value pairs of any data type. This provides versatility in its usage.<br>
Easy to use: HashMap has a straightforward and user-friendly interface. This makes it easy to understand and implement in Java.

<h2>Disadvantages of HashMap</h2>
Unordered: HashMaps do not preserve the order of elements.<br>
Not thread-safe: HashMaps are not inherently thread-safe.<br>
Performance degradation: In certain situations, the performance of HashMap can degrade.<br>
Complexity: The concept of hashing, collision resolution, and understanding the intricacies of the equals and hashCode methods can be challenging and complex.<br>
Higher memory usage: HashMaps use an underlying array to store key-value pairs, which can result in higher memory usage than other data structures like arrays or lists.<br>

<h2>Collision resolution techniques</h2>

1. Separate Chaining (Open Hashing)<br>
In separate chaining (also known as open hashing), each slot in the hash table holds a reference to a linked list (or another data structure like a binary search tree) that contains all the elements that hash to the same index. When a collision occurs, the new element is simply added to the linked list at that index.<br>


2. Open Addressing (Closed Hashing)<br>
In open addressing (also known as closed hashing), all elements are stored directly in the hash table. When a collision occurs, open addressing searches for another open slot within the hash table according to a specific probing sequence.<br>

<h2>Probing Techniques:</h2>
• Linear Probing: Check the next slot in a sequential manner. If it's occupied, continue to the next slot until an open slot is found<br>
• Quadratic Probing: Use a quadratic function to find the next slot (e.g., (index + i*2) % tableSize).<br>
• Double Hashing: Use a second hash function to determine the step size for probing<br>

<h2>Advantages</h2>
• No additional memory is needed for pointers or linked lists.<br>
• Generally faster access times for cache-friendly access patters.

<h2>Disadvantages</h2>
• Performance degrades as the hash table becomes full, leading to clustering (where nearby slots become occupied).<br>
• Deletion can be complex because simply removing an element can disrupt the probing sequence.

<h2>A. Linear Probing</h2>
In linear probing, if a slot is occupied, the hash table checks the next slot in a linear sequence until an empty slot is found.

<h2>B. Quadratic Probing</h2>
In quadratic probing, if a slot is occupied, the hash table probes the next slot using a quadratic function<br>
Formula: hash(x, i) = (hash(x) + i^2) % table_size, where i is the probe number.

<h2>C. Double Hashing</h2>
In double hashing, a second hash function is used to determine the step size for probing <br>
Formula: hash(x, i) = (hash1(x) + i * hash2(x)) % table _size, where hash1(x) is the primary hash function and hash2(x) is the secondary hash function.
