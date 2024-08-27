# DSA
```plaintext
Data Structures
    |
    +-- Arrays
    |     |
    |     +-- 1D Arrays
    |     +-- 2D Arrays
    |
    +--String
    |   |
    |   +-- StringBuilder
    |   +-- StringBuffer
    |
    +-- Linked Lists
    |     |
    |     +-- Singly Linked List
    |     +-- Doubly Linked List
    |     +-- Circular Linked List
    |
    +-- Stacks
    |     |
    |     +-- Array-based Stack
    |     +-- Linked List-based Stack
    |
    +-- Queues
          |
          +-- Array-based Queue
          +-- Linked List-based Queue
          +-- Circular Queue
          +-- Priority Queue
```

## Arrays in Java

## Definition

An array is a data structure that allows you to store a fixed-size sequence of elements of the same type. Arrays are useful for storing collections of data and can be indexed to access individual elements.

## Types of Arrays

1. **Single-Dimensional Arrays**: An array with one index to access its elements.
2. **Multi-Dimensional Arrays**: Arrays that have more than one index, such as 2D or 3D arrays.

## Operations


```plaintext
Array Operations
================

1. Traversal
-------------
[10] [20] [30] [40] [50]
   ↑    ↑    ↑    ↑    ↑
   Start   Iterate through each element

2. Insertion
-------------
Before Insertion:
[10] [20] [30] [40] [50]
           ↑
           Insertion Point

After Insertion:
[10] [20] [30] [New] [40] [50]
                    ↑
                    Inserted Element

3. Deletion
-------------
Before Deletion:
[10] [20] [30] [40] [50]
                    ↑
                    Deletion Point

After Deletion:
[10] [20] [30] [50]
                ↑
                Shift Elements Left

4. Searching
-------------
Array: [10] [20] [30] [40] [50]
Search for 30:
   ↑
   Found Element

5. Sorting
-------------
Before Sorting:
[40] [10] [50] [30] [20]

After Sorting:
[10] [20] [30] [40] [50]

```
# Arrays in Java

## Advantages

| **Advantage**   | **Description**                                        |
|-----------------|--------------------------------------------------------|
| **Efficiency**  | Arrays provide a way to efficiently store and access data. |
| **Direct Access** | Elements can be accessed directly using their index. |

## Limitations

| **Limitation**    | **Description**                                    |
|-------------------|----------------------------------------------------|
| **Fixed Size**    | Once an array's size is defined, it cannot be changed. |
| **Type Restriction** | Arrays can only hold elements of a single data type. |

# Strings in Java

## Definition

In Java, a `String` is a sequence of characters. It is used to represent textual data and is one of the most commonly used classes in Java. Strings are immutable, meaning once a `String` object is created, its value cannot be changed.

# StringBuilder and StringBuffer

`StringBuilder` and `StringBuffer` are classes used to create mutable sequences of characters in Java. They provide efficient ways to manipulate strings compared to `String`, which is immutable.

## StringBuilder

### Definition
`StringBuilder` is a class that provides an API for creating and manipulating mutable sequences of characters. It is designed for single-threaded environments and is generally preferred for performance efficiency.

## StringBuffer

StringBuffer is similar to StringBuilder but is synchronized, which makes it thread-safe. It is designed for use in multi-threaded environments where thread safety is a concern.

# StringBuilder vs StringBuffer

`StringBuilder` and `StringBuffer` are both used for mutable sequences of characters, but they have some key differences. 

## Differences

| Feature                | StringBuilder                          | StringBuffer                          |
|------------------------|----------------------------------------|---------------------------------------|
| **Thread Safety**      | Not synchronized, not thread-safe      | Synchronized, thread-safe              |
| **Performance**        | Generally faster due to lack of synchronization overhead | Slower due to synchronization overhead |
| **Usage Scenario**     | Preferred for single-threaded scenarios | Preferred for multi-threaded scenarios |
| **Constructors**       | `StringBuilder()` and `StringBuilder(String str)` | `StringBuffer()` and `StringBuffer(String str)` |
| **Methods**            | Same methods as `StringBuffer`, but without synchronization overhead | Same methods as `StringBuilder`, with synchronization |
| **Historical Note**    | Introduced in JDK 5 (Java 1.5)         | Introduced in JDK 1.0 (earlier than `StringBuilder`) |


# StringBuilder Operations

`StringBuilder` is mutable, meaning modifications are made to the existing object without creating new ones.

## Common Operations

| Operation                  | Description                                                   | Example Code                                      |
|----------------------------|---------------------------------------------------------------|---------------------------------------------------|
| **Create StringBuilder**   | Instantiate a new `StringBuilder` object.                    | `StringBuilder sb = new StringBuilder("Hello");`  |
| **Append**                 | Add text to the end of the builder.                          | `sb.append(" World");`                            |
| **Insert**                 | Insert text at a specific index.                             | `sb.insert(5, " Beautiful");`                     |
| **Delete**                 | Remove text from a specific index range.                     | `sb.delete(5, 15);`                               |
| **Replace**                | Replace text within a specific index range.                  | `sb.replace(5, 11, "Java");`                      |
| **Reverse**                | Reverse the sequence of characters.                          | `sb.reverse();`                                   |
| **Length**                 | Get the length of the sequence.                              | `sb.length();`                                    |
| **Char at Index**          | Get the character at a specific index.                       | `sb.charAt(1);` // 'e'                             |

# StringBuffer Operations

`StringBuffer` is similar to `StringBuilder`, but it is synchronized and thread-safe.

## Common Operations

| Operation                  | Description                                                   | Example Code                                      |
|----------------------------|---------------------------------------------------------------|---------------------------------------------------|
| **Create StringBuffer**    | Instantiate a new `StringBuffer` object.                     | `StringBuffer sb = new StringBuffer("Hello");`    |
| **Append**                 | Add text to the end of the buffer.                           | `sb.append(" World");`                            |
| **Insert**                 | Insert text at a specific index.                             | `sb.insert(5, " Beautiful");`                     |
| **Delete**                 | Remove text from a specific index range.                     | `sb.delete(5, 15);`                               |
| **Replace**                | Replace text within a specific index range.                  | `sb.replace(5, 11, "Java");`                      |
| **Reverse**                | Reverse the sequence of characters.                          | `sb.reverse();`                                   |
| **Length**                 | Get the length of the sequence.                              | `sb.length();`                                    |
| **Char at Index**          | Get the character at a specific index.      


# String vs. StringBuilder vs. StringBuffer

## String

`String` is immutable, meaning once a `String` object is created, it cannot be modified. All operations that seem to modify a `String` actually create a new `String` object.

### Advantages

| Advantage                  | Description                                             |
|----------------------------|---------------------------------------------------------|
| **Immutability**           | Provides security and thread safety due to immutability.|
| **Thread-Safe**            | Since `String` objects are immutable, they are inherently thread-safe.|
| **Simple API**             | Easy-to-use methods for common operations like concatenation and substring.|

### Limitations

| Limitation                 | Description                                             |
|----------------------------|---------------------------------------------------------|
| **Performance Overhead**   | Creating new `String` objects for every modification can lead to performance overhead in high-performance scenarios.|
| **Memory Usage**           | Excessive creation of `String` objects can lead to increased memory usage and garbage collection overhead.|

## StringBuilder

`StringBuilder` is mutable, meaning it can be modified after its creation. It is designed for scenarios where you need to perform a lot of modifications to a string.

### Advantages

| Advantage                  | Description                                             |
|----------------------------|---------------------------------------------------------|
| **Performance**            | More efficient for concatenations and modifications compared to `String` due to its mutable nature.|
| **Reduced Memory Usage**   | Since it modifies the same object, it can lead to reduced memory usage compared to `String`.|
| **Flexible Operations**    | Provides a flexible and efficient way to perform multiple modifications. |

### Limitations

| Limitation                 | Description                                             |
|----------------------------|---------------------------------------------------------|
| **Not Thread-Safe**        | `StringBuilder` is not synchronized, so it's not thread-safe. Use `StringBuffer` if thread safety is required.|
| **Less Safety**            | Mutable nature means that `StringBuilder` objects can be changed by other parts of the program, potentially leading to unexpected results.|

## StringBuffer

`StringBuffer` is similar to `StringBuilder` but is synchronized, making it thread-safe.

### Advantages

| Advantage                  | Description                                             |
|----------------------------|---------------------------------------------------------|
| **Thread-Safe**            | Synchronized methods make it safe to use in multi-threaded environments.|
| **Efficient Modifications**| Provides efficient operations for modifying strings in a thread-safe manner.|

### Limitations

| Limitation                 | Description                                             |
|----------------------------|---------------------------------------------------------|
| **Performance Overhead**   | Synchronized methods can introduce performance overhead compared to `StringBuilder` in single-threaded scenarios.|
| **Less Efficient**         | The overhead of synchronization can make `StringBuffer` less efficient for scenarios where thread safety is not a concern.|

# Linked List in Java

## Definition

A linked list is a data structure consisting of a sequence of elements, each contained in a node. Each node contains a data part and a reference (or link) to the next node in the sequence. Unlike arrays, linked lists do not have a fixed size and can grow or shrink dynamically.

## Real-Time Example

**Real-Time Example: Playlist in a Music Player**

Imagine a playlist in a music player app. Each song in the playlist can be thought of as a node in a linked list. Each node contains the song details (such as title, artist, and duration) and a reference to the next song in the playlist. This allows you to traverse through the playlist, add new songs, or remove existing ones dynamically.

## Types of Linked Lists

1. **Singly Linked List**
   - Each node points to the next node in the list.
   - Allows traversal in one direction only.

   [Head] -> [Node1] -> [Node2] -> [Node3] -> [Node4] -> [null]


2. **Doubly Linked List**
   - Each node contains a reference to both the next and previous nodes.
   - Allows traversal in both directions.
```plaintext
   [Head] <-> [Node1] <-> [Node2] <-> [Node3] <-> [Node4] <-> [null]
      ^            ^             ^             ^            
      |            |             |             | 
      v            v             v             v
    [null]        [Head]        [Node1]        [Node2]
```

3. **Circular Linked List**
   - The last node points back to the first node, forming a circular structure.
   - Can be singly or doubly linked.
```plaintext
[Head] -> [Node1] -> [Node2] -> [Node3] -> [Node4] -+
   ^                                             |
   +---------------------------------------------+
```
## Advantages

| Advantage                  | Description                                             |
|----------------------------|---------------------------------------------------------|
| **Dynamic Size**           | Can easily grow or shrink in size, as elements are not stored in contiguous memory locations.|
| **Efficient Insertions/Deletions** | Insertion and deletion of nodes are efficient and can be performed with O(1) time complexity, given the reference to the node.|
| **No Fixed Size**          | Unlike arrays, linked lists do not need to be pre-sized. They can dynamically accommodate varying numbers of elements.|

## Limitations

| Limitation                 | Description                                             |
|----------------------------|---------------------------------------------------------|
| **Memory Overhead**        | Each node requires extra memory for storing references to the next (and possibly previous) node(s).|
| **Sequential Access**      | Accessing elements requires traversal from the head, leading to O(n) time complexity for access operations.|
| **Complexity in Implementation** | More complex to implement compared to arrays and other linear data structures due to the need to manage node references.|

## Operations

1. **Insertion**
   - **At the Beginning**: Add a new node at the start of the list.
   - **At the End**: Add a new node at the end of the list.
   - **At a Specific Position**: Insert a new node at a specified position in the list.

2. **Deletion**
   - **From the Beginning**: Remove the node at the start of the list.
   - **From the End**: Remove the node at the end of the list.
   - **From a Specific Position**: Remove the node at a specified position in the list.

3. **Traversal**
   - **Singly Linked List**: Traverse the list from the head to the last node.
   - **Doubly Linked List**: Traverse the list in both directions, from head to tail and tail to head.

4. **Searching**
   - **Linear Search**: Traverse the list to find a node with a specific value.

5. **Update**
   - **Modify Node Data**: Update the data stored in a specific node.

6. **Reversing**
   - **Reverse the List**: Change the direction of the links to reverse the order of nodes in the list.























```plaintext
Algorithms
    |
    +-- Sorting
    |     |
    |     +-- Bubble Sort
    |     +-- Selection Sort
    |     +-- Insertion Sort
    |     +-- Merge Sort
    |     +-- Quick Sort
    |     +-- Heap Sort
    |
    +-- Searching
    |     |
    |     +-- Linear Search
    |     +-- Binary Search
    |     +-- Hashing
    |
    +-- Graph Algorithms
    |     |
    |     +-- Breadth-First Search (BFS)
    |     +-- Depth-First Search (DFS)
    |     +-- Dijkstra’s Algorithm
    |     +-- Bellman-Ford Algorithm
    |     +-- Kruskal’s Algorithm
    |     +-- Prim’s Algorithm
    |
    +-- Dynamic Programming
    |     |
    |     +-- Knapsack Problem
    |     +-- Longest Common Subsequence
    |     +-- Matrix Chain Multiplication
    |
    +-- Greedy Algorithms
    |     |
    |     +-- Activity Selection Problem
    |     +-- Huffman Coding
    |
    +-- Backtracking
          |
          +-- N-Queens Problem
          +-- Sudoku Solver
          +-- Subset Sum Problem
```

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
