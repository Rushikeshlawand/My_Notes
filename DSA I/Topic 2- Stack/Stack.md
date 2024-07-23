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