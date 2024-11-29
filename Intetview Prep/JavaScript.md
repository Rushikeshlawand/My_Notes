## What is JavaScript?

JavaScript is a high-level, lightweight, interpreted programming language. It is widely used to add interactivity and dynamic features to web pages. It is one of the core technologies of the web, alongside HTML and CSS.

- Type: Client-side (runs in the browser) and server-side (using Node.js).
- Paradigms: Supports event-driven, functional, and object-oriented programming.
- Execution Environment: Runs in the browser or on servers via environments like Node.js.

## Why is JavaScript Used?

- **Client-Side Interactivity**:  
  JavaScript enhances user experience by making web pages interactive without reloading the page.  
  - **Example**: Form validation, dynamic dropdowns, modals.

- **Dynamic Content Manipulation**:  
  JavaScript can manipulate the Document Object Model (DOM) to dynamically update content.  
  - **Example**: Real-time updating of a user’s feed on a social media site.

- **Server-Side Development**:  
  With Node.js, JavaScript is also used for backend development, handling databases, APIs, and server logic.

- **Rich User Interfaces**:  
  Frameworks like React.js, Angular, and Vue.js enable creating Single Page Applications (SPAs).  
  - **Example**: Gmail or Google Docs.

- **Cross-Platform Development**:  
  Tools like React Native and Electron allow building mobile and desktop applications using JavaScript.

- **Extensive Ecosystem**:  
  JavaScript has a vast ecosystem of libraries and frameworks (e.g., jQuery, D3.js) to simplify development tasks.

# What is a JavaScript Engine?

A JavaScript engine is a program or interpreter that executes JavaScript code. It parses the JavaScript code, compiles it into optimized machine code, and executes it efficiently. JavaScript engines power browsers and server-side platforms like Node.js.

---

## Client-Side and Server-Side Explained

In web development, client-side and server-side refer to where code is executed: on the user's device (client) or the web server. Both sides work together to deliver the functionality of a web application.

### 1. Client-Side (Frontend)

- **Definition**:  
  Client-side code runs in the user's browser. It is responsible for what users see and interact with directly.

- **Technologies**:  
  HTML, CSS, JavaScript, and frameworks/libraries like React.js, Angular, and Vue.js.

- **Tasks Handled by Client-Side**:  
  - Rendering user interfaces (UI).  
  - Validating user inputs (e.g., checking email format in a form).  
  - Handling interactivity (e.g., dropdown menus, modals).  
  - Communicating with the server using APIs (e.g., fetch or Axios).

- **Example**:  
  A shopping cart on an e-commerce website.  
  - Clicking "Add to Cart" updates the cart icon dynamically without reloading the page.  
  - This action is implemented using JavaScript running on the browser.

---

### 2. Server-Side (Backend)

- **Definition**:  
  Server-side code runs on the web server. It handles data storage, business logic, and communication between the database and client.

- **Technologies**:  
  Node.js, Python (Django, Flask), Java (Spring), PHP, Ruby on Rails, etc.

- **Tasks Handled by Server-Side**:  
  - Authenticating users (e.g., login credentials).  
  - Processing form submissions (e.g., storing data in a database).  
  - Serving dynamic content (e.g., fetching personalized user data).  
  - Managing APIs and database operations.

- **Example**:  
  Submitting a login form:  
  - The server checks the entered credentials against the database.  
  - If valid, it sends a session or token back to the browser for authentication.

---

## Comparison Table

| **Aspect**          | **Client-Side**                               | **Server-Side**                          |
|----------------------|-----------------------------------------------|------------------------------------------|
| **Execution Location** | Runs in the browser (user’s device).          | Runs on the web server.                  |
| **Technologies**      | HTML, CSS, JavaScript, React, Vue, Angular     | Node.js, Python, PHP, Java, Ruby, etc.   |
| **Focus**            | UI, interactivity, and user experience.        | Data processing, storage, and logic.     |
| **Speed**            | Faster; doesn’t depend on the server.          | Slower; depends on server processing.    |
| **Examples**         | Animations, form validation.                   | Authenticating users, fetching data.     |

# What are let, var, and const in JavaScript?

`let`, `var`, and `const` are keywords used to declare variables in JavaScript. They differ in scope, re-declaration, and mutabilit

### 1. var
- Introduction: The oldest way to declare variables (ES5 and earlier).
- Scope: Function-scoped (not block-scoped).
- Re-declaration: Can be re-declared and updated in the same scope.
- Hoisting: Variables declared with var are hoisted but initialized as undefined.
 
```javascript
var x = 10;
if (true) {
  var x = 20; // Updates the same variable
  console.log("Inside if block with var:", x); // 20
}
console.log("Outside if block with var:", x); // 20
```
 ### 2. let
- Introduction: Introduced in ES6 (2015).
- Scope: Block-scoped (only accessible within {}).
- Re-declaration: Cannot be re-declared in the same scope, but can be updated.
- Hoisting: Variables declared with let are hoisted but not initialized (Temporal Dead Zone).

```javascript
let y = 10;
if (true) {
  let y = 20; // New variable, block-scoped
  console.log("Inside if block with let:", y); // 20
}
console.log("Outside if block with let:", y); // 10
```
### 3. const
- Introduction: Introduced in ES6 (2015).
- Scope: Block-scoped.
- Re-declaration: Cannot be re-declared or updated in the same scope.
- Mutability: Values themselves can’t be reassigned, but if it’s an object or array, properties or elements can be mutated.
- Hoisting: Same as let, it has a Temporal Dead Zone.

```javascript
const z = 10;
z = 20; // Error: Assignment to constant variable
const obj = { name: "Alice" };
obj.name = "Bob"; // Allowed: Object properties can be modified
console.log("Modified object with const:", obj.name); // Bob
```

### Differences Between var, let, and const:
 | Aspect           | var                         | let                         | const                       |
 |-------------------|-----------------------------|-----------------------------|-----------------------------|
 | Scope            | Function-scoped            | Block-scoped                | Block-scoped                |
 | Re-declaration   | Allowed                    | Not allowed                 | Not allowed                 |
 | Updation         | Allowed                    | Allowed                     | Not allowed                 |
 | Hoisting         | Hoisted and initialized    | Hoisted but not initialized | Hoisted but not initialized |
 | Use Case         | Avoid using (legacy code)  | Use for variables that change | Use for constants          |


## What is DOM (Document Object Model)?

The Document Object Model (DOM) is a programming interface for web documents. It represents the structure of an HTML or XML document as a tree-like hierarchy, allowing developers to manipulate content, structure, and style dynamically using JavaScript.

### Key Features of the DOM

- **Tree-Like Structure**:
  - The DOM represents a document as a tree of nodes, where each element, attribute, and piece of text is a node.
  - Example:
    ```html
    <html>
      <body>
        <h1>Hello World</h1>
      </body>
    </html>
    ```
    - The `<html>` tag is the root node.
    - `<body>` and `<h1>` are child nodes.

- **Programming Interface**:
  - Allows developers to access, modify, or delete elements and attributes dynamically using JavaScript.

- **Live Representation**:
  - The DOM reflects the current state of the document. Any changes made to the DOM are immediately reflected in the visible document.

- **Platform-Independent**:
  - It’s a standardized model that works across different browsers and platforms.

### DOM Components

- **Document**:
  - Represents the entire web page.
  - Accessed via `document` object in JavaScript.

- **Elements**:
  - Individual HTML elements like `<div>`, `<p>`, `<img>`, etc.

- **Nodes**:
  - Everything in the DOM is a node (e.g., elements, attributes, text).

- **Attributes**:
  - Properties of elements, like `id`, `class`, or `src`.

# Selectors in JavaScript

Selectors are methods provided by the DOM that allow developers to select and manipulate specific elements of a web page. They are used to identify and interact with HTML elements dynamically using JavaScript.

## Types of Selectors

- **Basic Selectors**: These are straightforward methods to select elements based on their id, class, tag name, or CSS selectors.

- **Advanced Selectors**: These use more complex CSS-like selectors to pinpoint specific elements or groups of elements.

## Common Selectors in JavaScript

| Selector Method                  | Description                                                               | Example                                   |
|----------------------------------|---------------------------------------------------------------------------|-------------------------------------------|
| `document.getElementById()`      | Selects a single element by its id.                                       | `document.getElementById("myId")`        |
| `document.getElementsByClassName()` | Selects all elements with a specific class name (returns an HTMLCollection). | `document.getElementsByClassName("myClass")` |
| `document.getElementsByTagName()`  | Selects all elements with a specific tag name (returns an HTMLCollection). | `document.getElementsByTagName("p")`     |
| `document.querySelector()`       | Selects the first element that matches a CSS selector (can target id, class, or other CSS). | `document.querySelector(".myClass")`     |
| `document.querySelectorAll()`    | Selects all elements that match a CSS selector (returns a NodeList).      | `document.querySelectorAll("div.myClass")` |


# What are Data Types in JavaScript?


Data types define the type of values that can be stored and manipulated in JavaScript. They determine the operations that can be performed on the data and the memory allocated for it.


## Types of Data in JavaScript

### 1. Primitive Data Types:
- **Definition**: Immutable (cannot be changed) and directly contain the value.
- **Examples**:
  - **String**: Sequence of characters (e.g., `"Hello"`, `'World'`).
  - **Number**: Numeric values (e.g., `5`, `3.14`, `Infinity`, `NaN`).
  - **BigInt**: For very large integers beyond the Number limit (e.g., `123n`).
  - **Boolean**: Logical values (`true` or `false`).
  - **Undefined**: A variable declared but not assigned a value (e.g., `let x;`).
  - **Null**: Represents the intentional absence of a value (e.g., `let y = null;`).
  - **Symbol**: A unique and immutable value, used as object keys.

---

### 2. Non-Primitive (Reference) Data Types:
- **Definition**: Mutable and store references to memory locations.
- **Examples**:
  - **Objects**: Collection of key-value pairs (e.g., `{ name: "John", age: 30 }`).
  - **Arrays**: Ordered list of values (e.g., `[1, 2, 3]`).
  - **Functions**: Blocks of code that can be executed (e.g., `function greet() {}`).

---

## Primitive vs. Non-Primitive Data Types

| **Feature**           | **Primitive Data Types**                  | **Non-Primitive Data Types**             |
|------------------------|-------------------------------------------|------------------------------------------|
| **Definition**         | Immutable and store direct values.       | Mutable and store references to memory locations. |
| **Examples**           | String, Number, BigInt, Boolean, Undefined, Null, Symbol. | Object, Array, Function.                |
| **Stored in Memory**   | Stored directly in the stack.            | Stored in the heap, with references in the stack. |
| **Size**               | Fixed.                                   | Can grow dynamically.                    |
| **Comparison**         | Compared by value.                       | Compared by reference.                   |
| **Mutability**         | Immutable (cannot change the value).     | Mutable (can modify the content).        |

# What are Functions in JavaScript?
A function in JavaScript is a reusable block of code designed to perform a specific task. Functions take inputs (parameters), process them, and return an output. They help organize code, make it reusable, and improve readability.

## Types of Functions in JavaScript
- **Named Functions**: Functions with a name for reuse.
- **Anonymous Functions**: Functions without a name, often used as arguments or callbacks.
- **Function Expressions**: Functions defined as expressions and assigned to a variable.
- **Arrow Functions**: A shorthand syntax for writing functions introduced in ES6.
- **Pure Functions**: Functions that always produce the same output for the same input without side effects.

### 1. Named Functions
A function with a defined name.
#### Characteristics:
- Reusable.
- Can be called before or after declaration due to hoisting.

#### Example:
```javascript
function greet(name) {
  return `Hello, ${name}!`;
}
console.log(greet("Rushikesh")); // Output: Hello, Rushikesh!
```

### 2. Anonymous Functions
A function without a name. Commonly used as:
- Callbacks
- Arguments to other functions

#### Example:
```javascript
setTimeout(function () {
  console.log("This is an anonymous function.");
}, 1000);
```

### 3. Function Expressions
A function assigned to a variable.
#### Characteristics:
- Not hoisted.
- Can be named or anonymous.

#### Example (Anonymous Function Expression):
```javascript
const add = function (a, b) {
  return a + b;
};
console.log(add(5, 3)); // Output: 8
```

#### Example (Named Function Expression):
```javascript
const factorial = function fact(n) {
  return n === 0 ? 1 : n * fact(n - 1);
};
console.log(factorial(5)); // Output: 120
```

### 4. Arrow Functions
Introduced in ES6, they provide a concise syntax for writing functions.
#### Characteristics:
- Do not bind their own `this` keyword (inherits `this` from the enclosing scope).
- Cannot be used as constructors.
- Syntax: `(parameters) => expression`.

#### Example:
```javascript
const multiply = (a, b) => a * b;
console.log(multiply(4, 5)); // Output: 20
```

#### Single Parameter Example:
```javascript
const square = x => x * x;
console.log(square(3)); // Output: 9
```

#### No Parameters Example:
```javascript
const greet = () => "Hello, World!";
console.log(greet()); // Output: Hello, World!
```

### 5. Pure Functions
Functions that:
- Always return the same output for the same input.
- Do not have side effects (e.g., modifying external variables).

#### Example:
```javascript
function add(a, b) {
  return a + b;
}
console.log(add(2, 3)); // Output: 5
```

#### Non-Pure Function Example:
```javascript
let count = 0;
function increment() {
  count++;
  return count;
}
console.log(increment()); // Output: 1 (Modifies `count` outside the function)
```

## Key Differences Between Function Types

| Type                | Syntax                        | Hoisted | `this` Binding        |
|---------------------|-------------------------------|---------|-----------------------|
| Named Function      | `function name() {}`         | Yes     | Own `this`.           |
| Anonymous Function  | `function () {}`             | No      | Own `this`.           |
| Function Expression | `const fn = function () {};` | No      | Own `this`.           |
| Arrow Function      | `const fn = () => {};`       | No      | Lexical (inherits).   |
| Pure Function       | Same as Named or Expression  | Depends | Depends.              |


## Pure vs Impure Functions

| **Aspect**      | **Pure Function**                                                                 | **Impure Function**                                                      |
|------------------|-----------------------------------------------------------------------------------|---------------------------------------------------------------------------|
| **Definition**   | A function that always returns the same output for the same input and does not have side effects. | A function whose output depends on external factors or has side effects. |
| **Deterministic**| Yes, always produces consistent results for the same input.                      | No, results may vary for the same input.                                  |
| **Side Effects** | No, does not modify external state or variables.                                 | Yes, may modify external state or variables.                              |
| **Dependencies** | Relies only on its input arguments.                                              | May rely on external variables or states.                                 |
| **Testability**  | Easy to test due to predictable behavior.                                        | Difficult to test due to external dependencies or side effects.           |
| **Performance**  | Can be optimized by caching results (memoization).                               | Cannot leverage caching due to unpredictable output.                      |

### Key Differences
1. **Predictability:** Pure functions are predictable; impure functions are not.  
2. **State Management:** Pure functions do not alter state; impure functions do.  
3. **Functional Programming:** Pure functions are a core principle of functional programming, promoting immutability and stateless design.
---
# What is a Callback in JavaScript?
A callback is a function that is passed as an argument to another function and is executed after the completion of that function. It allows asynchronous or deferred execution in JavaScript.

## Purpose of Callbacks
Callbacks are primarily used to:
- Handle asynchronous operations, such as API calls or reading files.
- Execute code sequentially, ensuring one function runs only after another has completed.
- Reuse functionality by passing different callback functions to perform specific tasks.

## How Callbacks Work (Example)

### Synchronous Callback:

A callback executed immediately within the same function call.

```javascript
function greet(name, callback) {
    console.log("Hello, " + name);
    callback();
}

function sayGoodbye() {
    console.log("Goodbye!");
}

greet("John", sayGoodbye);
// Output:
// Hello, John
// Goodbye!
```
## Benefits of Callbacks

- **Asynchronous programming:** Enables non-blocking code execution.
- **Flexibility:** Functions can be customized by passing different callbacks.
- **Modularity:** Helps in separating logic into smaller, reusable functions.

## Limitations of Callbacks
- **Callback Hell:** Nesting multiple callbacks can lead to messy, hard-to-read code.
- Summary: A callback is a function passed into another function to be executed later. It's vital for handling asynchronous operations and making JavaScript non-blocking. While powerful, it’s important to manage them properly to avoid callback hell.

## What is Callback Hell?
Callback Hell refers to the situation where callbacks are nested within other callbacks multiple levels deep, making the code hard to read, understand, and maintain. It often occurs when handling asynchronous operations in JavaScript.
---
## What is Function Currying in JavaScript?
Function currying is a technique in JavaScript where a function, instead of taking all its arguments at once, takes them one at a time. It transforms a function with multiple arguments into a sequence of nested functions, each taking a single argument.

### Why Use Currying?

1. **Reusability:**  
   Create reusable functions by partially applying arguments.

2. **Code Readability:**  
   Break down a function into smaller, more manageable parts.

3. **Functional Programming:**  
   Currying is commonly used in functional programming to create specialized functions from general ones.

### When to Use Currying?
- When you need to create specialized versions of a function.  
- In functional programming where functions are composed and reused.  
- To simplify complex operations into modular, smaller functions.

### In Short
Currying transforms a function into a chain of functions that take one argument at a time. It improves reusability and readability and is a key technique in functional programming.

### Example: Currying in JavaScript

```javascript
function add(a) {
    return function (b) {
        return function (c) {
            return a + b + c;
        };
    };
}

console.log(add(1)(2)(3)); // Output: 6
```
---
## What is a Higher-Order Function in JavaScript?
A higher-order function is a function that can either:
- **Take another function as an argument**, or
- **Return a function as its result**.
This makes higher-order functions a key feature of JavaScript's functional programming capabilities.

### Key Characteristics of Higher-Order Functions
- **Accepts functions as input.**
- **Returns a function as output.**
- **Promotes reusability and clean code.**

### Why Use Higher-Order Functions?
- **Code Reusability:**  
  Instead of repeating logic, we can pass different callbacks to a single higher-order function.

- **Abstraction:**  
  They abstract behavior, making code more readable and concise.

- **Functional Programming:**  
  Encourages immutability and declarative code.

### Summary

A higher-order function is a function that takes another function as input or returns a function as output. It simplifies tasks, encourages reusable code, and is widely used in functional programming and array operations like `map`, `filter`, and `reduce`.

## Array Methods in JavaScript

1. **push()**

   Adds one or more elements to the end of an array.  
   Returns the new length of the array.

   Example:
   ```javascript
   let arr = [1, 2, 3];
   arr.push(4); // Output: [1, 2, 3, 4]
   ```

2. **pop()**

   Removes the last element from an array.  
   Returns the removed element.

   Example:
   ```javascript
   let arr = [1, 2, 3];
   arr.pop(); // Output: [1, 2]
   ```

3. **shift()**

   Removes the first element from an array.  
   Returns the removed element.

   Example:
   ```javascript
   let arr = [1, 2, 3];
   arr.shift(); // Output: [2, 3]
   ```

4. **unshift()**

   Adds one or more elements to the beginning of an array.  
   Returns the new length of the array.

   Example:
   ```javascript
   let arr = [1, 2, 3];
   arr.unshift(0); // Output: [0, 1, 2, 3]
   ```

5. **splice()**

   Changes the contents of an array by removing or replacing elements, and/or adding new elements.  
   Syntax: `array.splice(startIndex, deleteCount, item1, item2, ...)`

   Example:
   ```javascript
   let arr = [1, 2, 3, 4];
   arr.splice(2, 1, 10); // Output: [1, 2, 10, 4]
   ```

6. **map()**

   Creates a new array with the results of calling a provided function on every element in the array.

   Example:
   ```javascript
   let arr = [1, 2, 3];
   let newArr = arr.map(x => x * 2); // Output: [2, 4, 6]
   ```

7. **filter()**

   Creates a new array with all elements that pass the test implemented by the provided function.

   Example:
   ```javascript
   let arr = [1, 2, 3, 4, 5];
   let newArr = arr.filter(x => x > 3); // Output: [4, 5]
   ```

8. **reduce()**

   Applies a function against an accumulator and each element in the array (from left to right) to reduce it to a single value.

   Example:
   ```javascript
   let arr = [1, 2, 3, 4];
   let sum = arr.reduce((acc, val) => acc + val, 0); // Output: 10
   ```

9. **find()**

   Returns the first element that satisfies the provided testing function.

   Example:
   ```javascript
   let arr = [5, 12, 8, 130, 44];
   let found = arr.find(x => x > 10); // Output: 12
   ```

10. **indexOf()**

    Returns the first index at which a specified element is found in the array, or -1 if not found.

    Example:
    ```javascript
    let arr = [1, 2, 3];
    console.log(arr.indexOf(2)); // Output: 1
    ```

11. **sort()**

    Sorts the elements of the array in place and returns the sorted array.

    Example:
    ```javascript
    let arr = [3, 1, 2];
    arr.sort(); // Output: [1, 2, 3]
    ```

12. **forEach()**

    Executes a provided function once for each element in the array.

    Example:
    ```javascript
    let arr = [1, 2, 3];
    arr.forEach(x => console.log(x)); // Output: 1, 2, 3
    ```

13. **includes()**

    Checks if a certain element is present in the array.  
    Returns true if the element is found, otherwise false.

    Example:
    ```javascript
    let arr = [1, 2, 3];
    console.log(arr.includes(2)); // Output: true
    ```

14. **some()**

    Tests whether at least one element in the array passes the provided testing function.

    Example:
    ```javascript
    let arr = [1, 2, 3];
    console.log(arr.some(x => x > 2)); // Output: true
    ```

15. **every()**

    Tests whether all elements in the array pass the provided testing function.

    Example:
    ```javascript
    let arr = [1, 2, 3];
    console.log(arr.every(x => x > 0)); // Output: true
    ```
---
# Scope in JavaScript

Scope refers to the context or visibility in which a variable or function is accessible in the code. It defines the area of the code where a particular variable or function can be accessed or modified.

In JavaScript, scope is crucial for managing the lifespan and visibility of variables, ensuring that variables do not interfere with each other in different parts of the program.

## Types of Scope:
- **Global Scope**: Variables declared outside of any function or block.
- **Function Scope**: Variables declared inside a function.
- **Block Scope**: Variables declared inside a block using `let` or `const`.
- **Lexical Scope**: Inner functions can access variables from outer functions.
- **Scope Chain**: The series of scopes JavaScript checks when looking for a variable.
---
# What is Hoisting in JavaScript?
Hoisting is a JavaScript mechanism where declarations of variables and functions are moved to the top of their containing scope during the compile phase before the code is executed. This means that variables and functions can be referenced before they are declared in the code, though the way they are hoisted depends on whether they're declared using var, let, const, or as a function declaration.

## How Hoisting Works in JavaScript:
- **Variables Declared with var**:
    With var, only the declaration is hoisted, not the initialization.  
    For example:

    ```javascript
    console.log(myVar); // Output: undefined
    var myVar = 10;
    console.log(myVar); // Output: 10
    ```

    Here, JavaScript moves the var myVar declaration to the top, but the assignment myVar = 10 stays in place, so the first log outputs undefined.

- **Variables Declared with let and const**:
    Both let and const are hoisted, but they are not initialized until their definition is executed. Trying to access them before initialization results in a ReferenceError due to the Temporal Dead Zone (TDZ).  
    For example:

    ```javascript
    console.log(myLetVar); // Error: Cannot access 'myLetVar' before initialization
    let myLetVar = 10;
    ```
    This happens because let and const are hoisted, but JavaScript doesn't allow access to them until they are initialized.

- **Function Declarations**:
    Function declarations are fully hoisted, meaning both the function definition and its body are moved to the top.  
    For example:

    ```javascript
    greet(); // Output: Hello, World!

    function greet() {
      console.log("Hello, World!");
    }
    ```
    Here, the entire function greet() is hoisted, so it can be called before its definition.

- **Function Expressions**:
    If a function is assigned to a variable (function expression), only the variable declaration is hoisted, not the function itself.  
    For example:

    ```javascript
    myFunc(); // Error: myFunc is not a function

    var myFunc = function() {
      console.log("Hello, World!");
    };
    ```
    Here, the variable myFunc is hoisted, but the function body is not. Calling myFunc() before the assignment results in an error because myFunc is undefined at that point.

## Purpose of Hoisting
- **Simplifies Code Structure**:
    Hoisting allows us to reference functions and variables before they are defined in the code. This can make code writing more flexible and allow for cleaner organization, especially when functions are defined at the end of the file.

- **Avoids Errors with Function Calls**:
    Function declarations are hoisted in full, so we can call functions at any point before their actual definition without causing errors. This allows us to structure our code in a more intuitive way.

- **Better Readability and Maintenance**:
    Hoisting enables us to declare variables and functions at the top of the code while still using them later on, leading to better code organization and easier maintenance.

## Key Points to Remember:
- var declarations are hoisted, but only the declaration is moved to the top, not the initialization.
- let and const are hoisted too, but accessing them before their initialization leads to a ReferenceError due to the Temporal Dead Zone.
- Function declarations are fully hoisted, meaning both the function signature and the body are available throughout the scope.
- Function expressions are treated like variables and only the variable declaration is hoisted, not the function definition.
---
# What is Asynchronous Programming?

Asynchronous programming in JavaScript is a method of handling tasks that take some time to complete, such as reading a file, making a network request, or querying a database, without blocking the execution of other code. In traditional, synchronous programming, code is executed line-by-line, meaning each task must complete before the next one can start. Asynchronous programming allows other code to run while waiting for a task to finish, which leads to more efficient and responsive applications.

Asynchronous programming allows tasks (e.g., file reading, network requests) to be executed independently without blocking other operations. It enables non-blocking code execution, improving performance and responsiveness in applications.

## How Asynchronous Programming Works:

- **Non-blocking**:  
    In asynchronous programming, long-running operations like file reading or API calls don’t block the execution of subsequent code. The program can continue executing other instructions while waiting for the time-consuming operation to finish.

- **Callback Functions**:  
    Callbacks are functions that are passed as arguments to other functions, to be executed after a task is completed. When an asynchronous task finishes, the callback function is called to handle the result.

## Why Use Asynchronous Programming?

- **Improved Performance**:  
    In asynchronous programming, the application doesn't have to wait for slow tasks (e.g., network requests, database queries) to finish before proceeding. This leads to faster performance and responsiveness.

- **Non-blocking I/O**:  
    JavaScript is often used for handling I/O-bound tasks, like interacting with APIs, databases, or the filesystem. Asynchronous programming ensures that the application remains responsive even when dealing with such tasks.

- **Responsive User Interfaces**:  
    For web applications, asynchronous programming is crucial for creating smooth user experiences. Without it, a slow network request or database query could freeze the entire UI.

## Real-World Example of Asynchronous Programming

Imagine you are building a weather application that fetches data from a remote API. If the application uses synchronous programming, it would block the UI while waiting for the weather data to be fetched. This would cause the app to become unresponsive and freeze until the data is returned.

With asynchronous programming, the app can continue responding to user inputs and display a loading spinner while waiting for the weather data. Once the data is available, the app can update the UI with the weather information.

# null vs undefined in JavaScript

| Aspect               | null                                        | undefined                                      |
|----------------------|---------------------------------------------|------------------------------------------------|
| **Meaning**           | Represents intentional absence of a value. | Represents an uninitialized or undeclared variable. |
| **Type**              | object (due to a historical bug)           | undefined                                      |
| **Default Value**     | No default value. It must be explicitly assigned. | Default value for uninitialized variables.    |
| **Usage**             | Assigned explicitly to variables to indicate no value. | Automatically assigned to variables that are declared but not initialized. |
| **Example**           | `let a = null;`                             | `let b; console.log(b); // undefined`          |
| **Equality (Loose)**  | `null == undefined` is true.               | `undefined == null` is true.                  |
| **Equality (Strict)** | `null === undefined` is false.             | `undefined === null` is false.                |

## Summary:
- **null** is explicitly assigned to a variable to indicate "no value."
- **undefined** is the default value for variables that are declared but not initialized.

# typeof Operator in JavaScript

The `typeof` operator is used to determine the data type of a variable or expression. It returns a string that indicates the type of the operand.

# What is Type Coercion in JavaScript?

Type coercion in JavaScript refers to the automatic or implicit conversion of a value from one data type to another. This happens when JavaScript expects a specific type but encounters a different one. The engine automatically converts the value to the required type, which can lead to unexpected behavior.

## Types of Type Coercion:

### Implicit Coercion:
JavaScript automatically converts the type of a value when needed.

**Example:**

```javascript
let result = '5' + 10;  // Implicit coercion of number to string
console.log(result);  // Output: "510"
```

### Explicit Coercion:
Developers can manually convert a value from one type to another using built-in functions like String(), Number(), Boolean(), etc.

**Example:**


```javascript

let num = 5;
let str = String(num);  // Explicit coercion from number to string
console.log(str);  // Output: "5"
```
- Type coercion happens when JavaScript automatically or explicitly converts one data type to another.
- Implicit coercion happens automatically, while explicit coercion is when you manually convert values using functions like String(), Number(), etc.
- Coercion can be confusing, especially with the == operator, which performs coercion during comparison. To avoid issues, it’s recommended to use === for strict equality checks.

# Difference between `==` and `===` in JavaScript

| **Aspect**          | **== (Loose Equality)**                              | **=== (Strict Equality)**                         |
|----------------------|-----------------------------------------------------|--------------------------------------------------|
| **Comparison Type**  | Compares values after type coercion (if necessary). | Compares values without type coercion.           |
| **Checks**           | Checks for equality of values, even if types differ.| Checks for equality of both value and type.      |
| **Type Coercion**    | Performs type conversion if the types are different.| Does not perform any type conversion.            |
| **Usage**            | Use when type differences can be ignored (not recommended). | Use for precise comparisons (best practice). |
| **Example 1**        | `'5' == 5` → true (string `'5'` coerced to number)  | `'5' === 5` → false (different types)            |
| **Example 2**        | `null == undefined` → true                          | `null === undefined` → false                     |
| **Example 3**        | `true == 1` → true                                  | `true === 1` → false                             |
| **Performance**      | Slightly slower due to type coercion.               | Faster because no type coercion is involved.     |


## What is Event Handling in JavaScript?

Event handling in JavaScript refers to the process of detecting and responding to user actions or events on a webpage, such as clicks, keystrokes, mouse movements, or form submissions.

---

### How Event Handling Works

1. **Event:**  
   An action or occurrence that the browser detects (e.g., clicking a button).

2. **Event Listener:**  
   A function that "listens" for a specific event and executes a callback function when the event occurs.

3. **Event Handler:**  
   The callback function that executes when the event is triggered.

---

### Types of Events

- **Mouse Events:**  
  `click`, `dblclick`, `mouseover`, `mouseout`, `mousedown`, `mouseup`.

- **Keyboard Events:**  
  `keydown`, `keyup`, `keypress`.

- **Form Events:**  
  `submit`, `change`, `input`, `focus`, `blur`.

- **Window Events:**  
  `load`, `resize`, `scroll`, `unload`.

---

### Advantages of Event Handling

- Enables interactive and dynamic web applications.
- Decouples user actions from code logic.
- Simplifies managing multiple user interactions.

---

### In Short

Event handling in JavaScript is the process of detecting and responding to user actions like clicks, keypresses, or form submissions. It involves adding event listeners to DOM elements and executing callback functions when events occur.

---

### Basic Syntax for Event Handling

```javascript
element.addEventListener("event", eventHandler);
```

- element: The DOM element to listen for the event on.
- event: The type of event (e.g., "click", "input").
- eventHandler: The function to execute when the event occurs.


















## Call, Apply, and Bind Methods in JavaScript

These methods allow you to explicitly set the `this` context of a function. They are used to control which object `this` refers to, especially in scenarios where the default behavior doesn’t apply.

---

### 1. call()

The `call()` method invokes a function immediately with a specific `this` context and arguments passed individually.

**Syntax:**

```javascript
func.call(thisArg, arg1, arg2, ...);
```
Example:

```javascript
const person = {
    fullName: function (city, country) {
        return `${this.firstName} ${this.lastName} from ${city}, ${country}`;
    },
};
```

const person1 = { firstName: "John", lastName: "Doe" };

console.log(person.fullName.call(person1, "New York", "USA"));
// Output: John Doe from New York, USA

### 2. apply()
The apply() method is similar to call(), but it takes arguments as an array or an array-like object instead of individual arguments.

**Syntax:**
```javascript
func.apply(thisArg, [arg1, arg2, ...]);
```
Example:

```javascript
Copy code
console.log(person.fullName.apply(person1, ["London", "UK"]));
// Output: John Doe from London, UK
```
### 3. bind()
The bind() method returns a new function with a specific this context. It does not invoke the function immediately, unlike call() and apply().

**Syntax:**
```javascript
const boundFunction = func.bind(thisArg, arg1, arg2, ...);
```
Example:

```javascript
const boundFullName = person.fullName.bind(person1, "Paris", "France");
console.log(boundFullName());
// Output: John Doe from Paris, France
```
#### When to Use?
- Use call when you need to invoke a function immediately with specific arguments.
- Use apply when arguments are available as an array.
- Use bind when you need to reuse a function with a specific this later.
# ES6 Features:  Spread and Rest Operators in JavaScript

Both spread and rest operators use the `...` syntax but have different purposes depending on how and where they are used.

## Spread Operator (`...`)

### Purpose:
The spread operator is used to unpack elements of an iterable (e.g., arrays, objects) into individual elements.

## Rest Operator (`...`)

### Purpose:
The rest operator is used to collect multiple elements into a single array or object.

## Key Differences Between Spread and Rest Operators

| **Aspect**          | **Spread Operator**                                 | **Rest Operator**                               |
|----------------------|----------------------------------------------------|------------------------------------------------|
| **Purpose**          | Expands an iterable (array/object) into individual elements. | Collects multiple elements into an array or object. |
| **Usage Context**    | Used in array/object literals, function calls, etc. | Used in function parameters or destructuring.  |
| **Example**          | `const arr = [...nums];`                           | `function sum(...nums) {}`                     |
| **Output**           | Unpacks values.                                    | Packs values.                                  |


# What is Array Destructuring in JavaScript?

Array destructuring is a syntax in JavaScript that allows you to unpack values from an array and assign them to individual variables in a concise way.

## Use Cases of Array Destructuring

1. **Extracting Data from Arrays:**
   Easily assign multiple array values to variables.

2. **Working with Function Returns:**
   Functions that return arrays can be destructured into variables.

## Advantages of Array Destructuring

- Cleaner, more readable code.
- Reduces the need for verbose assignments.
- Makes handling multiple return values from functions easier.

## Summary:

Array destructuring simplifies extracting values from arrays, allowing developers to write concise and intuitive code. It’s especially useful for swapping variables, skipping values, and working with function returns.

## Basic Destructuring:

```javascript
const numbers = [1, 2, 3];
const [a, b, c] = numbers;
console.log(a);  // Output: 1
console.log(b);  // Output: 2
console.log(c);  // Output: 3
```

## What is a Template Literal in JavaScript?

Template literals are a feature introduced in ES6 that allow for easier string creation and formatting. They are enclosed in backticks (`` ` ``) instead of single or double quotes and provide features like multi-line strings, variable interpolation, and embedding expressions. 

---

### Why Use Template Literals?

- **Readable Code:** Easier to write and read compared to string concatenation.
- **Dynamic Content:** Simplifies the process of embedding variables and expressions.
- **Multi-line Support:** Cleaner and more intuitive way to write multi-line strings.
- **Flexibility:** Powerful for creating formatted strings with minimal effort.

Template literals make string handling simpler, more powerful, and more readable, making them a preferred choice in modern JavaScript development.

---

### Key Features

#### String Interpolation
Use the `${}` syntax to embed variables and expressions directly into the string.

**Example:**

```javascript
const name = "Alice";
const age = 25;
console.log(`My name is ${name}, and I am ${age} years old.`);
// Output: My name is Alice, and I am 25 years old.
```










# DOM Methods Categorized by Selecting, Modifying, Creating, Removing Elements, and Event Listeners

## 1. Selecting Elements

These methods are used to select elements in the DOM.

| Method                         | Description                                             | Example                                            |
|---------------------------------|---------------------------------------------------------|----------------------------------------------------|
| `document.getElementById()`     | Selects an element by its id attribute.                 | `const element = document.getElementById('myId');` |
| `document.getElementsByClassName()` | Selects all elements with the given class name.        | `const elements = document.getElementsByClassName('myClass');` |
| `document.getElementsByTagName()` | Selects all elements with the given tag name.          | `const elements = document.getElementsByTagName('div');` |
| `document.querySelector()`      | Selects the first matching element based on CSS selector. | `const element = document.querySelector('.myClass');` |
| `document.querySelectorAll()`   | Selects all matching elements based on CSS selector.   | `const elements = document.querySelectorAll('.myClass');` |

## 2. Modifying Elements

These methods are used to modify the properties of selected elements.

| Method                         | Description                                             | Example                                            |
|---------------------------------|---------------------------------------------------------|----------------------------------------------------|
| `element.innerHTML`             | Gets or sets the HTML content inside an element.        | `element.innerHTML = '<p>Hello World</p>';`        |
| `element.textContent`           | Gets or sets the text content inside an element.        | `element.textContent = 'Hello World';`             |
| `element.style`                 | Accesses or modifies the CSS styles of an element.      | `element.style.color = 'red';`                     |
| `element.setAttribute()`        | Sets a specific attribute on an element.                | `element.setAttribute('src', 'image.jpg');`        |
| `element.setAttributeNS()`      | Sets an attribute with a specific namespace URI.        | `element.setAttributeNS('http://www.w3.org/2000/svg', 'width', '100');` |
| `element.removeAttribute()`     | Removes a specified attribute from an element.          | `element.removeAttribute('id');`                   |
| `element.classList.add()`       | Adds one or more classes to an element.                 | `element.classList.add('active');`                 |
| `element.classList.remove()`    | Removes one or more classes from an element.            | `element.classList.remove('active');`              |
| `element.classList.toggle()`    | Toggles a class on or off for an element.               | `element.classList.toggle('active');`              |

## 3. Creating Elements

These methods allow you to create new elements or nodes in the DOM.

| Method                             | Description                                                       | Example                                                     |
|-------------------------------------|-------------------------------------------------------------------|-------------------------------------------------------------|
| `document.createElement()`          | Creates a new HTML element.                                       | `const newDiv = document.createElement('div');`             |
| `document.createTextNode()`         | Creates a new text node.                                          | `const newText = document.createTextNode('Hello World');`   |
| `document.createDocumentFragment()` | Creates a lightweight container to hold a portion of the DOM for more efficient manipulation. | `const fragment = document.createDocumentFragment();`       |

## 4. Removing Elements

These methods are used to remove elements from the DOM.

| Method                             | Description                                                       | Example                                                   |
|-------------------------------------|-------------------------------------------------------------------|-----------------------------------------------------------|
| `element.remove()`                  | Removes the element from the DOM.                                 | `element.remove();`                                       |
| `parentElement.removeChild()`       | Removes a child element from its parent.                          | `parent.removeChild(child);`                              |
| `element.replaceWith()`             | Replaces the current element with another element.                | `element.replaceWith(newElement);`                         |

## 5. Event Listeners

These methods allow you to attach, remove, and manage events.

| Method                             | Description                                                       | Example                                                   |
|-------------------------------------|-------------------------------------------------------------------|-----------------------------------------------------------|
| `element.addEventListener()`        | Attaches an event handler to an element.                          | `element.addEventListener('click', function() { alert('Clicked!'); });` |
| `element.removeEventListener()`     | Removes an event handler from an element.                         | `element.removeEventListener('click', handlerFunction);`   |
| `element.dispatchEvent()`           | Dispatches an event to an element (simulates an event).           | `element.dispatchEvent(new Event('click'));`               |
| `element.onClick`                   | Inline event handler to define what happens when the element is clicked. | `element.onclick = function() { alert('Clicked!'); };`     |

## Additional Useful DOM Methods

| Method                             | Description                                                       | Example                                                   |
|-------------------------------------|-------------------------------------------------------------------|-----------------------------------------------------------|
| `document.querySelectorAll()`       | Selects all elements matching the CSS selector.                  | `const elements = document.querySelectorAll('.className');` |
| `document.createEvent()`            | Creates a new event object that can be dispatched.                | `const event = document.createEvent('Event');`            |
| `element.focus()`                   | Sets focus on an element (e.g., an input field).                  | `inputElement.focus();`                                   |
| `element.blur()`                    | Removes focus from an element.                                    | `inputElement.blur();`                                    |
| `element.scrollIntoView()`          | Scrolls the page to make the element visible in the viewport.     | `element.scrollIntoView();`                               |

## In Summary

- **Selecting:** Use methods like `getElementById`, `querySelector` to select DOM elements.
- **Modifying:** Methods like `innerHTML`, `setAttribute`, and `style allow modification.
- **Creating:** `createElement`, `createTextNode` for dynamically creating DOM elements.
- **Removing:** Use `remove`, `removeChild` to delete elements.
- **Event Listeners:** `addEventListener` and `removeEventListener` allow handling events like `click`, `submit`, etc.

# Shallow Copy vs Deep Copy

Both shallow and deep copy are methods of copying data structures like arrays or objects, but they differ in how they handle nested elements (objects or arrays inside the original structure).

## Shallow Copy

A shallow copy creates a new object or array, but the nested objects/arrays are still referenced from the original structure. This means that changes made to nested elements in the copied object/array will reflect in the original one.

### How it Works
- Creates a new object/array.
- Copies values at the top level (primitive types like numbers, strings).
- Nested objects/arrays are not copied but are referenced, meaning both the original and copied structures share the same reference for nested elements.

## Deep Copy

A deep copy creates a new object/array, and recursively copies all nested elements as well. This means that the original and copied objects/arrays are completely independent, and changes to the nested elements in one will not affect the other.

### How it Works
- Creates a new object/array.
- Copies both top-level and nested elements, creating new references for all nested objects/arrays.

## Key Differences

| Aspect                        | Shallow Copy                                                 | Deep Copy                                                   |
|-------------------------------|-------------------------------------------------------------|-------------------------------------------------------------|
| **Copies nested objects**      | No, it copies references to nested objects/arrays.           | Yes, it recursively copies all nested objects.              |
| **Shared references**          | Yes, nested objects are shared between original and copy.   | No, nested objects are fully independent.                   |
| **Performance**                | Faster, since only top-level properties are copied.         | Slower, as all nested elements need to be copied.           |
| **Use Case**                   | When you want a copy of the outer structure, and it's acceptable to share nested elements. | When you need a completely independent copy, especially for deeply nested structures. |

#### Array Shallow Copy
```javascript
let arr = [1, 2, 3, [4, 5]];
let shallowCopy = [...arr];

shallowCopy[0] = 10;
shallowCopy[3][0] = 20;

console.log(arr); // Output: [1, 2, 3, [20, 5]]  (nested array is shared)
console.log(shallowCopy); // Output: [10, 2, 3, [20, 5]]
```

#### Array Deep Copy
```javascript
let arr = [1, 2, 3, [4, 5]];
let deepCopy = JSON.parse(JSON.stringify(arr));

deepCopy[0] = 10;
deepCopy[3][0] = 20;

console.log(arr); // Output: [1, 2, 3, [4, 5]]  (nested array is independent)
console.log(deepCopy); // Output: [10, 2, 3, [20, 5]]
```

# What is an Object in JavaScript?

An object in JavaScript is a collection of key-value pairs where keys (also called properties) are strings (or Symbols), and values can be any valid JavaScript data type, including other objects, functions, arrays, etc.

### Syntax:
```javascript
let person = {
  name: "John",        // key: value pair
  age: 30,
  greet: function() {  // method (function inside an object)
    console.log("Hello");
  }
};
```


# Difference Between an Object and an Array in JavaScript

| **Aspect**             | **Array**                                       | **Object**                                      |
|------------------------|-------------------------------------------------|------------------------------------------------|
| **Definition**          | A special type of object used to store ordered collections of data. | A collection of key-value pairs.                |
| **Syntax**              | `let arr = [1, 2, 3];`                         | `let obj = { name: "John", age: 30 };`          |
| **Data Structure**      | Ordered collection (indexed by integers).      | Unordered collection (keys can be strings or symbols). |
| **Key/Index**           | Uses integer indices (e.g., `arr[0]`)           | Uses string or symbol keys (e.g., `obj['name']`)|
| **Access Method**       | Access elements using an integer index.        | Access elements using a key (string or symbol). |
| **Use Case**            | Best for storing lists or collections of data that require order. | Best for representing real-world objects with named properties. |



### What is the Event Loop in JavaScript?

The **Event Loop** is a fundamental concept in JavaScript that enables asynchronous operations to be executed in a non-blocking way. It ensures that JavaScript can handle multiple operations concurrently, without freezing or blocking the user interface. It is a core part of JavaScript's **Concurrency Model**, which also involves the **Call Stack** and the **Callback Queue**.

### How Does the Event Loop Work?

1. **Call Stack**:
   - The **Call Stack** is where JavaScript keeps track of the functions that are currently being executed.
   - It follows a **Last-In-First-Out (LIFO)** order.
   - When a function is called, it is added to the top of the stack.
   - Once a function finishes execution, it is popped off the stack.
   - If the call stack is empty, the event loop can start processing tasks from the callback queue.

2. **Callback Queue (or Message Queue)**:
   - The **Callback Queue** holds functions that are waiting to be executed, such as those triggered by events (e.g., click, timer) or completed asynchronous operations.
   - Once the call stack is empty, the event loop will move the first function in the callback queue to the call stack for execution.
   - The event loop ensures that the call stack is empty before it moves tasks from the callback queue to the stack.

3. **Event Loop**:
   - The **Event Loop** continuously checks if the call stack is empty.
   - If the stack is empty, it takes the oldest event (callback function) from the callback queue and pushes it to the call stack for execution.
   
4. **Web APIs / Asynchronous APIs**:
   - When asynchronous operations (e.g., `setTimeout`, `fetch`, event listeners) are initiated, they are handled by **Web APIs** (in the browser) or **Node.js APIs**.
   - These Web APIs manage the execution of asynchronous operations.
   - Once the asynchronous task is completed, the associated callback is placed in the **Callback Queue**.
   - The event loop will then execute these callbacks when the call stack is clear.

### Visualization of the Event Loop Process:
1. **Call Stack** (contains the current functions being executed).
2. **Callback Queue** (contains pending tasks that need to be executed once the stack is empty).
3. **Event Loop** (watches the call stack and moves tasks from the callback queue to the call stack when possible).

#### Event Loop in Action (Example):
```javascript
console.log("Start");

setTimeout(() => {
  console.log("Timeout 1");
}, 0);

setTimeout(() => {
  console.log("Timeout 2");
}, 0);

console.log("End");
```
#### Execution Order:

"Start" is printed first because it's the first log in the call stack.
setTimeout is asynchronous, so both timeouts are sent to the Web API (browser environment).
"End" is printed next, as it is executed before the setTimeout callback functions.
After the call stack is empty, the event loop picks up the callbacks from the callback queue and executes them.
Both timeouts are executed in order, printing "Timeout 1" and "Timeout 2".


### Promises in JavaScript
A **Promise** is an object that represents the eventual completion or failure of an asynchronous operation. It provides a cleaner and more manageable way to handle asynchronous operations compared to using callbacks.
#### Promise States:
1. **Pending**: 
   - The promise is in the initial state, meaning the asynchronous operation is still in progress.

2. **Resolved (Fulfilled)**: 
   - The operation completed successfully, and the promise has a value.

3. **Rejected**: 
   - The operation failed, and the promise has a reason for the failure (typically an error).

#### Creating a Promise:
A promise is created using the `new Promise()` constructor, which takes a function (known as the executor) with two parameters: `resolve` and `reject`.

```javascript
let promise = new Promise(function(resolve, reject) {
  let success = true;

  if(success) {
    resolve("Operation Successful!");
  } else {
    reject("Operation Failed!");
  }
});
```

### Async/Await in JavaScript
`async`/`await` is a modern way of handling asynchronous code in JavaScript. It is syntactic sugar built on top of Promises that makes asynchronous code look and behave more like synchronous code, improving readability and reducing the complexity of promise chains.

#### Key Points:
1. **async**:
- Declares a function as asynchronous.
- An `async` function always returns a **Promise**.
- If the function explicitly returns a value, it is automatically wrapped in a resolved promise.
- If the function throws an error, it returns a rejected promise.

```javascript
async function example() {
return "Hello, World!";
}

example().then(result => console.log(result)); // "Hello, World!"
```

#  topics
featch api
AJAX
advance JavaScript
closures

session
storage
local storage
coockies
server side caching
setTimeout
1st class function
callback-hell
inversion control
.then
debouncing 