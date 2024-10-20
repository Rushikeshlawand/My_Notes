
# JavaScript Interview Questions and Answers

## Q1: What is JavaScript?
**A:** JavaScript is a high-level, interpreted programming language used for making web pages interactive. It is a dynamic, weakly typed, and prototype-based language used primarily for client-side scripting in web development, though it can also be used server-side.

## Q2: What are the data types in JavaScript?
**A:** JavaScript has six primitive types:
1. `undefined`
2. `null`
3. `boolean`
4. `number`
5. `string`
6. `symbol` (ES6)
And one complex type: `object`.

## Q3: What is the difference between `==` and `===`?
**A:** 
- `==` checks for equality after type coercion, meaning it converts the operands to the same type before comparing.
- `===` checks for strict equality, meaning it compares both value and type without type conversion.

Example:
```javascript
1 == '1';  // true
1 === '1'; // false
```

## Q4: Explain `null` vs `undefined`.
**A:** 
- `undefined` means a variable has been declared but not yet assigned a value.
- `null` is an assignment value that represents "no value" or "empty".

## Q5: What is an Immediately Invoked Function Expression (IIFE)?
**A:** An **IIFE** is a function that runs as soon as it is defined. It helps create a new scope and avoid polluting the global namespace.

Example:
```javascript
(function() {
  console.log("IIFE");
})();
```

## Q6: What is a callback function?
**A:** A **callback** is a function passed into another function as an argument, which is then invoked inside the outer function to complete some kind of routine or action.

Example:
```javascript
function greeting(name) {
  console.log('Hello ' + name);
}

function processUserInput(callback) {
  var name = prompt('Please enter your name.');
  callback(name);
}

processUserInput(greeting);
```

## Q7: What is `this` in JavaScript?
**A:** The `this` keyword refers to the object it belongs to. Its value is determined based on how a function is called:
- In the global context, `this` refers to the global object.
- Inside a method, `this` refers to the object calling the method.
- In an event handler, `this` refers to the element that received the event.

## Q8: What are Promises in JavaScript?
**A:** A **Promise** is an object representing the eventual completion or failure of an asynchronous operation. It has three states:
1. **Pending**: Initial state.
2. **Fulfilled**: Operation completed successfully.
3. **Rejected**: Operation failed.

Example:
```javascript
let promise = new Promise(function(resolve, reject) {
  // Do something...
});
```

## Q9: What are arrow functions?
**A:** Arrow functions are a shorthand for writing functions in ES6. They do not have their own `this`, and inherit `this` from the parent scope.

Example:
```javascript
const add = (a, b) => a + b;
```

## Q10: What is the event delegation?
**A:** **Event delegation** is a technique in JavaScript where you add a single event listener to a parent element to manage events for multiple child elements, improving efficiency.

Example:
```javascript
document.getElementById("parent").addEventListener("click", function(e) {
  if (e.target && e.target.matches("button.classname")) {
    console.log("Button clicked");
  }
});
```

## Q11: What is `strict mode` in JavaScript?
**A:** **Strict mode** is a feature introduced in ECMAScript 5 that allows you to place a program or a function in a "strict" operating context. It helps catch common coding bloopers, prevents the use of some unsafe syntax, and disables features like implicit globals.

## Q12: What is the difference between synchronous and asynchronous programming?
**A:** 
- **Synchronous** programming: Code is executed sequentially, one line at a time, blocking further execution until the current line is complete.
- **Asynchronous** programming: Code execution doesn't have to wait for the current task to finish and can continue running other tasks (e.g., using Promises, callbacks).

---

## Q31: What is `hoisting` in JavaScript?
**A:** **Hoisting** is JavaScript’s default behavior of moving variable and function declarations to the top of their scope before code execution. This means that variables and functions can be used before they are declared, though variables are `undefined` until initialized.

Example:
```javascript
console.log(x);  // undefined due to hoisting
var x = 5;       // declaration is hoisted, but initialization is not
```
Functions declared using the `function` keyword are fully hoisted and can be called before they are defined:
```javascript
greet();  // "Hello"
function greet() {
    console.log("Hello");
}
```

---

## Q32: What is the difference between `let`, `var`, and `const`? 
**A:** 
- **`var`**: Function-scoped, can be redeclared, and hoisted.
- **`let`**: Block-scoped, cannot be redeclared in the same scope, but can be reassigned.
- **`const`**: Block-scoped, cannot be redeclared or reassigned, but mutable properties of objects declared with `const` can still be changed.

Example:
```javascript
var x = 1;
let y = 2;
const z = 3;

x = 5;  // allowed
y = 6;  // allowed
z = 7;  // Error: Assignment to constant variable
```

---

## Q33: Explain closures in JavaScript.
**A:** A **closure** is a function that "remembers" the environment in which it was created. It allows a function to access variables from an outer function scope, even after the outer function has returned.

Example:
```javascript
function outer() {
    let count = 0;
    return function inner() {
        count++;
        console.log(count);
    }
}

const increment = outer();
increment(); // 1
increment(); // 2
```

---

## Q34: What is the event loop in JavaScript?
**A:** The **event loop** is a mechanism that allows JavaScript to perform non-blocking operations. It manages the asynchronous operations by handling the execution of tasks from the call stack and the task queue. The event loop continuously checks if the call stack is empty and processes tasks from the queue.

---

