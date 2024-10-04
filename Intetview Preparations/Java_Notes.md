# Java

# Important Java Topics for Interview Preparation

## 1. Core Java

- Defination
- features
- platform independance
- Data Types, Variables, and Operators
- JDK
- JIT
- Classloader
- Access Modifiers (public, private, protected)
- operators
- Main method
- packages
- pointers
- Static keyword,
- `super` keywords
- Constructor,
- this
- final, finally, finalize
- methods
- Exception Handling
- Try-catch, Finally, Throw, Throws
- Checked vs Unchecked exceptions
- Garbage Collection,
- memory leaks
- Stack vs. Heap
- Finalize Method
- String, StringBuffer, StringBuilder, String immutability
- Thread Lifecycle, Creating Threads, Runnable Interface
- Synchronization, Volatile, `wait()`, `notify()`, and `notifyAll()`

## Definition

Java is a high-level, object-oriented programming language developed by James Gosling at Sun Microsystems and released in 1995. It is designed to have as few implementation dependencies as possible, making it a write-once, run-anywhere (WORA) language. This means compiled Java code can run on all platforms that support Java without the need for recompilation.

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

## Real-Time Use

- **Mobile Applications:** Java is the primary language for developing Android apps.
- **Web Development:** Java is used for building server-side applications, handling requests, and managing databases. Frameworks like Spring and Hibernate make web development easier.
- **Enterprise Software:** Java is widely used in large organizations for building enterprise-grade applications due to its stability and scalability. Examples include banking systems and inventory management software.
- **Embedded Systems:** Java is also used in embedded systems, such as Blu-ray players and other consumer devices.

## Is Java Platform Independence

Yes, Java is a Platform Independent language.

Unlike many programming languages, the `javac` compiler in Java compiles the program into a bytecode or `.class` file. This file is independent of the software or hardware on which it was compiled, but it requires a preinstalled JVM (Java Virtual Machine) in the operating system for further execution of the bytecode.

Although the JVM is platform-dependent, the bytecode can be created on one system and executed on any other system, regardless of the hardware or software being used. This characteristic is what makes Java platform-independent.

# Different Data Types in Java

## Primitive Data Types

Primitive data types are basic types that hold single values and have no special methods or properties. There are 8 primitive data types in Java:

| **Data Type** | **Description**                                          | **Size** | **Range**                                                      |
| ------------- | -------------------------------------------------------- | -------- | -------------------------------------------------------------- |
| `boolean`     | Stores a value of `true` or `false`                      | N/A      | `true` or `false`                                              |
| `byte`        | Stores an 8-bit signed two’s complement integer          | 1 byte   | -128 to 127                                                    |
| `char`        | Stores a single 16-bit Unicode character                 | 2 bytes  | 0 to 65,535 (Unicode values)                                   |
| `short`       | Stores a 16-bit signed two’s complement integer          | 2 bytes  | -32,768 to 32,767                                              |
| `int`         | Stores a 32-bit signed two’s complement integer          | 4 bytes  | -2,147,483,648 to 2,147,483,647                                |
| `long`        | Stores a 64-bit signed two’s complement integer          | 8 bytes  | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807        |
| `float`       | Stores a single-precision 32-bit IEEE 754 floating-point | 4 bytes  | Approximately ±3.40282347E+38 (6-7 decimal places)             |
| `double`      | Stores a double-precision 64-bit IEEE 754 floating-point | 8 bytes  | Approximately ±1.79769313486231570E+308 (15-16 decimal places) |

## Non-Primitive Data Types

Non-primitive data types are reference types that hold references to objects rather than the actual values. They include:

| **Data Type** | **Description**                                     |
| ------------- | --------------------------------------------------- |
| `String`      | Represents a sequence of characters.                |
| `Array`       | Holds multiple values of the same type.             |
| `Class`       | Defines a blueprint for objects.                    |
| `Object`      | The base class for all classes.                     |
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

| **Component** | **Description**                                                                                                                                                                                                                                                                          |
| ------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **JDK**       | The Java Development Kit (JDK) is a comprehensive development environment that includes all essential tools, libraries, and documentation for Java development. It encompasses the JRE and additional tools like the Java compiler (`javac`), debugger (`jdb`), and various utilities.   |
| **JRE**       | The Java Runtime Environment (JRE) is a software bundle that provides the necessary runtime libraries, class libraries, and JVM implementation to execute Java applications. It offers the runtime environment required for running Java programs but lacks development tools.           |
| **JVM**       | The Java Virtual Machine (JVM) is a virtual machine that executes compiled Java bytecode, allowing Java programs to run independently across different hardware and operating systems. It handles memory management, garbage collection, and bytecode interpretation or JIT compilation. |

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

| **Modifier**  | **Same Class** | **Same Package** | **Subclass** | **Different Package** |
| ------------- | -------------- | ---------------- | ------------ | --------------------- |
| **public**    | Yes            | Yes              | Yes          | Yes                   |
| **protected** | Yes            | Yes              | Yes          | No                    |
| **default**   | Yes            | Yes              | No           | No                    |
| **private**   | Yes            | No               | No           | No                    |

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

| **Operator Type**        | **Operators**                     | **Description**                                                                                                           |
| ------------------------ | --------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | ---------------------------------------------- | --- | ------------------------------------------------------------------------------------------------------ |
| **Arithmetic Operators** | `+`, `-`, `*`, `/`, `%`           | Used for mathematical operations.                                                                                         |
| **Unary Operators**      | `+`, `-`, `++`, `--`, `!`         | Operates on a single operand to perform operations such as increment, decrement, and logical negation.                    |
| **Assignment Operator**  | `=`, `+=`, `-=`, `*=`, `/=`, `%=` | Used to assign values to variables. Includes compound assignment operators.                                               |
| **Relational Operators** | `==`, `!=`, `<`, `>`, `<=`, `>=`  | Used to compare values and determine relational conditions.                                                               |
| **Logical Operators**    | `&&`, `                           |                                                                                                                           | `, `!`, `&`, `^`                                                                                          | Used to perform logical operations. `&&` and ` |     | `are logical AND and OR, while`&`and`^` are bitwise operations that can also act as logical operators. |
| **Ternary Operator**     | `? :`                             | A shorthand for `if-else` statement. It evaluates a boolean expression and returns one of two values based on the result. |
| **Bitwise Operators**    | `&`, `                            | `, `^`, `~`, `<<`, `>>`, `>>>`                                                                                            | Used for operations on bits and binary numbers. Includes bitwise AND, OR, XOR, NOT, and shift operations. |
| **Shift Operators**      | `<<`, `>>`, `>>>`                 | Used to shift bits to the left or right.                                                                                  |
| **Instanceof Operator**  | `instanceof`                      | Tests whether an object is an instance of a specific class or subclass.                                                   |

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

# `super` Keyword in Java

The `super` keyword in Java is used to refer to the immediate parent class of an object. It is mainly used in the context of inheritance and serves the following purposes:

## 1. Accessing Parent Class Constructors

The `super()` keyword is used to call the constructor of the parent class from within the child class constructor. This ensures that the parent class constructor is executed before the child class constructor.

## 2. Accessing Parent Class Members

The `super` keyword can be used to access members of the parent class from within the child class.

## 3. Overriding Methods in the Parent Class

The `super` keyword can be used to call the overridden method of the parent class from within the child class.

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

# Stack vs. Heap Memory in Java

| Feature               | **Stack**                                                                        | **Heap**                                                                       |
| --------------------- | -------------------------------------------------------------------------------- | ------------------------------------------------------------------------------ |
| **Memory Allocation** | Static memory allocation. Stores local variables, references to objects.         | Dynamic memory allocation. Stores objects themselves.                          |
| **Lifetime**          | Automatically allocated/deallocated when method starts and ends.                 | Objects remain in heap until garbage collected.                                |
| **Size**              | Typically smaller and limited. Each thread has its own stack.                    | Larger in size, shared among all threads.                                      |
| **Access Speed**      | Faster access due to LIFO (Last-In-First-Out) nature.                            | Slower access because of global memory management.                             |
| **Storage**           | Stores method call data, local variables, and object references.                 | Stores actual objects, class instances, arrays.                                |
| **Thread Safety**     | Thread-safe; each thread has its own stack.                                      | Not thread-safe by default; needs synchronization.                             |
| **Memory Management** | Managed automatically by the program; memory is freed once the method completes. | Managed by the garbage collector; objects are freed when no longer referenced. |
| **Best For**          | Primitive data types and method calls.                                           | Long-lived objects like data structures, objects, and classes.                 |
