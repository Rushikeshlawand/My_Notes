```plaintext
Object-Oriented Programming (OOP)
               |
    +----------+----------+
    |          |          |
Abstraction  Encapsulation  Inheritance
               |               |
    +----------+----------+    |
    |          |          |    |
Polymorphism  Association  Aggregation
               |
    +----------+
    |          
Types of Polymorphism
    |
    +-- Compile-Time Polymorphism
    |   - Method Overloading
    |
    +-- Runtime Polymorphism
        - Method Overriding
               
Types of Inheritance
    |
    +-- Single Inheritance
    |
    +-- Multiple Inheritance
    |
    +-- Hierarchical Inheritance
    |
    +-- Multilevel Inheritance
    |
    +-- Hybrid Inheritance
```

# Object-Oriented Programming (OOP) in Java

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects," which are instances of classes. OOP helps in organizing and structuring code in a way that promotes reusability, maintainability, and scalability. The core principles of OOP include Encapsulation, Inheritance, Polymorphism, and Abstraction.
## 1. Encapsulation

### Definition
Encapsulation is the concept of wrapping data (attributes) and methods (functions) into a single unit, called a class. It helps in hiding the internal state of an object and only exposing the necessary parts. This principle is similar to how a pill is wrapped in a protective coating. The pill itself (data) is concealed within the coating, which controls how and when it interacts with the body (methods).

### Example
Imagine a pill with a coating that prevents it from dissolving until it reaches the right part of the digestive system. Similarly, in encapsulation, the internal details of a class (such as its data and how it is manipulated) are hidden from the outside world. Users of the class interact with it through well-defined methods, just as a pill's coating ensures that the medicine is released in a controlled manner.

### Implementation
Encapsulation is implemented by:
1. **Declaring Variables as Private**: This restricts direct access to the data members of the class from outside its scope, ensuring that the data is protected.
2. **Providing Public Getter and Setter Methods**: These methods allow controlled access to the private data. Getters retrieve the value of private variables, and setters modify them while ensuring that any required validation is performed.
```plaintext
+--------------------+
|    Person          |
+--------------------+
| - name: String     |
| - age: int         |
+--------------------+
| + getName(): String|
| + setName(name: String): void |
| + getAge(): int    |
| + setAge(age: int): void       |
+--------------------+
```
### Code Example

```java
public class Person {
    // Private variables (data hiding)
    private String name;
    private int age;

    // Public getter and setter methods (access control)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}
```

# Inheritance in Object-Oriented Programming (OOP)

## Definition

Inheritance is a fundamental concept in OOP that allows a new class (child or subclass) to inherit attributes and methods from an existing class (parent or superclass). This mechanism promotes code reusability and establishes a hierarchical relationship between classes.

```plaintext
Inheritance
    |
    +-- Single Inheritance
    |   - A single parent class is inherited by a single child class.
    |
    +-- Multiple Inheritance
    |   - A child class inherits from more than one parent class.
    |
    +-- Hierarchical Inheritance
    |   - Multiple child classes inherit from a single parent class.
    |
    +-- Multilevel Inheritance
    |   - A class inherits from another class which is also a subclass of another class.
    |
    +-- Hybrid Inheritance
        - A combination of two or more types of inheritance.
```

### Types of Inheritance

1. **Single Inheritance**
   - **Description**: A subclass inherits from a single superclass.
   - **Example**: A `Dog` class inherits from an `Animal` class.

```plaintext
   Superclass
       |
       |
   Subclass
```

```java
// Parent class
public class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class inheriting from Animal
public class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Method inherited from Animal class
        myDog.bark(); // Method from Dog class
    }
}
```
2. **Multiple Inheritance** (not supported in java but through interfaces we can implement)
   - **Description**: A subclass can inherit from multiple interfaces. Java supports multiple inheritance through interfaces but not through classes.
   - **Example**: A `Smartphone` class implements both `Phone` and `Camera` interfaces.
```plaintext
 Superclass1
       |      
       |      
   Superclass2
       |
       |
   Subclass
```

```java
// First interface
interface Animal {
    void eat();
}

// Second interface
interface Pet {
    void play();
}

// Class implementing both interfaces
class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("The dog eats food.");
    }

    public void play() {
        System.out.println("The dog plays with a ball.");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Interface method
        dog.play(); // Interface method
    }
}
```


3. **Multilevel Inheritance**
   - **Description**: A subclass inherits from another subclass, creating a chain of inheritance.
   - **Example**: A `GoldenRetriever` class inherits from a `Dog` class, which inherits from an `Animal` class.

```plaintext
Grandparent
       |
       |
   Parent
       |
       |
   Child
   ```

```java
// Grandparent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Parent class
class Mammal extends Animal {
    void breathe() {
        System.out.println("This mammal breathes air.");
    }
}

// Child class
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited from Animal
        dog.breathe(); // Inherited from Mammal
        dog.bark(); // Specific to Dog
    }
}

```

4. **Hierarchical Inheritance**
   - **Description**: Multiple subclasses inherit from a single superclass.
   - **Example**: `Cat` and `Dog` classes both inherit from an `Animal` class.

```plaintext
    Superclass
       /       \
     /          \
 Subclass1  Subclass2
      \
        \
    Subclass3
```

```java
// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass 1
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Subclass 2
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited from Animal
        dog.bark(); // Specific to Dog

        Cat cat = new Cat();
        cat.eat(); // Inherited from Animal
        cat.meow(); // Specific to Cat
    }
}

```

5. **Hybrid Inheritance**
   - **Description**: A combination of two or more types of inheritance, typically achieved through interfaces.
   - **Example**: A `FlyingCar` class inherits from both `Car` and `FlyingVehicle` interfaces.

```plaintext
    ClassA
      /  \
     /    \
    /      \
 ClassB  ClassC
     \        /
      \     /
       ClassD
```

```java
// Interface 1
interface Animal {
    void eat();
}

// Interface 2
interface Pet {
    void play();
}

// Class inheriting from interfaces and another class
class Mammal {
    void breathe() {
        System.out.println("This mammal breathes air.");
    }
}

// Class implementing both interfaces and extending a class
class Dog extends Mammal implements Animal, Pet {
    public void eat() {
        System.out.println("The dog eats food.");
    }

    public void play() {
        System.out.println("The dog plays with a ball.");
    }
}

public class HybridInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // From Animal interface
        dog.play(); // From Pet interface
        dog.breathe(); // From Mammal class
    }
}
```
# Benefits of Inheritance

Inheritance provides several advantages that contribute to a more efficient and organized codebase. Here are the key benefits:

## Code Reusability

Inheritance allows the reuse of existing code by creating new classes based on existing ones. This reduces redundancy and avoids code duplication. Instead of rewriting the same methods and attributes, you can extend a class and inherit its features, making development faster and more maintainable.

## Method Overriding

Inheritance enables method overriding, where a subclass provides a specific implementation of a method that is already defined in its superclass. This allows subclasses to modify or extend the behavior of inherited methods to suit their needs, promoting flexibility and customization.

## Hierarchical Classification

Inheritance supports hierarchical classification, where classes are organized into a hierarchy. This hierarchical structure helps in organizing and managing code more effectively, making it easier to understand and maintain. It also facilitates the creation of a logical relationship between classes, improving code readability and structure.

# Polymorphism in Java

**Definition:**
Polymorphism is a core concept in object-oriented programming that allows objects to be treated as instances of their parent class rather than their actual class. The term polymorphism means "many forms," and it allows one interface to be used for a general class of actions. The specific action is determined by the exact nature of the situation.

```plaintext
Polymorphism
    |
    +-- Compile-Time Polymorphism
    |   - Achieved through method overloading (same method name with different parameters).
    |
    +-- Runtime Polymorphism
        - Achieved through method overriding (overriding methods in subclasses with the same name as in parent class).
```

Polymorphism in Java can be achieved through:

1. **Compile-Time Polymorphism (Method Overloading)**
2. **Runtime Polymorphism (Method Overriding)**

## Compile-Time Polymorphism (Method Overloading)

**Definition:**
Compile-time polymorphism, also known as method overloading, allows a class to have multiple methods with the same name but different parameter lists (different type, number, or both). This is resolved during the compilation of the program.

### How It Works:
- **Method Signature:** The method signature consists of the method name and the parameter list.
- **Method Resolution:** The appropriate method is chosen based on the method signature during compile-time.

### Example:

```java
class MathOperations {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTimePolymorphismExample {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        // Calling the method with two integer parameters
        System.out.println("Sum (int): " + mathOps.add(10, 20));

        // Calling the overloaded method with two double parameters
        System.out.println("Sum (double): " + mathOps.add(10.5, 20.5));

        // Calling the overloaded method with three integer parameters
        System.out.println("Sum (int, int, int): " + mathOps.add(10, 20, 30));
    }
}
```
## Runtime Polymorphism (Method Overriding)

**Definition:**  
Runtime polymorphism, also known as method overriding, allows a subclass to provide a specific implementation for a method that is already defined in its superclass. The decision about which method to execute is made at runtime based on the object's actual class.

### How It Works:

1. **Method Inheritance:** The subclass inherits the method from the superclass.

2. **Method Override:** The subclass provides a specific implementation for the inherited method.

3. **Dynamic Method Dispatch:** The JVM determines the actual method to be called based on the object's runtime type.

```java
// Superclass
class Animal {
    // Method in the superclass
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Method overridden in the subclass
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Another subclass
class Cat extends Animal {
    // Method overridden in the subclass
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphismExample {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Method calls
        myDog.makeSound(); // Output: Dog barks
        myCat.makeSound(); // Output: Cat meows
    }
}
```
# Abstraction

## Definition
Abstraction is the concept of hiding the complex implementation details of an object and exposing only the essential features or functionalities to the user. It allows the user to focus on what an object does rather than how it does it. This is one of the four pillars of Object-Oriented Programming (OOP) and is crucial for reducing complexity and increasing efficiency in software development.

### Key Points:
- **Focus on Essential Features**: Abstraction highlights only the necessary details, allowing users to interact with a simplified model of the system.
- **Hiding Complexity**: By hiding the underlying implementation details, abstraction prevents users from getting overwhelmed by the internal workings of the system.

## How It Works
Abstraction in Java is typically achieved through abstract classes and interfaces.

- **Abstract Classes**: These classes cannot be instantiated on their own and can contain both abstract methods (without implementation) and concrete methods (with implementation). Subclasses of an abstract class must provide implementations for all abstract methods.
- **Interfaces**: Interfaces define a contract that implementing classes must follow. All methods in an interface are abstract by default (until Java 8, which introduced default methods).

## Example 1: Abstract Class in Java

### Code Example

```java
abstract class Vehicle {
    abstract void start(); // Abstract method

    void stop() { // Concrete method
        System.out.println("The vehicle is stopped.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("The car is starting.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Outputs: The car is starting.
        car.stop();  // Outputs: The vehicle is stopped.
    }
}
```
# Benefits of Abstraction

Abstraction is a fundamental concept in object-oriented programming that brings several advantages to software development. Here are the key benefits of using abstraction:

## Simplicity
By hiding unnecessary details, abstraction makes it easier to work with complex systems. It simplifies the user interface by exposing only the essential features, making the system more user-friendly and easier to understand.

## Modularity
Abstraction encourages the division of code into smaller, manageable parts. Each part or module of the code focuses on a specific aspect of the system, which makes the codebase more organized and easier to maintain.

## Maintainability
Abstracted code is easier to modify or extend since the details are hidden from the user. Changes made to the internal implementation of an abstracted module do not affect other parts of the system, reducing the risk of introducing errors and improving code maintainability.

## Security
Abstraction allows developers to expose only the essential parts of the code while keeping critical implementation details secure. This helps protect sensitive information and prevents unauthorized access to the underlying logic, enhancing the security of the application.

# Interfaces in Java

## Definition

An interface in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces are used to specify a set of methods that implementing classes must provide. They help in defining a contract for what a class can do, without specifying how it does it.

## Key Points

- **Abstract Methods**: Interfaces primarily contain abstract methods (methods without a body). These methods must be implemented by any class that implements the interface.
- **Default Methods**: Interfaces can also include default methods with an implementation. These methods provide a default behavior that can be overridden by implementing classes.
- **Static Methods**: Interfaces can define static methods that are associated with the interface itself rather than any instance of a class.
- **Constants**: Interfaces can contain constants (public static final variables).

## Types of Interfaces

1. **Marker Interface**: An interface with no methods or fields. It is used to mark a class with some property.
   - Example: `Serializable`, `Cloneable`.

2. **Functional Interface**: An interface with exactly one abstract method. It can have multiple default or static methods.
   - Example: `Runnable`, `Callable`.

3. **Normal Interface**: An interface with multiple abstract methods.
   - Example: `List`, `Comparable`.

## Usage

- **Defining Contracts**: Interfaces are used to define a contract that other classes must adhere to.
- **Multiple Inheritance**: Java supports multiple inheritance through interfaces, allowing a class to implement multiple interfaces.
- **Loose Coupling**: Interfaces help in achieving loose coupling by decoupling the implementation from the interface.

## Example
```java
@FunctionalInterface
public interface Calculator {
    int calculate(int a, int b);

    // Default method
    default int add(int a, int b) {
        return a + b;
    }

    // Static method
    static int multiply(int a, int b) {
        return a * b;
    }
}

public class CalculatorImpl implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new CalculatorImpl();
        System.out.println("Result: " + calc.calculate(10, 5));
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Multiplication: " + Calculator.multiply(10, 5));
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
