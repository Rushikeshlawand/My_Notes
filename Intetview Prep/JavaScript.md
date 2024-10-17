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

| Feature       | `var`                                        | `let`                                        | `const`                                      |
| ------------- | -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| Scope         | Function Scoped                              | Block Scoped                                 | Block Scoped                                 |
| Hoisting      | Hoisted to the top of the function scope     | Hoisted but not initialized (ReferenceError) | Hoisted but not initialized (ReferenceError) |
| Redeclaration | Allowed                                      | Not Allowed                                  | Not Allowed                                  |
| Reassignment  | Allowed                                      | Allowed                                      | Not Allowed                                  |
| Use Case      | Used in legacy code, function-wide variables | Used for variables that need to change       | Used for constants or immutable variables    |
| Example       | `var x = 10;`                                | `let y = 20;`                                | `const z = 30;`                              |

## Summary

- **`var`** is function-scoped and allows redeclaration and reassignment. It's less predictable due to hoisting and can lead to bugs in large codebases.
- **`let`** is preferred for variables that may need to change over time and is block-scoped, which helps manage variables more predictably.
- **`const`** is used for variables that should remain unchanged after they are set. It is also block-scoped, ensuring better management and control over variable states.

By understanding these key differences, you can choose the appropriate declaration based on the needs of your application.

# JavaScript Data Types

| Type          | Description                                                              |
| ------------- | ------------------------------------------------------------------------ |
| **Primitive** |                                                                          |
| Number        | Represents both integer and floating-point numbers.                      |
| String        | Represents a sequence of characters.                                     |
| Boolean       | Represents a logical entity and can have two values: `true` or `false`.  |
| Undefined     | A variable that has been declared but has not yet been assigned a value. |
| Null          | Represents the intentional absence of any object value.                  |
| Symbol        | Represents a unique and immutable identifier (ES6).                      |
| BigInt        | Represents integers with arbitrary precision (ES11).                     |

| Type              | Description                                                                     |
| ----------------- | ------------------------------------------------------------------------------- |
| **Non-Primitive** |                                                                                 |
| Object            | A collection of properties, each with a key and value (could be of any type).   |
| Array             | A special type of object used for storing multiple values in a single variable. |
| Function          | A block of code designed to perform a particular task, considered as objects.   |
| Date              | An object for handling dates and times.                                         |
| RegExp            | A regular expression object for matching text patterns.                         |

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

# Difference between `==` and `===` in JavaScript

In JavaScript, `==` and `===` are both used for comparison, but they differ in how they check values.

## `==` (Equality)

- **Type Coercion**: The `==` operator checks for equality of values, but it performs type coercion if the types are different.
- **Example**:
  ```javascript
  5 == "5"; // true (string '5' is converted to number 5)
  null == undefined; // true (considered equal by JavaScript)
  ```

## `===` (Strict Equality)

- **No Type Coercion**: The `===` operator checks for both the value and the type. If the types are different, it returns `false` without trying to convert them.
- **Example**:
  ```javascript
  5 === "5"; // false (different types: number vs. string)
  null === undefined; // false (different types)
  ```

## Summary

- Use `==` if you want to compare values with type coercion.
- Use `===` for a strict comparison, ensuring both value and type are the same.

# JavaScript Array Methods

## 1. `push()`

**Description:** Adds one or more elements to the end of an array and returns the new length of the array.

```javascript
let arr = [1, 2, 3];
arr.push(4);
console.log(arr); // [1, 2, 3, 4]
```

## 2. `pop()`

**Description:** Removes the last element from an array and returns that element.

```javascript
let arr = [1, 2, 3];
arr.pop();
console.log(arr); // [1, 2]
```

## 3. `shift()`

**Description:** Removes the first element from an array and returns that element.

```javascript
let arr = [1, 2, 3];
arr.shift();
console.log(arr); // [2, 3]
```

## 4. `unshift()`

**Description:** Adds one or more elements to the beginning of an array and returns the new length of the array.

```javascript
let arr = [1, 2, 3];
arr.unshift(0);
console.log(arr); // [0, 1, 2, 3]
```

## 5. `concat()`

**Description:** Merges two or more arrays and returns a new array.

```javascript
let arr1 = [1, 2];
let arr2 = [3, 4];
let newArr = arr1.concat(arr2);
console.log(newArr); // [1, 2, 3, 4]
```

## 6. `slice()`

**Description:** Returns a shallow copy of a portion of an array into a new array.

```javascript
let arr = [1, 2, 3, 4, 5];
let newArr = arr.slice(1, 3);
console.log(newArr); // [2, 3]
```

## 7. `splice()`

**Description:** Changes the content of an array by removing or replacing existing elements and/or adding new elements in place.

```javascript
let arr = [1, 2, 3, 4];
arr.splice(1, 2, "a", "b");
console.log(arr); // [1, 'a', 'b', 4]
```

## 8. `indexOf()`

**Description:** Returns the first index at which a given element can be found in the array, or -1 if it is not present.

```javascript
let arr = [1, 2, 3, 4];
console.log(arr.indexOf(3)); // 2
```

## 9. `includes()`

**Description:** Determines whether an array includes a certain value among its entries.

```javascript
let arr = [1, 2, 3];
console.log(arr.includes(2)); // true
```

## 10. `forEach()`

**Description:** Executes a provided function once for each array element.

```javascript
let arr = [1, 2, 3];
arr.forEach((element) => console.log(element)); // 1 2 3
```

## 11. `map()`

**Description:** Creates a new array with the results of calling a provided function on every element in the array.

```javascript
let arr = [1, 2, 3];
let newArr = arr.map((x) => x * 2);
console.log(newArr); // [2, 4, 6]
```

## 12. `filter()`

**Description:** Creates a new array with all elements that pass the test implemented by the provided function.

```javascript
let arr = [1, 2, 3, 4, 5];
let even = arr.filter((x) => x % 2 === 0);
console.log(even); // [2, 4]
```

## 13. `reduce()`

**Description:** Executes a reducer function on each element of the array, resulting in a single output value.

```javascript
let arr = [1, 2, 3, 4];
let sum = arr.reduce(
  (accumulator, currentValue) => accumulator + currentValue,
  0
);
console.log(sum); // 10
```

## 14. `find()`

**Description:** Returns the value of the first element in the array that satisfies the provided testing function.

```javascript
let arr = [1, 2, 3, 4];
let found = arr.find((x) => x > 2);
console.log(found); // 3
```

## 15. `findIndex()`

**Description:** Returns the index of the first element in the array that satisfies the provided testing function.

```javascript
let arr = [1, 2, 3, 4];
let index = arr.findIndex((x) => x > 2);
console.log(index); // 2
```

## 16. `sort()`

**Description:** Sorts the elements of an array in place and returns the array.

```javascript
let arr = [3, 1, 4, 2];
arr.sort();
console.log(arr); // [1, 2, 3, 4]
```

## 17. `reverse()`

**Description:** Reverses the order of the elements in an array in place.

```javascript
let arr = [1, 2, 3];
arr.reverse();
console.log(arr); // [3, 2, 1]
```

## 18. `join()`

**Description:** Joins all elements of an array into a string.

```javascript
let arr = [1, 2, 3];
let str = arr.join("-");
console.log(str); // "1-2-3"
```

## 19. `every()`

**Description:** Tests whether all elements in the array pass the test implemented by the provided function.

```javascript
let arr = [1, 2, 3];
let allPositive = arr.every((x) => x > 0);
console.log(allPositive); // true
```

## 20. `some()`

**Description:** Tests whether at least one element in the array passes the test implemented by the provided function.

```javascript
let arr = [1, 2, 3];
let hasNegative = arr.some((x) => x < 0);
console.log(hasNegative); // false
```

# JavaScript String Methods

## 1. `charAt()`

**Description:** Returns the character at the specified index in a string.

```javascript
let str = "Hello";
console.log(str.charAt(1)); // "e"
```

## 2. `charCodeAt()`

**Description:** Returns the Unicode value of the character at a specified index.

```javascript
let str = "Hello";
console.log(str.charCodeAt(1)); // 101
```

## 3. `concat()`

**Description:** Joins two or more strings and returns a new string.

```javascript
let str1 = "Hello";
let str2 = "World";
let result = str1.concat(" ", str2);
console.log(result); // "Hello World"
```

## 4. `includes()`

**Description:** Determines whether one string may be found within another string, returning `true` or `false`.

```javascript
let str = "Hello World";
console.log(str.includes("World")); // true
```

## 5. `indexOf()`

**Description:** Returns the index of the first occurrence of a specified value in a string. Returns `-1` if the value is not found.

```javascript
let str = "Hello World";
console.log(str.indexOf("World")); // 6
```

## 6. `lastIndexOf()`

**Description:** Returns the index of the last occurrence of a specified value in a string. Returns `-1` if the value is not found.

```javascript
let str = "Hello World World";
console.log(str.lastIndexOf("World")); // 12
```

## 7. `slice()`

**Description:** Extracts a section of a string and returns it as a new string.

```javascript
let str = "Hello World";
let newStr = str.slice(0, 5);
console.log(newStr); // "Hello"
```

## 8. `split()`

**Description:** Splits a string into an array of substrings, using a specified separator.

```javascript
let str = "Hello World";
let arr = str.split(" ");
console.log(arr); // ["Hello", "World"]
```

## 9. `substring()`

**Description:** Returns a subset of a string between two indices.

```javascript
let str = "Hello World";
let newStr = str.substring(0, 5);
console.log(newStr); // "Hello"
```

## 10. `toLowerCase()`

**Description:** Converts a string to lowercase letters.

```javascript
let str = "Hello World";
console.log(str.toLowerCase()); // "hello world"
```

## 11. `toUpperCase()`

**Description:** Converts a string to uppercase letters.

```javascript
let str = "Hello World";
console.log(str.toUpperCase()); // "HELLO WORLD"
```

## 12. `trim()`

**Description:** Removes whitespace from both ends of a string.

```javascript
let str = "  Hello World  ";
console.log(str.trim()); // "Hello World"
```

## 13. `replace()`

**Description:** Replaces occurrences of a substring or a regular expression in a string with a new string.

```javascript
let str = "Hello World";
let newStr = str.replace("World", "JavaScript");
console.log(newStr); // "Hello JavaScript"
```

## 14. `match()`

**Description:** Retrieves the result of matching a string against a regular expression.

```javascript
let str = "Hello World";
let matches = str.match(/Hello/);
console.log(matches[0]); // "Hello"
```

## 15. `search()`

**Description:** Searches for a match between a regular expression and a string, and returns the index of the match.

```javascript
let str = "Hello World";
let index = str.search(/World/);
console.log(index); // 6
```

## 16. `startsWith()`

**Description:** Determines whether a string starts with the characters of a specified string, returning `true` or `false`.

```javascript
let str = "Hello World";
console.log(str.startsWith("Hello")); // true
```

## 17. `endsWith()`

**Description:** Determines whether a string ends with the characters of a specified string, returning `true` or `false`.

```javascript
let str = "Hello World";
console.log(str.endsWith("World")); // true
```

## 18. `repeat()`

**Description:** Constructs and returns a new string which contains the specified number of copies of the string it was called on.

```javascript
let str = "Hello ";
console.log(str.repeat(3)); // "Hello Hello Hello "
```

## 19. `padStart()`

**Description:** Pads the current string from the start with another string until the resulting string reaches the given length.

```javascript
let str = "5";
console.log(str.padStart(3, "0")); // "005"
```

## 20. `padEnd()`

**Description:** Pads the current string from the end with another string until the resulting string reaches the given length.

```javascript
let str = "5";
console.log(str.padEnd(3, "0")); // "500"
```

## 21. `localeCompare()`

**Description:** Compares two strings in the current locale.

```javascript
let str1 = "a";
let str2 = "b";
console.log(str1.localeCompare(str2)); // -1 (means "a" comes before "b")
```

# Arrow Functions in JavaScript

## What is an Arrow Function?

Arrow functions are a more concise way to write functions in JavaScript. They were introduced in ES6 (ECMAScript 2015) and provide a shorter syntax compared to traditional function expressions. Arrow functions are especially useful when working with callbacks or short functions.

### Key Features:
- **Concise Syntax**: Arrow functions have a shorter syntax compared to traditional functions.
- **No `this` Binding**: The value of `this` inside an arrow function remains the same as the value outside the function. Unlike regular functions, arrow functions don’t have their own `this` context.
- **Implicit Return**: If the function body consists of a single expression, the result of that expression is implicitly returned.

# Self-Calling Functions in JavaScript (IIFE)

## What is a Self-Calling Function?

A **self-calling function**, or **Immediately Invoked Function Expression (IIFE)**, is a function that is executed right after it is defined. It is a common JavaScript pattern used to create a private scope to avoid polluting the global scope with variables or function definitions.

### Key Features:
- The function is defined and immediately executed.
- It helps avoid polluting the global namespace.
- Variables inside an IIFE are not accessible outside of it.

## Syntax

The basic syntax of an IIFE is:
```javascript
(function() {
  // code to be executed immediately
})();
```

obj
obj.props
obj methods
display obj 

