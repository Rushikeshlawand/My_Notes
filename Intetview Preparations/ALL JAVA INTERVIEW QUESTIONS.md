Introduction to Java
Java is like a magic recipe book for programming, enabling developers to create versatile programs for any device.
It's a popular computer language used to build various kinds of programs,from phone apps to website platforms to corporate software.
Java's versatility shines as it runs smoothly on different devices without needing any adjustments, making it incredibly convenient.
Understanding Java is like teaching instructions to a robot, where programmers use Java to communicate with computers effectively.

Who Developed Java
James Gosling is the main brain behind Java. Initially developed by Sun Microsystems, Java is now maintained by Oracle Corporation's oversight in 1995.

Java Platform Independent if then how?
Yes, Java is a Platform Independent language.
Unlike many programming languages javac compiler compiles the program to form a bytecode or .class file. 
This file is independent of the software or hardware running but needs a JVM(Java Virtual Machine) file preinstalled 
in the operating system for further execution of the bytecode.
Although JVM is platform dependent, the bytecode can be created on any System and can be executed in any 
other system despite hardware or software being used which makes Java platform independent.

What are the top Java Features?
Simple: Java is quite simple to understand and the syntax
Platform Independent: Java is platform independent means we can run the same program in any software and hardware and will get the same result.
Interpreted: Java is interpreted as well as a compiler-based language. 
Robust: features like Garbage collection, exception handling, etc that make the language robust.
Object-Oriented: Java is an object-oriented language that supports the concepts of class,  objects, four pillars of OOPS, etc. 
Secured: As we can directly share an application with the user without sharing the actual program makes Java a secure language. 
High Performance:  faster than other traditional interpreted programming languages.
Dynamic: supports dynamic loading of classes and interfaces.
Distributed: feature of Java makes us able to access files by calling the methods from any machine connected.
Multithreaded: deal with multiple tasks at once by defining multiple threads
Architecture Neutral: it is not dependent on the architecture.

Introduction to JDK
The Java Development Kit (JDK) is a comprehensive software package provided by Oracle Corporation for Java development.
It serves as an essential toolkit for developers to write, compile, debug, and run Java applications.
The JDK includes various tools, libraries, and utilities necessary for Java development, making it a fundamental component of the Java ecosystem

What is JVM?
JVM stands for Java Virtual Machine it is a Java interpreter. 
It is responsible for loading, verifying, and executing the bytecode created in Java.
Although it is platform dependent which means the software of JVM is different for different Operating Systems
it plays a vital role in making Java platform Independent.

What is JIT?
JIT stands for (Just-in-Time) compiler is a part of JRE, it is used for better performance of the Java applications during run-time. The use of JIT is mentioned in step by step process mentioned below:
Source code is compiled with javac compiler to form bytecode, Bytecode is further passed on to JVM 
JIT is a part of JVM, JIT is responsible for compiling bytecode into native machine code at run time.
The JIT compiler is enabled throughout, while it gets activated when a method is invoked. For a compiled method, the JVM directly calls the compiled code, instead of interpreting it.
As JVM calls the compiled code that increases the performance and speed of the execution.

What are Memory storages available with JVM?
c:\Users\rushi\AppData\Local\Temp\JVM-Areas-768.png
Class(Method) Area: stores class-level data of every class such as the runtime constant pool, field, and method data, and the code for methods.
Heap: Objects are created or objects are stored. It is used to allocate memory to objects during run time.
Stack: stores data and partial results which will be needed while returning value for method and performing dynamic linking
Program Counter Register: stores the address of the Java virtual machine instruction currently being executed.
Native Method Stack: stores all the native methods used in the application.

What is a classloader?
Classloader is the part of JRE(Java Runtime Environment), during the execution of the bytecode or created .class file 
classloader is responsible for dynamically loading the java classes and interfaces to JVM(Java Virtual Machine). 
Because of classloaders Java run time system does not need to know about files and file systems.

Difference between JVM, JRE, and JDK.
JVM: JVM also known as Java Virtual Machine is a part of JRE. JVM is a type of interpreter responsible for converting bytecode into machine-readable code.
JVM itself is platform dependent but it interprets the bytecode which is the platform-independent reason why Java is platform-independent. 
JRE: JRE stands for Java Runtime Environment, it is an installation package that provides an environment to run the Java program or application on any machine.
JDK: JDK stands for Java Development Kit which provides the environment to develop and execute Java programs. JDK is a package that includes two things Development Tools to provide 
an environment to develop your Java programs and, JRE to execute Java programs or applications.

Explain public static void main(String args[]) in Java.
Main_function
Unlike any other programming language like C, C++, etc. In Java, we declared the main function as a public static void main (String args[]). The meanings of the terms are mentioned below:
public: the public is the access modifier responsible for mentioning who can access the element or the method and what is the limit.  It is responsible for making the main function globally available. 
It is made public so that JVM can invoke it from outside the class as it is not present in the current class.
static: static is a keyword used so that we can use the element without initiating the class so to avoid the unnecessary allocation of the memory. 
void: void is a keyword and is used to specify that a method doesn’t return anything. As the main function doesn’t return anything we use void.
main: main represents that the function declared is the main function. It helps JVM to identify that the declared function is the main function.
String args[]: It stores Java command-line arguments and is an array of type java.lang.String class.

What will happen if we declare don’t declare the main as static?
We can declare the main method without using static and without getting any errors. But, the main method will not be treated as the entry point to the application or the program.

What are Packages in Java?
Packages in Java can be defined as the grouping of related types of classes, interfaces, etc providing access to protection and namespace management.
Packages are used in Java in order to prevent naming conflicts, control access, and make searching/locating and usage of classes, interfaces, etc easier.

What are the advantages of Packages in Java?
Packages avoid name clashes.
The Package provides easier access control.
We can also have the hidden classes that are not visible outside and are used by the package.
It is easier to locate the related classes.

How many types of packages are there in Java?
User-defined packages
Build In packages

Explain different data types in Java.
Primitive Data Type: Primitive data are single values with no special capabilities. There are 8 primitive data types:
boolean: stores value true or false
byte: stores an 8-bit signed two’s complement integer
char: stores a single 16-bit Unicode character
short: stores a 16-bit signed two’s complement integer
int: stores a 32-bit signed two’s complement integer
long: stores a 64-bit two’s complement integer
float: stores a single-precision 32-bit IEEE 754 floating-point
double: stores a double-precision 64-bit IEEE 754 floating-point

Non-Primitive Data Type: Reference Data types will contain a memory address of the variable’s values because it is not able to directly store the values in the memory.
Strings
Array
Class
Object
Interface

Can we declare Pointer in Java?
No, Java doesn’t provide the support of Pointer. As Java needed to be more secure because which feature of the pointer is not provided in Java

What is the Wrapper class in Java?
Wrapper, in general, is referred to a larger entity that encapsulates a smaller entity. Here in Java, the wrapper class is an object class that encapsulates the primitive data types. 
The primitive data types are the ones from which further data types could be created. For example, integers can further lead to the construction of long, byte, short, etc. On the other hand, the string cannot, hence it is not primitive. 
Getting back to the wrapper class, Java contains 8 wrapper classes. They are Boolean, Byte, Short, Integer, Character, Long, Float, and Double. Further, custom wrapper classes can also be created in Java which is similar to the concept of Structure in the C programming language. We create our own wrapper class with the required data types.

Why do we need wrapper classes?
The wrapper class is an object class that encapsulates the primitive data types, and we need them for the following reasons:
Wrapper classes are final and immutable
Provides methods like valueOf(), parseInt(), etc.
It provides the feature of autoboxing and unboxing.

What is a Class Variable?
In Java, a class variable (also known as a static variable) is a variable that is declared within a class but outside of any method, constructor, or block. 
Class variables are declared with the static keyword, and they are shared by all instances (objects) of the class as well as by the class itself. 
No matter how many objects are derived from a class, each class variable would only exist once.

What is a static variable?
The static keyword is used to share the same variable or method of a given class. Static variables are the variables 
that once declared then a single copy of the variable is created and shared among all objects at the class level.

Difference in the use of print, println, and printf.
print, println, and printf all are used for printing the elements but print prints all the elements and the cursor remains in the same line. 
println shifts the cursor to next line. And with printf we can use format identifiers too.

How many types of operators are available in Java? 
Arithmetic Operators: +,-,*,/,%.
Unary Operators
Assignment Operator: ==,=.
Relational Operators: <,>,>=,<=,!.
Logical Operators: &&, ||, &.
Ternary Operator
Bitwise Operators
Shift Operators
instance of operator

What is the default value of elements in a newly created array in Java?
For numeric types (int, float, etc.), the default value is 0.
For boolean, the default value is false.
For object references, the default value is null.

What is Methods?
Methods are like mini-programs within a program. It is a set of codes that perform a particular task and return the result to the caller.
They help organize code, making it more readable, reusable, and modular. 
Understanding methods is essential for writing efficient and maintainable Java code. 
It is used to expose the behavior of an object. 
advantages:
Reusability: Methods enable writing code once and using it multiple times, enhancing modularity and maintenance.
Abstraction: Methods hide complex logic, offering a simpler interface for better readability and comprehension.
Improved readability: Breaking code into named methods enhances readability and understanding.
Encapsulation: Methods encapsulate complex logic and data for easier management.

Declare of methods:
public int add(int a,int b)
modifier-return type-method name-parameter list.

Modifier: Defines access level: public, protected, private, or default (no modifier). (Optional) 
Return Type: Data type of the value returned by the method, or void if no value is returned. (Mandatory) 
Method Name: Identifier for the method, following naming conventions. (Mandatory) 
Parameter List: Data type and name of input parameters, separated by commas and enclosed in parentheses. (Optional) 
Exception List: Specifies exceptions the method may throw. (Optional) 
Method Body: Enclosed code block where operations are performed. (Optional)

Final
it used in various contexts to define constants and to ensure that certain variables, methods, and classes are not modified.

This Keyword
In object-oriented programming, the this keyword is a special reference that refers to the current object instance. It's particularly useful within methods and constructors of a class to interact with the object's own properties and methods.
Here are some common ways to use the this keyword:
Referencing object attributes: When a method needs to access or modify an attribute (variable) of the current object, you can use this followed by a dot (.) and the attribute name. This helps avoid naming conflicts with local variables that might have the same name within the method.
Invoking current class methods: You can use this to call other methods defined within the same class. This can be helpful when a method needs to perform additional operations on the current object.
Calling current class constructor: Inside a constructor, you can use this() to call another constructor of the same class. This is useful for creating constructors with different parameter sets or for achieving specific initialization logic.
Passing the current object as an argument: In some cases, you might want to pass the current object instance as an argument to another method. You can use this to achieve this.
Understanding Constructors and Their Role in Object Initialization:
A constructor is a special type of method that is automatically called when an object is created. It initializes the object's state by assigning initial values to its fields.
Constructors have the same name as the class and do not have a return type, not even void.
In Java, if you don't explicitly define a constructor for a class, Java provides a default constructor with no arguments.
Constructors can be overloaded, meaning a class can have multiple constructors with different parameter lists. This allows for flexibility in object initialization.
Constructors play a crucial role in ensuring that objects are properly initialized before they are used, which is essential for maintaining the integrity and correctness of the program's logic.


----------------------------- OOP's  ---------------------------------------

Constructor:
Constructors are special methods in object-oriented programming that are used to initialize objects. When you create an object of a class using the new keyword, the constructor is automatically invoked to perform any necessary setup for the object.
Initializing object attributes: Constructors are typically used to assign initial values to an object's attributes. This ensures that objects are created in a consistent state.
Performing validation checks: Constructors can be used to validate the data that is being used to create an object. This can help to prevent errors in your program.
Controlling object creation: Constructors can be used to control how objects are created. For example, you can create a constructor that takes arguments, which allows you to specify the initial state of the object.

what is Array?
An array is a data structure that can hold a fixed number of elements, typically of the same data type, in a specific order. 
Arrays are used in programming to store multiple values in a single variable, and they allow for efficient access and manipulation of the elements based on their index positions.
Characteristics of Arrays:
Fixed Size: The size of an array is determined when it is created and cannot be changed.
Indexed: Each element in an array can be accessed using its index, which is a number representing its position in the array. Indexing typically starts from 0.
Homogeneous Elements: All elements in an array are of the same type (e.g., all integers, all strings).
Efficient Access: Arrays allow for constant time complexity O(1)O(1) for accessing elements using their index.

Types of Arrays:
*One-dimensional Array: A single row of elements. Example arr = [1, 2, 3, 4]
*Multi-dimensional Array: Arrays of arrays, such as two-dimensional (2D) arrays, which can be thought of as tables or matrices. Example:matrix = [[1, 2], [3, 4]]

Classses and Objects::
Object-oriented programming (OOP) is a programming paradigm based on the concept of "objects," 
which can contain data in the form of fields (attributes or properties) and code in the form of procedures (methods or functions).
A "class" serves as a blueprint or template for creating objects. It defines the properties (attributes) and behaviors (methods) that all objects of that class will have.
An "object" is an instance of a class. It represents a unique entity in a program, with its own set of attributes and behaviors defined by the class.

Declaring Classes, Creating Objects, and Accessing Object Members:
To declare a class in Java, you use the class keyword followed by the class name and a pair of curly braces {} to define the class body. 
Within the class body, you define fields (variables) to represent attributes and methods to define behaviors.
To create an object of a class, you use the new keyword followed by the class name and parentheses (). This allocates memory for the object and initializes its attributes based on the class definition.
You can access the members (fields and methods) of an object using the dot . operator. For example, objectName.fieldName accesses a field, and objectName.methodName() invokes a method.

Abstraction: 
in Java is a core concept of object-oriented programming (OOP) that focuses on hiding the complex implementation details of a system and exposing only the necessary and relevant parts to the user. It helps in reducing programming complexity and effort by allowing the programmer to focus on what an object does instead of how it does it.

Interface:
In Java, an interface is a reference type that can contain constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. By using interfaces, you can achieve a form of abstraction by specifying what methods a class must implement without dictating how these methods should be implemented. This allows for greater flexibility and decoupling in your code.

//interface is 100% abstraction 
all the methods or attributes are default public,static,final.
we implement the interface not extend
interface help us to multiple inheritence

Inheritance:
is a fundamental concept in object-oriented programming (OOP) that allows a new class (called a subclass or derived class) to inherit properties and behaviors (methods) from an existing class (called a superclass or base class). This mechanism promotes code reusability, modularity, and the creation of hierarchical relationships between classes.
Types of Inheritance in Java
Single Inheritance: A subclass inherits from one superclass.
Multilevel Inheritance: A subclass inherits from another subclass, forming a chain.
Hierarchical Inheritance: Multiple subclasses inherit from a single superclass.

Polymorphism: 
The word polymorphism means having many forms. In simple words, we can define Java Polymorphism as the ability of a message to be displayed in more than one form.
Real-life Illustration of Polymorphism: A person can have different characteristics at the same time. Like a man, at the same time, is a father, a husband, and an employee. 
So, the same person possesses different behaviors in different situations. This is called polymorphism.  Method Overloading is a Compile-time polymorphism.

Method Overloading:
it allows methods in the same class to have the same name but different signatures.
Method Overloading allows methods in the same class to have the same name but different signatures.
Signatures can differ by the number or type of input parameters, or a combination of both.
It's also known as Compile-time Polymorphism, Static Polymorphism, or Early binding.
In Method Overloading, the compiler selects the appropriate method based on the arguments provided during compile time.
When calling an overloaded method, Java gives priority to the child argument over the parent argument.

Signatures can differ by the number or type of input parameters, or a combination of both.
It's also known as Compile-time Polymorphism, Static Polymorphism, or Early binding.
In Method Overloading, the compiler selects the appropriate method based on the arguments provided during compile time.
When calling an overloaded method, Java gives priority to the child argument over the parent argument.

advantages of method Overloading:
Readability and Reusability: Enhances code clarity and promotes reusability by using the same method name for different functionalities.
Reduced Complexity: Simplifies code by eliminating the need for distinct method names, making program logic easier to manage.
Efficient Execution: Implementations to specific scenarios, enabling efficient task execution.
Flexible Access: Allows accessing methods with slight variations in arguments and types, enhancing flexibility.
Diverse Initialization: Extends to constructors, enabling diverse object initialization, and enhancing object creation flexibility


------------------------------- DSA -------------------------------------


what is StringBuilder
StringBuilder is a class used to create mutable (modifiable) sequences of characters. Unlike String, which is immutable, StringBuilder allows you to modify the content without creating a new object for each modification, making it more efficient for scenarios where frequent modifications are required.
Key Features of StringBuilder
Mutable: Unlike String, StringBuilder objects can be modified after they are created.
Efficient: More efficient for concatenating multiple strings compared to String due to reduced overhead from creating new objects.
Not Thread-Safe: Methods in StringBuilder are not synchronized, meaning they are not thread-safe. Use StringBuffer if thread safety is required.
Common Methods in StringBuilder
append(): Adds a string representation of any data type to the current sequence.
insert(): Inserts a string at the specified index.
replace(): Replaces characters in a substring with another string.
delete(): Removes characters from the sequence.
reverse(): Reverses the sequence.
toString(): Converts the sequence to a String object.
Not thread safe 
Not synchronised 
Faster

what isStringBuffer
StringBuffer is a class used for creating and manipulating sequences of characters. Like StringBuilder, StringBuffer is mutable, meaning its content can be modified after creation. However, StringBuffer is synchronized, making it thread-safe for use in concurrent programming environments.
Key Features of StringBuffer
Mutable: StringBuffer objects can be modified after they are created, unlike String.
Thread-Safe: Methods in StringBuffer are synchronized, ensuring that it is safe to use in multi-threaded environments.
Efficiency: More efficient for concatenating multiple strings compared to String due to reduced overhead from creating new objects.
Common Methods in StringBuffer
append(): Adds a string representation of any data type to the current sequence.
insert(): Inserts a string at the specified index.
replace(): Replaces characters in a substring with another string.
delete(): Removes characters from the sequence.
reverse(): Reverses the sequence.
toString(): Converts the sequence to a String object.
Thread safe
Synchronised
Slower

Recursion 
Recursion is a programming technique where a function calls itself directly or indirectly to solve a problem. It's a fundamental concept in computer science and can be a powerful tool for solving problems that exhibit repetitive structures or can be broken down into smaller, similar sub-problems.
Key Concepts of Recursion
Base Case: Every recursive function must have one or more base cases — specific conditions where the function stops calling itself and returns a value. This prevents infinite recursion.
Recursive Case: This is where the function calls itself with different arguments to solve a smaller instance of the same problem.
Stack Usage: Recursion uses the call stack to store intermediate values and function calls. Each recursive call adds a new frame to the stack, which is popped off when the base case is reached.
* used to complex Q by dividing big problems into smaller.
* it uses recursion stack, it takes more memory.
* approach is top to bottom & bottom to top.


Time and space complexity are metrics used to evaluate the efficiency of algorithms. 

Time Complexity
Time complexity measures the amount of time an algorithm takes to complete as a function of the length of the input. 
It is usually expressed using Big O notation, which describes the upper bound of the algorithm's running time.

Space Complexity
Space complexity measures the amount of memory an algorithm uses as a function of the length of the input. It includes both the memory
needed for the input data and any additional memory used by the algorithm. Space complexity is also expressed using Big O notation.

3 Time Complexity- Best Ω (Omega), Average θ (Theta), Worst O (Big O)
O(1): Constant time - the running time is independent of the input size.
O(n): Linear time - the running time grows linearly with the input size.
O(n^2): Quadratic time - the running time grows quadratically with the input size.
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
○ Insertion: Adding a new node at the beginning, end, or middle of the list.
○ Deletion: Removing a node from the list.
○ Traversal: Iterating through the list to access or manipulate nodes.
○ Search: Finding a node with a specific value or index.

<h2>Advantages</h2>
○ Dynamic size: Linked lists can grow or shrink in size during execution.
○ Ease of insertion and deletion: Adding or removing nodes doesn't require
shifting elements, unlike arrays.
○ Versatility: Different types of linked lists offer flexibility based on the
application needs.

<h2>Disadvantages</h2>
○ Memory Overhead: Each node in a linked list requires extra memory for
storing the link.
○ Traversal: Sequential access is slower compared to arrays because
elements are not stored contiguously in memory.
○ No Random Access: Unlike arrays, accessing an element at a particular
index requires traversing from the beginning.


<h2>Why Use Linked Lists</h2>

1. Dynamic Size: Unlike arrays, linked lists can grow and shrink in size dynamically. This makes them suitable for situations where the number of elements is unknown or varies significantly.
2. Efficient Insertions/Deletions: Insertions and deletions in a linked list are more efficient compared to arrays. Adding or removing elements can be done in constant time O(1) if the position is known, without the need to shift elements like in arrays.
3. Memory Utilization: Linked lists do not require a contiguous block of memory. This can help in better memory utilization, especially in systems with limited memory or fragmented memory.
4. Flexible Data Structures: Linked lists form the basis for implementing various other data structures such as stacks, queues, and graphs. They provide a flexible way to represent these structures.
5. Ease of Expansion: Adding new elements to a linked list does not require resizing or copying the existing elements, unlike dynamic arrays which might need to allocate new memory and copy old elements during resizing.


<h2>A doubly linked list</h2>

in Java is a data structure where each node contains references to both the next and the previous node in the sequence. This allows for traversal of the list in both directions. Here's a basic implementation:


<h2>Notes</h2>

*A DS in which elements are stored in non contiouos allocation memory | 
Each element in LL is a node.
*node is 2 types
1. data types
2. address which hold address of next node.
1st node called special node "head". 
Last node callend "tail". having address null.
insetion & deletion happens in constant time.
