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

# Coding Implementation 
```Java

// Abstract class representing a general Animal
abstract class Animal {
    // Encapsulated fields
    private String name;
    private int age;

    // Constructor to initialize Animal
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    // Getter and Setter for 'age'
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Abstract method to be implemented by subclasses
    public abstract void makeSound();

    // Concrete method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Derived class Dog inheriting from Animal
class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age); // Calling superclass constructor
        this.breed = breed;
    }

    // Getter and Setter for 'breed'
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Overriding the abstract method
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof!");
    }

    // Overloading method
    public void makeSound(String sound) {
        System.out.println(getName() + " says: " + sound);
    }
}

// Derived class Cat inheriting from Animal
class Cat extends Animal {
    private String color;

    // Constructor
    public Cat(String name, int age, String color) {
        super(name, age); // Calling superclass constructor
        this.color = color;
    }

    // Getter and Setter for 'color'
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Overriding the abstract method
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }
}

// Interface demonstrating Abstraction
interface Pet {
    void play();
}

// Dog class implementing Pet interface
class PetDog extends Dog implements Pet {

    public PetDog(String name, int age, String breed) {
        super(name, age, breed);
    }

    // Implementing play method from Pet interface
    @Override
    public void play() {
        System.out.println(getName() + " is playing fetch.");
    }

    // Overriding to demonstrate polymorphism
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Bark Bark!");
    }
}

// Main class to demonstrate OOP concepts
public class OOPSDemo {
    public static void main(String[] args) {
        // Encapsulation: Accessing private fields via getters and setters
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        dog.setAge(4); // Setting age using setter
        System.out.println(dog.getName() + " is " + dog.getAge() + " years old and is a " + dog.getBreed());

        Cat cat = new Cat("Whiskers", 2, "Black");
        System.out.println(cat.getName() + " is " + cat.getAge() + " years old and has " + cat.getColor() + " color.");

        // Inheritance and Polymorphism
        Animal[] animals = {dog, cat, new PetDog("Max", 5, "Bulldog")};
        for(Animal animal : animals){
            animal.makeSound(); // Dynamic method dispatch
            animal.sleep();
            System.out.println();
        }

        // Using overloaded method
        dog.makeSound("Woof Woof!");

        // Using interface method
        Pet petDog = new PetDog("Rocky", 6, "German Shepherd");
        petDog.play();
    }
}

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
