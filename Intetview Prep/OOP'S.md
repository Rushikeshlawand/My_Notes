# Object-Oriented Programming (OOP) in Java

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects," which are instances of classes. OOP helps in organizing and structuring code in a way that promotes reusability, maintainability, and scalability. The core principles of OOP include Encapsulation, Inheritance, Polymorphism, and Abstraction.
# OOP vs POP

| Feature                        | Object-Oriented Programming (OOP)                                  | Procedural-Oriented Programming (POP)                     |
|--------------------------------|---------------------------------------------------------------------|----------------------------------------------------------|
| **Paradigm**                  | Based on objects that encapsulate data and behavior                | Based on procedures or routines (functions)               |
| **Data Handling**             | Data and methods are bundled together in classes                   | Data is separate from functions; functions operate on data |
| **Code Reusability**          | Achieved through inheritance and polymorphism                      | Achieved through function reuse and modularity            |
| **Abstraction**               | Achieved using classes and interfaces                               | Achieved using functions and modules                       |
| **Encapsulation**             | Supports encapsulation through access modifiers                    | Lacks built-in encapsulation; relies on disciplined coding |
| **Inheritance**               | Supports inheritance for extending class functionalities            | No inheritance; code is reused by calling functions       |
| **Polymorphism**              | Supports polymorphism, allowing methods to do different things based on the object | No built-in polymorphism; functions can be overloaded but not overridden |
| **State**                     | Objects maintain state through instance variables                   | Global variables maintain state, which can lead to side effects |
| **Design Complexity**         | More complex due to the use of objects and classes                  | Simpler and easier to understand for small programs       |
| **Examples**                  | Java, C++, Python, C#                                             | C, Pascal, BASIC                                         |


## 1. Encapsulation
### Definition

Encapsulation is the concept of wrapping data (attributes) and methods (functions) into a single unit, called a class. It helps in hiding the internal state of an object and only exposing the necessary parts. This principle is similar to how a pill is wrapped in a protective coating. The pill itself (data) is concealed within the coating, which controls how and when it interacts with the body (methods).

### Example

Imagine a pill with a coating that prevents it from dissolving until it reaches the right part of the digestive system. Similarly, in encapsulation, the internal details of a class (such as its data and how it is manipulated) are hidden from the outside world. Users of the class interact with it through well-defined methods, just as a pill's coating ensures that the medicine is released in a controlled manner.

### Implementation

Encapsulation is implemented by:

1. **Declaring Variables as Private**: This restricts direct access to the data members of the class from outside its scope, ensuring that the data is protected.
2. **Providing Public Getter and Setter Methods**: These methods allow controlled access to the private data. Getters retrieve the value of private variables, and setters modify them while ensuring that any required validation is performed.

### Practical Benefits of Encapsulation:

- **Data Integrity**: Encapsulation ensures that object data is not directly exposed or modified, which reduces the risk of invalid data being set.
- **Controlled Access**: By providing getter and setter methods, you can control how the internal state of the object is accessed and updated. You can add validation, logging, or other logic inside these methods without changing the interface.
- **Modularity and Maintenance**: Since the data is hidden behind methods, changes in the data structure (e.g., changing the data types) do not affect other parts of the code that rely on the class, as long as the public methods remain consistent.

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
public class encapsulation {
    private String name;
    private int age;

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
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public static void main(String[] args) {
        encapsulation person = new encapsulation();
        person.setName("John Doe");
        person.setAge(25);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

```

# Inheritance in Object-Oriented Programming (OOP)

## Definition

Inheritance is a fundamental concept in OOP that allows a new class (child or subclass) to inherit attributes and methods from an existing class (parent or superclass). This mechanism promotes code reusability and establishes a hierarchical relationship between classes.

```java
// Base class (Parent)
class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void honk() {
        System.out.println("Beep beep!");
    }
}

// Derived class (Child)
class Car extends Vehicle {
    private int doors;

    public Car(String brand, int doors) {
        super(brand); // Call the parent class constructor
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void displayInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Doors: " + getDoors());
    }
}

// Main class to test inheritance
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        car.honk(); // Method inherited from Vehicle class
        car.displayInfo(); // Method in Car class
    }
}

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

## Code Reusability

Inheritance allows the reuse of existing code by creating new classes based on existing ones. This reduces redundancy and avoids code duplication. Instead of rewriting the same methods and attributes, you can extend a class and inherit its features, making development faster and more maintainable.

## Method Overriding

Inheritance enables method overriding, where a subclass provides a specific implementation of a method that is already defined in its superclass. This allows subclasses to modify or extend the behavior of inherited methods to suit their needs, promoting flexibility and customization.

## Hierarchical Classification

Inheritance supports hierarchical classification, where classes are organized into a hierarchy. This hierarchical structure helps in organizing and managing code more effectively, making it easier to understand and maintain. It also facilitates the creation of a logical relationship between classes, improving code readability and structure.

# Polymorphism in Java

**Definition:**
Polymorphism is a core concept in object-oriented programming that allows objects to be treated as instances of their parent class rather than their actual class. The term polymorphism means "many forms," and it allows one interface to be used for a general class of actions. The specific action is determined by the exact nature of the situation.

```java
// Base class
class Animal {
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}

// Derived class (Overriding)
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }
}

// Derived class (Overriding)
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("The cat meows");
    }
}

// Polymorphism with method overloading
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        // Method overriding: runtime polymorphism
        Animal myDog = new Dog(); // Dog is a subclass of Animal
        Animal myCat = new Cat(); // Cat is a subclass of Animal

        myDog.sound(); // Outputs: The dog barks
        myCat.sound(); // Outputs: The cat meows

        // Method overloading: compile-time polymorphism
        Calculator calc = new Calculator();
        System.out.println("Sum of integers: " + calc.add(5, 10));        // Outputs: 15
        System.out.println("Sum of doubles: " + calc.add(5.5, 10.2));     // Outputs: 15.7
    }
}

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

### Key Points:

- **Abstraction**: Abstraction in Java is achieved using abstract classes and methods. It allows you to define methods that must be implemented by any concrete subclass, without specifying the exact implementation in the abstract class itself.
- **Abstract Classes**: Abstract classes cannot be instantiated directly and are used as templates for other classes. They can contain both abstract methods (without implementation) and non-abstract methods (with implementation).
- **Concrete Subclasses**: Subclasses of an abstract class must implement all abstract methods of the parent class.

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

### Key Points:

- **Interfaces**: Interfaces in Java define a contract that implementing classes must fulfill by providing concrete implementations for the methods declared in the interface.
- **Multiple Inheritance**: A class can implement multiple interfaces, allowing Java to support a form of multiple inheritance, which is not possible with classes.
- **Polymorphism**: Interfaces allow for polymorphism by letting you use interface references to point to objects of any class that implements the interface.

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

| Feature              | `extends`                                             | `implements`                                                         |
| -------------------- | ----------------------------------------------------- | -------------------------------------------------------------------- |
| **Purpose**          | Used for class inheritance                            | Used to implement an interface                                       |
| **Inheritance Type** | Single inheritance (one class)                        | Multiple inheritance (multiple interfaces)                           |
| **Usage**            | Used with classes                                     | Used with interfaces                                                 |
| **Access**           | Inherits properties and methods from the parent class | Must provide implementation for all methods defined in the interface |
| **Syntax**           | `class ChildClass extends ParentClass { ... }`        | `class SomeClass implements Interface1, Interface2 { ... }`          |


## What is the difference between an Abstract Class and an Interface?

| Feature                          | Abstract Class                                      | Interface                                      |
|----------------------------------|----------------------------------------------------|------------------------------------------------|
| **Definition**                   | An abstract class can have both abstract methods (without implementation) and concrete methods (with implementation). | An interface can only declare methods without implementation (though default methods can have implementation in modern Java). |
| **Inheritance**                  | A class can extend only one abstract class (single inheritance). | A class can implement multiple interfaces (multiple inheritance of types). |
| **Access Modifiers**             | Can have access modifiers for its methods and fields (e.g., public, protected, private). | All methods in an interface are implicitly public and abstract. Fields are public, static, and final by default. |
| **Purpose**                      | Used when classes share a common base but also have their specific implementations. | Used to define a contract that implementing classes must fulfill, promoting loose coupling. |
| **Constructor**                  | Can have constructors to initialize fields. | Cannot have constructors since interfaces cannot be instantiated. |
| **Field Definitions**            | Can have instance variables and static variables. | Cannot have instance variables; only static final variables are allowed. |