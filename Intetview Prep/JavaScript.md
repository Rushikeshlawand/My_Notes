# JavaScript Interview Preparation Topics

## 1. JavaScript Basics

- **Variables and Data Types**: Understanding `var`, `let`, `const`, and primitives like number, string, boolean, null, undefined, and symbol.
- **Control Flow**: `if`, `else`, `switch`, `for`, `while`, `do...while`.
- **Functions**: Function declarations, expressions, and arrow functions.
- **Scope & Hoisting**: Differences between global, function, block scope, and lexical scope.
- **Closures**: Explanation and usage.

## 2. Advanced JavaScript

- **Prototypes & Inheritance**: Object prototypes, prototype chaining, and inheritance.
- **Asynchronous JavaScript**: Promises, async/await, callbacks, and event loops.
- **Event Handling**: Understanding event delegation, event listeners, and handling events.
- **DOM Manipulation**: Document Object Model, traversing and modifying DOM elements.

## 3. JavaScript ES6+ Features

- **Destructuring**: Arrays and objects destructuring.
- **Spread and Rest Operators**: Usage in functions and objects.
- **Template Literals**: String interpolation and multi-line strings.
- **Modules**: Import/export, working with modules.

## 4. Error Handling

- **Try/Catch/Finally**: Understanding error handling in JavaScript.
- **Custom Error Handling**: Creating custom errors and using the `Error` object.


# Differences Between var, let, and const in JavaScript

| Feature                  | `var`                           | `let`                           | `const`                         |
|--------------------------|---------------------------------|--------------------------------|---------------------------------|
| Scope                    | Function Scoped                 | Block Scoped                   | Block Scoped                    |
| Hoisting                 | Hoisted to the top of the function scope | Hoisted but not initialized (ReferenceError) | Hoisted but not initialized (ReferenceError) |
| Redeclaration            | Allowed                        | Not Allowed                    | Not Allowed                     |
| Reassignment             | Allowed                        | Allowed                        | Not Allowed                     |
| Use Case                 | Used in legacy code, function-wide variables | Used for variables that need to change | Used for constants or immutable variables |
| Example                  | `var x = 10;`                 | `let y = 20;`                 | `const z = 30;`                |

## Summary

- **`var`** is function-scoped and allows redeclaration and reassignment. It's less predictable due to hoisting and can lead to bugs in large codebases.
- **`let`** is preferred for variables that may need to change over time and is block-scoped, which helps manage variables more predictably.
- **`const`** is used for variables that should remain unchanged after they are set. It is also block-scoped, ensuring better management and control over variable states.

By understanding these key differences, you can choose the appropriate declaration based on the needs of your application.

# JavaScript Data Types

| Type           | Description                                    |
|----------------|------------------------------------------------|
| **Primitive**  |                             |
| Number         | Represents both integer and floating-point numbers. |
| String         | Represents a sequence of characters.            |
| Boolean        | Represents a logical entity and can have two values: `true` or `false`. |
| Undefined      | A variable that has been declared but has not yet been assigned a value. |
| Null           | Represents the intentional absence of any object value. |
| Symbol         | Represents a unique and immutable identifier (ES6). |
| BigInt         | Represents integers with arbitrary precision (ES11). |

| Type           | Description                                    |
|----------------|------------------------------------------------|
| **Non-Primitive**|                            |
| Object         | A collection of properties, each with a key and value (could be of any type). |
| Array          | A special type of object used for storing multiple values in a single variable. |
| Function       | A block of code designed to perform a particular task, considered as objects. |
| Date           | An object for handling dates and times.        |
| RegExp         | A regular expression object for matching text patterns. |

# Key Points

## Primitive Data Types
- Simple data types that represent a single value.
- They are **immutable** (cannot be changed).
- Stored directly in the **stack memory**.

## Non-Primitive Data Types
- Complex data types that can hold multiple values.
- They are **mutable** (can be changed).
- Stored in the **heap memory**, with references in the **stack**.

# Memory Management in JavaScript

## 1. Memory Allocation
When you declare variables, JavaScript allocates memory based on the data type:

### Stack Memory
- Used for managing primitive types and variable references.
- Fast access and deallocation, but limited in size.

### Heap Memory
- Used for objects and arrays.
- More memory available, but access can be slower.

## 2. Garbage Collection
JavaScript has a garbage collection mechanism that automatically frees up memory:

- **Reference Counting**: Keeps track of how many references point to an object.
- **Mark and Sweep**: Marks objects that are reachable and clears those that are not.

## 3. Scope and Lifetime
The scope of a variable determines how long it is accessible:

- **Global Scope**: Accessible anywhere in the code.
- **Function Scope**: Accessible within the function where it’s defined.
- **Block Scope**: Available within curly braces `{}` (using `let` and `const`).

# Understanding Scope in Programming

Scope refers to the visibility or accessibility of variables in different parts of your code. Here we will discuss four types of scopes: **Global**, **Function**, **Block**, and **Lexical Scope**.

## 1. Global Scope

- **Definition**: A variable defined in the global scope can be accessed from anywhere in the code, including inside functions or blocks.
- **Example**:
    ```javascript
    let globalVar = "I am global";

    function showGlobal() {
        console.log(globalVar); // Accessible here
    }
    
    showGlobal(); // Output: "I am global"
    ```

- **Key Points**:
    - Variables in the global scope are declared outside of any functions or blocks.
    - They can lead to potential naming conflicts if different parts of the code use the same names.

## 2. Function Scope

- **Definition**: A variable defined within a function is called local to that function and cannot be accessed from outside it.
- **Example**:
    ```javascript
    function myFunction() {
        let localVar = "I am local"; // Local to myFunction
        console.log(localVar); // Output: "I am local"
    }

    myFunction();
    console.log(localVar); // Error: localVar is not defined
    ```

- **Key Points**:
    - Variables declared with `let` or `const` inside a function are limited to that function.
    - Global variables can be accessed within a function.

## 3. Block Scope

- **Definition**: Variables defined within a block, such as loops or `if` statements, are limited to that block only.
- **Example**:
    ```javascript
    {
        let blockVar = "I am in a block";
        console.log(blockVar); // Output: "I am in a block"
    }

    console.log(blockVar); // Error: blockVar is not defined
    ```

- **Key Points**:
    - Block scope is created by `{}` and is supported by `let` and `const` but not by `var`.
    - This helps to avoid variable hoisting issues and potential conflicts.

## 4. Lexical Scope

- **Definition**: Lexical scope means that the scope of a variable is determined by its physical placement in the source code. Inner functions have access to the variables of outer functions.
- **Example**:
```javascript
    function outerFunction() {
        let outerVar = "I am outer";

        function innerFunction() {
            console.log(outerVar); // Accessible here
        }

        innerFunction(); // Output: "I am outer"
    }

    outerFunction();
```

- **Key Points**:
    - Functions scope can be nested, and the inner function can access variables of its outer function.
    - It helps in maintaining closure, where inner functions retain access to their outer function’s scope even after the outer function has finished executing.

## Summary

- **Global Scope**: Accessible anywhere in the code.
- **Function Scope**: Accessible only inside the function.
- **Block Scope**: Accessible only within the block defined by `{}`.
- **Lexical Scope**: Visibility based on the position in the code—inner functions can access outer variables.

