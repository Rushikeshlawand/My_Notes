# DSA 
# Time and Space Complexities of Data Structures

| Data Structure | Operation       | Average Time Complexity | Worst Time Complexity | Space Complexity |
|----------------|-----------------|-------------------------|-----------------------|------------------|
| **Array**      | Access          | O(1)                    | O(1)                  | O(n)             |
|                | Search          | O(n)                    | O(n)                  | O(n)             |
|                | Insertion       | O(n)                    | O(n)                  | O(n)             |
|                | Deletion        | O(n)                    | O(n)                  | O(n)             |
| **Stack**      | Push            | O(1)                    | O(1)                  | O(n)             |
|                | Pop             | O(1)                    | O(1)                  | O(n)             |
|                | Peek            | O(1)                    | O(1)                  | O(n)             |
| **Queue**      | Enqueue         | O(1)                    | O(1)                  | O(n)             |
|                | Dequeue         | O(1)                    | O(1)                  | O(n)             |
| **Singly Linked List** | Access   | O(n)                    | O(n)                  | O(n)             |
|                | Search          | O(n)                    | O(n)                  | O(n)             |
|                | Insertion (Head)| O(1)                    | O(1)                  | O(n)             |
|                | Deletion (Head) | O(1)                    | O(1)                  | O(n)             |
| **Doubly Linked List** | Access   | O(n)                    | O(n)                  | O(n)             |
|                | Search          | O(n)                    | O(n)                  | O(n)             |
|                | Insertion (Head/Tail) | O(1)             | O(1)                  | O(n)             |
|                | Deletion (Head/Tail)  | O(1)             | O(1)                  | O(n)             |
| **Hash Table** | Access          | O(1)                    | O(n)                  | O(n)             |
|                | Search          | O(1)                    | O(n)                  | O(n)             |
|                | Insertion       | O(1)                    | O(n)                  | O(n)             |
|                | Deletion        | O(1)                    | O(n)                  | O(n)             |
| **Binary Search Tree** | Access  | O(log n)                | O(n)                  | O(n)             |
|                | Search          | O(log n)                | O(n)                  | O(n)             |
|                | Insertion       | O(log n)                | O(n)                  | O(n)             |
|                | Deletion        | O(log n)                | O(n)                  | O(n)             |
| **Heap**       | Access (Min/Max)| O(1)                    | O(1)                  | O(n)             |
|                | Insertion       | O(log n)                | O(log n)              | O(n)             |
|                | Deletion (Min/Max) | O(log n)             | O(log n)              | O(n)             |
| **Graph (Adjacency Matrix)** | Access | O(1)              | O(1)                  | O(V^2)           |
|                | Search (DFS/BFS)| O(V + E)                | O(V + E)              | O(V^2)           |
| **Graph (Adjacency List)**   | Access | O(V + E)              | O(V + E)              | O(V + E)         |
|                | Search (DFS/BFS)| O(V + E)                | O(V + E)              | O(V + E)         |

**Notes:**
- `n` is the number of elements in the data structure.
- `V` is the number of vertices and `E` is the number of edges (for graphs).
- The complexities are for standard operations; specific implementations might vary.

Week 1: Analysis of Algorithm, Mathematics, Bit Manipulation & Arrays

Class 1:  Analysis of Algorithm, Mathematics & Bit Manipulation

    Asymptotic Analysis 
    Time and Space Complexity
    Masters Theorem
    Bitwise Operators (Bitwise AND, Bitwise OR, Bitwise XOR, Left Shift, Right Shift, etc )
    Problems: GCD and LCM, Iterative Power, Generate Power Set, etc

Class 2:  Arrays

    Arrays - Introduction and Advantages
    Types of Arrays
    Operations of Arrays - Searching, Insertion, and Deletion
    Sliding Window Technique 
    Problems: Largest Element in an Array, Leaders in an Array Problem, Maximum Subarray Sum, etc

02Week 2: Recursion, Backtracking & Searching

Class 1: Recursion and Backtracking

    Introduction to Recursion
    Writing Base Cases in Recursion
    Tail Recursion
    Introduction to Backtracking
    Problems: Print 1 to N Using Recursion, Rope Cutting Problem, Rat in a Maze, etc

Class 2: Searching

    Linear Search
    Binary Search - Iterative and Recursive Approach
    Analysis of Binary Search
    Two Pointer Approach
    Problems: Index of the first Occurrence in SortedArray, Count 1s in a Sorted Binary Array, Square root of a number, etc

03Week 3: Sorting, Matrix & Hashing

Class 1: Sorting

    Overview of the Sorting Algorithm
    Sorting Algorithms e.g. Bubble Sort, Selection Sort, Insertion Sort, Merge Sort, Quick Sort with Analysis
    Stability of Sorting Algorithms
    Problems: Minimum Difference in an Array, Chocolate Distribution Problem, etc

Class 2: Matrix and Hashing

    Multidimensional Array
    Passing 2D Arrays as an argument
    Hashing Introduction, applications, and analysis
    Collision Handling
    Hashing Function
    Problems: Transpose of a Matrix, Matrix in Snake Pattern, Count Distinct Elements, Frequencies of Array Elements, etc

04Week 4: Strings and Linked List

Class 1: Strings

    String Introduction 
    Overview of Pattern Searching Algorithm
    Naive and Improved Naive Pattern Searching
    Rabin Karp Algorithm
    KMP Algorithm (Constructing LPS Array and Complete Algorithms)
    Problems: Palindrome Check, Reverse words in a string, Anagram Search, etc

Class 2: Linked List

    Introduction to Linked List
    Traversing a Linked List 
    Insertion and Deletion of Node in Linked List
    Doubly Linked List and Circular Linked List
    Problems: Middle of Linked List, Deleting a Node without accessing Head pointer of Linked List, etc

05Week 5: Stack, Queue & Deque

Class 1: Stack

    Stack - Introduction and Applications
    Stack Operations (e.g. push, pop, etc)
    Array Implementation of Stack 
    Linked List Implementation of Stack 
    Problems: Balanced Parenthesis, Next Greater Element, etc

Class 2: Queue and Deque

    Queue - Introduction and Application
    Implementation of Queue using Array 
    Implementation of Queue using Linked List
    Deque - Introduction and Application
    Problems: Generate Numbers with Gven Dgits, First Circular Tour, etc

06Week 6: Tree and Binary Search Tree

Class 1: Tree

    Tree - Introduction and Application
    Introduction to Binary Tree
    Tree Traversal - Inorder, Preorder, and Postorder with Implementation
    Level Order Traversal
    Lowest Common Ancestor of a Binary Tree
    Serialize and Deserialize a Binary Tree
    Problems: Height of a Binary Tree, Diameter of a Binary Tree, etc

Class 2: Binary Search Tree

    BST - Introduction and Application
    Search in BST with Implementation
    Insert in BST with Implementation
    Deletion in BST with Implementation
    Self Balancing BST - AVL Tree, Red Black Tree
    Problems: Find Kth Smallest in BST, Vertical Sum in Binary Tree, Floor in BST, etc

07Week 7: Greedy, Heap and Graph

Class 1: Greedy and Heap

    Introduction to Greedy Algorithm
    Binary Heap - Introduction
    Binary Heap - Insertion, Heapify, and Extract
    Binary Heap - Decrease, Delete and Build Heap
    Heap Sort
    Priority Queue
    Problems: Activity Selection Problem, Job Sequencing Problem, Sort K Sorted Arrays, etc

Class 2: Graph

    Introduction to Graph
    Graph Representation(Adjacency List and Matrix)
    Adjacency Matrix and List Comparison
    Breadth First Search - Introduction and Implementation
    Depth First Search - Introduction and Implementation
    Prims Algorithm - Introduction and Implementation
    Dijkstra Algorithm - Introduction and Implementation
    Problems: Bridges in Graph, Detect Cycle in a Directed Graph, etc

08Week 8: Graph(Advanced) and Dynamic Programming

Class 1: Graph (Advanced)

    Kruskal's Algorithm
    Bellman-Ford Algorithm
    Ford-Fulkerson Algorithm
    Problems: Strongly Connected Components, Find the No. of Islands, etc

Class 2: Dynamic Programming

    Introduction to Dynamic Programming
    Dynamic Programming Approach vs Greedy Approach
    How to approach a DP Problem
    Memoization and Tabulation methods
    Problems: Coin Change Problem, Longest Common Subsequence, Subset Sum Problem, etc
# Arrays in Java

## Advantages

| **Advantage**       | **Description**                                                                 |
|---------------------|---------------------------------------------------------------------------------|
| **Efficiency**      | Arrays provide a way to efficiently store and access data.                      |
| **Direct Access**   | Elements can be accessed directly using their index.                            |
| **Cache Friendly**  | Arrays have contiguous memory allocation, which improves cache performance.     |
| **Simple Structure**| Easy to use for simple data storage and iteration over elements.                |
| **Memory Management** | Arrays avoid the overhead of dynamic memory allocation, leading to lower memory use. |

## Limitations

| **Limitation**       | **Description**                                                                |
|----------------------|--------------------------------------------------------------------------------|
| **Fixed Size**       | Once an array's size is defined, it cannot be changed.                          |
| **Type Restriction** | Arrays can only hold elements of a single data type.                            |
| **Insertion/Deletion Costs** | Inserting or deleting elements can be inefficient, requiring shifting of elements. |
| **No Built-In Methods** | Arrays lack higher-level methods for operations like sorting and searching, unlike more complex data structures. |
| **Inefficient Memory Usage** | If the array is not fully utilized, it leads to wasted memory space.    |

# ArrayList in Java

An **ArrayList** in Java is part of the Java Collections Framework and is a resizable array implementation of the List interface. Unlike arrays, which have a fixed size, ArrayList can grow and shrink dynamically as elements are added or removed. It allows duplicate elements and maintains the insertion order.

## Key Characteristics of ArrayList

- **Resizable**: 
  - It can automatically resize itself as elements are added or removed.

- **Non-synchronized**: 
  - By default, ArrayList is not synchronized, meaning it is not thread-safe.

- **Random Access**: 
  - Provides fast access to elements via the `get(int index)` method.

- **Allows Null Values**: 
  - ArrayList can contain null elements.


# Array vs ArrayList vs LinkedList in Java

| **Feature**               | **Array**                                | **ArrayList**                             | **LinkedList**                            |
|---------------------------|------------------------------------------|-------------------------------------------|-------------------------------------------|
| **Size**                  | Fixed size at the time of creation.      | Dynamic size, resizes automatically.      | Dynamic size, grows as needed.            |
| **Indexing (Access)**     | O(1) – Direct access via index.          | O(1) – Direct access via index.           | O(n) – Access requires traversal.         |
| **Insertion**             | O(n) – Costly if elements need shifting. | O(n) – Costly if elements need shifting.  | O(1) – Efficient at head/tail (O(n) at random positions). |
| **Deletion**              | O(n) – Costly due to shifting elements.  | O(n) – Costly due to shifting elements.   | O(1) – Efficient at head/tail (O(n) at random positions). |
| **Memory Allocation**     | Contiguous block of memory.              | Dynamically resized array (reallocates more memory when needed). | Non-contiguous nodes with pointers.       |
| **Memory Efficiency**     | Efficient (less overhead).               | Less efficient due to dynamic resizing.   | Less efficient due to node overhead (extra pointers). |
| **Iteration**             | O(n) – Iteration over elements.          | O(n) – Iteration over elements.           | O(n) – Iteration over elements.           |
| **Search (By Value)**     | O(n) – Linear search required.           | O(n) – Linear search required.            | O(n) – Linear search required.            |
| **Random Access**         | O(1) – Direct index-based access.        | O(1) – Direct index-based access.         | O(n) – Requires traversal from the head.  |
| **Data Structure Type**   | Basic, part of the language.             | Resizable array from Java Collections.    | Doubly linked list from Java Collections. |
| **Usage Scenario**        | When fixed size is known and frequent access by index is needed. | When dynamic resizing is required and random access is frequent. | When frequent insertions and deletions at head/tail are required. |
| **Thread Safety**         | Not thread-safe.                         | Not thread-safe (unless synchronized).    | Not thread-safe (unless synchronized).    |


# StringBuilder and StringBuffer

`StringBuilder` and `StringBuffer` are classes used to create mutable sequences of characters in Java. They provide efficient ways to manipulate strings compared to `String`, which is immutable.

## StringBuilder

### Definition
`StringBuilder` is a class used for creating and manipulating mutable sequences of characters. It is designed for single-threaded environments and is generally preferred for performance efficiency.

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
|
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

# Stack Data Structure

## Definition

A stack is a linear data structure that follows the Last In, First Out (LIFO) principle. This means that the most recently added item is the first to be removed. Stacks are used to store data in a specific order and are often implemented using arrays or linked lists.

## Example

Imagine a stack of plates in a cafeteria. You place a plate on top of the stack, and when you need a plate, you take the one on the top. The plate you added last is the first one you take out. This is analogous to how a stack data structure works in computing.

## Types of Operations

1. **Push**: Add an item to the top of the stack.
2. **Pop**: Remove the item from the top of the stack.
3. **Peek/Top**: View the item at the top of the stack without removing it.
4. **IsEmpty**: Check if the stack is empty.

## Diagram

### Stack Operations

```markdown
      +-----+
      |  3  |  <- Top
      +-----+
      |  2  |
      +-----+
      |  1  |
      +-----+
```

# Stack Overflow

## Definition

A stack overflow occurs when a program tries to use more stack space than is available. The stack is a region of memory that stores function calls, local variables, and control flow information. When a stack overflow happens, it generally results in a program crash or abnormal termination.

## Causes of Stack Overflow

1. **Deep Recursion**: If a function calls itself too many times without an adequate base case or termination condition, it can exhaust the stack space.
2. **Infinite Recursion**: A recursive function that doesn't have a proper termination condition will keep calling itself indefinitely, eventually causing a stack overflow.
3. **Excessive Stack Allocation**: Allocating too much memory for local variables or function calls within the stack can lead to overflow.

## Real-Time Example

Imagine a stack of plates in a cafeteria. If you keep adding plates to the stack without removing any, eventually the stack will reach its physical limit and collapse. Similarly, in programming, if the stack grows beyond its allocated space due to excessive function calls or large local variable allocations, it will cause a stack overflow.

# Stack Underflow

## Definition

A stack underflow occurs when an attempt is made to pop an element from an empty stack. Since a stack operates on a Last In, First Out (LIFO) principle, there must be at least one element in the stack to remove. When the stack is empty and a pop operation is performed, it leads to a stack underflow condition.

## Causes of Stack Underflow

1. **Empty Stack Pop Operation**: Trying to remove an item from a stack that is already empty.
2. **Improper Stack Management**: Errors in stack operations where the stack's state is not properly managed or updated.

## Real-Time Example

Consider a stack of plates in a cafeteria. If the stack is empty and you try to remove a plate, there's nothing to remove, which is similar to a stack underflow in programming. The action is invalid because there are no plates (or elements) left to handle.

# Queue

## Definition

A queue is a linear data structure that follows the First In, First Out (FIFO) principle. This means that the first element added to the queue will be the first one to be removed. Queues are used to manage data in a way that the earliest added item is processed first.

## Real-Time Example

A real-world example of a queue is a line of people waiting at a checkout counter in a store. The person who arrives first at the counter is the first one to be served and checked out. Similarly, in a queue data structure, the first element added is the first one to be removed.


### Queue Diagram

```plaintext
       +-----+
       |  1  |  <- Front
       +-----+
       |  2  |
       +-----+
       |  3  |
       +-----+
       | Rear |
       +-----+
```

## Types of Queues

1. **Simple Queue:** The basic queue structure where elements are added at the rear and removed from the front.
2. **Circular Queue:** A queue in which the last position is connected back to the first position to form a circle. It helps in utilizing the memory more efficiently.
3. **Priority Queue:** A queue where each element has a priority. Elements with higher priority are served before those with lower priority.
4. **Double-Ended Queue (Deque):** A queue that allows insertion and deletion of elements from both ends.

## Advantages

- **Order Preservation:** Maintains the order of elements, which is useful in various applications like scheduling and buffering.
- **Efficiency:** Provides efficient ways to add and remove elements, typically with constant time complexity for enqueue and dequeue operations.
- **Flexibility:** Various types of queues (e.g., circular, priority) can be used to address specific needs and optimize performance.

## Limitations

- **Fixed Size:** Like stacks, queues can have a fixed size, leading to overflow if the queue reaches its capacity.
- **Limited Access:** Elements can only be accessed from the front or the rear, not from arbitrary positions within the queue.

## Operations

### Enqueue

Adds an element to the rear of the queue.

### Dequeue

Removes the element from the front of the queue.

### Peek/Front

Returns the front element of the queue without removing it.

### IsEmpty

Checks if the queue is empty.


# HashMap vs HashSet vs Hashtable in Java

| **Feature**                | **HashMap**                                      | **HashSet**                                      | **Hashtable**                                    |
|----------------------------|--------------------------------------------------|--------------------------------------------------|--------------------------------------------------|
| **Underlying Data Structure** | Implements a hash table as a key-value pair mapping. | Implements a hash table to store unique elements. | Implements a hash table as a key-value pair mapping. |
| **Thread Safety**          | Not thread-safe (use `ConcurrentHashMap` if needed). | Not thread-safe (use `ConcurrentHashSet` if needed). | Thread-safe (all methods are synchronized).        |
| **Allows Null Keys/Values** | Allows one `null` key and multiple `null` values. | No null values are allowed.                      | Does not allow `null` keys or values.            |
| **Performance**            | Faster because it is unsynchronized.             | Faster because it is unsynchronized.             | Slower due to synchronization overhead.           |
| **Ordering**               | No ordering guarantee (for `LinkedHashMap`, order is maintained). | No ordering guarantee.                          | No ordering guarantee.                           |
| **Use Case**               | Use when you need a key-value pair mapping with non-synchronized access. | Use when you need a collection of unique elements. | Use when you need a thread-safe key-value pair mapping. |
| **Introduced in Java**     | Java 1.2                                         | Java 1.2                                         | Java 1.0                                         |

## HashMap

### Definition
`HashMap` is a collection that implements the `Map` interface. It stores key-value pairs and uses a hash table for storage. Keys are hashed to compute an index where values are stored.

### Real-Time Example
In an online e-commerce application, a `HashMap` can be used to store user session data. The session ID can be the key, and the session details (such as user information and cart contents) can be the value.

### Advantages and Limitations

| **Aspect**         | **HashMap**                                               |
|--------------------|------------------------------------------------------------|
| **Advantages**     | - Fast performance for basic operations (O(1) on average).<br>- Allows one null key and multiple null values. |
| **Limitations**    | - Does not maintain any order.<br>- Not synchronized. |

### Important Considerations
- **Hash Function**: Crucial for performance; affects how keys are distributed.
- **Load Factor**: Affects the balance between time and space cost.
- **Resizing**: Involves rehashing keys when the capacity is exceeded.

---

## HashSet

### Definition
`HashSet` is a collection that implements the `Set` interface, backed by a hash table. It does not allow duplicate elements and does not maintain any order of elements.

### Real-Time Example
In a recommendation system, a `HashSet` can be used to store unique tags or keywords associated with user preferences to avoid duplication.

### Advantages and Limitations

| **Aspect**         | **HashSet**                                               |
|--------------------|------------------------------------------------------------|
| **Advantages**     | - Ensures no duplicate elements.<br>- Provides fast operations for basic operations (O(1) on average). |
| **Limitations**    | - Does not maintain order.<br>- Not synchronized. |

### Important Considerations
- **Hash Function**: Essential for performance and ensuring uniqueness.
- **Null Elements**: Allows one null element.
- **Performance**: Depends on the quality of the hash function and load factor.

---

## Hashtable

### Definition
`Hashtable` is a collection that implements the `Map` interface. It is similar to `HashMap` but is synchronized, meaning it is thread-safe and can be used in concurrent environments. It does not allow null keys or values.

### Real-Time Example
In a multi-threaded server application, a `Hashtable` can be used to store configuration settings that are accessed and modified by multiple threads concurrently.

### Advantages and Limitations

| **Aspect**         | **Hashtable**                                            |
|--------------------|-----------------------------------------------------------|
| **Advantages**     | - Thread-safe and synchronized.<br>- Ensures data consistency in multi-threaded environments. |
| **Limitations**    | - Slower performance compared to `HashMap` due to synchronization.<br>- Does not allow null keys or values. |

### Important Considerations
- **Synchronization**: Ensures thread safety but can lead to performance overhead.
- **Null Elements**: Does not support null keys or values.
- **Performance**: Generally slower due to synchronization.

---

## Comparison Summary

| **Collection** | **Allows Null Keys** | **Allows Null Values** | **Thread-Safe** | **Maintains Order** |
|----------------|-----------------------|------------------------|-----------------|---------------------|
| **HashMap**    | Yes                   | Yes                    | No              | No                  |
| **HashSet**    | Yes                   | Yes                    | No              | No                  |
| **Hashtable**  | No                    | No                     | Yes             | No                  |

Each of these collections serves different needs depending on the use case, whether it’s for performance, thread safety, or specific requirements regarding null values and ordering.

# Tree

## Definition
A tree is a hierarchical data structure consisting of nodes, where each node contains a value and links to child nodes. The top node is known as the root, and each node can have zero or more child nodes. Trees are used to represent hierarchical relationships and are fundamental in various algorithms and data structures.

## Real-Time Example
A common real-time example of a tree is a **file system** on a computer. In a file system, directories (folders) are nodes that can contain files or other directories, forming a hierarchical structure. 

## Types of Trees

### 1. Binary Tree
- **Definition**: A tree where each node has at most two children (left and right).
- **Types**:
  - **Full Binary Tree**: Every node has either 0 or 2 children.
  - **Complete Binary Tree**: All levels, except possibly the last, are completely filled, and all nodes are as left as possible.

### 2. Binary Search Tree (BST)
- **Definition**: A binary tree where each node has a value greater than all values in its left subtree and less than all values in its right subtree.

### 3. AVL Tree
- **Definition**: A self-balancing binary search tree where the difference in heights of left and right subtrees (balance factor) is at most 1.

### 4. Red-Black Tree
- **Definition**: A self-balancing binary search tree where nodes are colored red or black to ensure the tree remains balanced.

### 5. B-Tree
- **Definition**: A self-balancing tree data structure that maintains sorted data and allows searches, sequential access, insertions, and deletions in logarithmic time. Commonly used in databases and file systems.


## Advantages

- **Hierarchical Representation**: Trees are excellent for representing hierarchical relationships such as organizational structures, file systems, and XML documents.
- **Efficient Searching**: Data structures like Binary Search Trees (BST) and their balanced variants (AVL and Red-Black Trees) allow for efficient searching, insertion, and deletion operations.
- **Ordered Data**: Trees such as BSTs and Tries can maintain data in a sorted order, facilitating quick access and retrieval.
- **Flexibility**: Trees can be adapted to various needs, such as managing hierarchical data (e.g., file systems) or indexing (e.g., B-Trees in databases).

## Limitations

- **Complexity**: Tree structures can become complex to implement and manage, especially for self-balancing trees like AVL or Red-Black Trees.
- **Memory Usage**: Trees require additional memory for pointers or references, which can be significant for large trees.
- **Balancing Overhead**: Self-balancing trees (AVL, Red-Black) involve additional overhead for balancing, which can impact performance.

## Important Aspects

1. **Traversal**: Common tree traversal techniques include:
   - **In-order**: Left, Root, Right (used for binary search trees to get sorted order).
   - **Pre-order**: Root, Left, Right.
   - **Post-order**: Left, Right, Root.
   - **Level-order**: Breadth-first traversal using a queue.

2. **Balancing**: For binary search trees, maintaining balance is crucial for ensuring efficient operations. Self-balancing trees like AVL and Red-Black Trees automatically handle balancing.

3. **Height and Depth**: The height of a tree is the number of edges on the longest path from the root to a leaf. The depth of a node is the number of edges from the root to that node.

4. **Applications**:
   - **File Systems**: Organize files and directories.
   - **Databases**: Indexing with B-Trees and Red-Black Trees.
   - **Networking**: Routing protocols and network multicast trees.

# Algorithms
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


# Sorting Algorithms

Sorting algorithms are fundamental in computer science, used to reorder items in a list or array according to a specific order, usually ascending or descending. Different algorithms offer various trade-offs in terms of efficiency and complexity.

## Bubble Sort

### Definition
Bubble Sort is a simple comparison-based sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

### How It Works
1. **Compare Adjacent Elements**: Start with the first element and compare it to the next element.
2. **Swap if Needed**: If the current element is greater than the next element, swap them.
3. **Repeat**: Continue this process for each element until the end of the list.
4. **Passes**: Repeat the above steps for the remaining unsorted portion of the list until no swaps are needed.

### Complexity
- **Time Complexity**: O(n^2) (worst and average case)
- **Space Complexity**: O(1)


```java
public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
```
---

## Selection Sort

### Definition
Selection Sort is an in-place comparison-based sorting algorithm that divides the input list into a sorted and an unsorted region. It repeatedly selects the smallest (or largest) element from the unsorted region and moves it to the end of the sorted region.

### How It Works
1. **Find Minimum**: Find the minimum element in the unsorted region of the list.
2. **Swap**: Swap the minimum element with the first element of the unsorted region.
3. **Move Boundary**: Move the boundary between the sorted and unsorted regions one element to the right.
4. **Repeat**: Repeat until the entire list is sorted.

### Complexity
- **Time Complexity**: O(n^2) (worst and average case)
- **Space Complexity**: O(1)
```java
public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
```
---

## Insertion Sort

### Definition
Insertion Sort is a simple comparison-based sorting algorithm that builds the final sorted list one item at a time. It takes each element from the input list and inserts it into its correct position in the already sorted part of the list.

### How It Works
1. **Iterate**: Start with the second element and compare it with the elements before it.
2. **Shift**: Shift all elements that are greater than the current element to the right.
3. **Insert**: Insert the current element into its correct position.
4. **Repeat**: Continue until the entire list is sorted.

### Complexity
- **Time Complexity**: O(n^2) (worst case), O(n) (best case)
- **Space Complexity**: O(1)

```plaintext
Initial array: [5, 3, 8, 4, 2]

1st Pass:
[5, 3, 8, 4, 2]  -> Compare 3 with 5, insert 3 before 5
[3, 5, 8, 4, 2]  -> First two elements are sorted

2nd Pass:
[3, 5, 8, 4, 2]  -> Compare 8 with 5, no change needed
[3, 5, 8, 4, 2]  -> First three elements are sorted

3rd Pass:
[3, 5, 8, 4, 2]  -> Compare 4 with 8, shift 8 right
[3, 5, 8, 8, 2]  -> Compare 4 with 5, shift 5 right
[3, 5, 5, 8, 2]  -> Insert 4 between 3 and 5
[3, 4, 5, 8, 2]  -> First four elements are sorted

4th Pass:
[3, 4, 5, 8, 2]  -> Compare 2 with 8, shift 8 right
[3, 4, 5, 8, 8]  -> Compare 2 with 5, shift 5 right
[3, 4, 5, 5, 8]  -> Compare 2 with 4, shift 4 right
[3, 4, 4, 5, 8]  -> Compare 2 with 3, shift 3 right
[3, 3, 4, 5, 8]  -> Insert 2 at the start
[2, 3, 4, 5, 8]  -> The entire array is now sorted

Sorted array: [2, 3, 4, 5, 8]

```
---

## Merge Sort

### Definition
Merge Sort is a divide-and-conquer comparison-based sorting algorithm. It divides the list into two halves, sorts each half, and then merges the sorted halves.

### How It Works
1. **Divide**: Divide the list into two halves recursively until each sublist contains a single element.
2. **Merge**: Merge the sublists to produce sorted sublists until the entire list is sorted.

### Complexity
- **Time Complexity**: O(n log n) (worst, average, and best case)
- **Space Complexity**: O(n)

```plaintext
Initial array: [5, 3, 8, 4, 2]

1st Step: Divide the array
[5, 3, 8, 4, 2]
  /          \
[5, 3, 8]   [4, 2]
  /   \       /  \
[5]  [3, 8]  [4]  [2]
     /   \         /  \
   [3]   [8]     [2]  [4]

2nd Step: Merge step-by-step
Merge [3] and [8] -> [3, 8]
Merge [2] and [4] -> [2, 4]

Merge [5] and [3, 8] -> [3, 5, 8]
Merge [2, 4] -> already merged

3rd Step: Final merge
Merge [3, 5, 8] and [2, 4] -> [2, 3, 4, 5, 8]

Sorted array: [2, 3, 4, 5, 8]

```
---

## Quick Sort

### Definition
Quick Sort is a divide-and-conquer comparison-based sorting algorithm. It selects a 'pivot' element from the list, partitions the other elements into those less than and greater than the pivot, and recursively sorts the partitions.

### How It Works
1. **Choose Pivot**: Select a pivot element from the list.
2. **Partition**: Rearrange the list so that elements less than the pivot come before it and elements greater than the pivot come after it.
3. **Recursively Apply**: Apply the above steps recursively to the sublists.

### Complexity
- **Time Complexity**: O(n^2) (worst case), O(n log n) (average case)
- **Space Complexity**: O(log n) (average case)

```plaintext
Initial array: [5, 3, 8, 4, 2]

1st Step: Choose a pivot (last element in this case)
Pivot = 2
[5, 3, 8, 4, 2] -> Partition around 2

Partition: 
- Elements less than 2 -> []
- Elements greater than 2 -> [5, 3, 8, 4]

After partition: 
[2] (pivot in correct position)

Left part to sort: [5, 3, 8, 4]

2nd Step: Choose a new pivot (4)
Pivot = 4
[5, 3, 8, 4] -> Partition around 4

Partition:
- Elements less than 4 -> [3]
- Elements greater than 4 -> [5, 8]

After partition:
[3, 4] (pivot in correct position)

Left parts to sort: [3] and [5, 8]

3rd Step: Sort [5, 8] by choosing a pivot
Pivot = 8
[5, 8] -> Partition around 8

Partition:
- Elements less than 8 -> [5]
- Elements greater than 8 -> []

Final sorted order:
[2, 3, 4, 5, 8]

Sorted array: [2, 3, 4, 5, 8]

```
---

## Heap Sort

### Definition
Heap Sort is a comparison-based sorting algorithm that uses a binary heap data structure. It first builds a max heap (or min heap) from the input data and then repeatedly extracts the maximum (or minimum) element from the heap and reconstructs the heap.

### How It Works
1. **Build Heap**: Convert the list into a max heap (or min heap).
2. **Extract Maximum**: Remove the maximum element from the heap and place it at the end of the list.
3. **Rebuild Heap**: Rebuild the heap from the remaining elements.
4. **Repeat**: Repeat the extraction and rebuilding steps until the heap is empty.

### Complexity
- **Time Complexity**: O(n log n) (worst, average, and best case)
- **Space Complexity**: O(1)

```plaintext
Initial array: [5, 3, 8, 4, 2]

Step 1: Build a max heap from the array.
[5, 3, 8, 4, 2] -> Create max heap

Max Heap:
        8
      /   \
     5     3
    / \
   4   2

Step 2: Swap the root (largest element) with the last element, and heapify the remaining heap.
[8, 5, 3, 4, 2] -> Swap 8 with 2 -> [2, 5, 3, 4, 8]
Heapify [2, 5, 3, 4]:
        5
      /   \
     4     3
    /
   2

Step 3: Repeat the process for the remaining heap.
[2, 5, 3, 4, 8] -> Swap 5 with 2 -> [2, 4, 3, 5, 8]
Heapify [2, 4, 3]:
        4
      /   \
     2     3

[2, 4, 3, 5, 8] -> Swap 4 with 2 -> [2, 3, 4, 5, 8]
Heapify [2, 3]:
        3
      /
     2

[2, 3, 4, 5, 8] -> Swap 3 with 2 -> [2, 3, 4, 5, 8]
Heapify [2]:
(No changes needed)

Final sorted array: [2, 3, 4, 5, 8]
```

# Linear Search vs Binary Search

## Linear Search

**Concept:**
- Linear search is the simplest search algorithm.
- It checks each element of a list or array sequentially until the desired element is found or the entire list has been searched.
- It works on both **sorted** and **unsorted** arrays.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

### How It Works:
1. Start from the first element.
2. Compare the element with the target value.
3. If the element matches the target, return the index.
4. If it doesn't match, move to the next element.
5. Continue until the element is found or the list ends.

### Example:
```java
public class LinearSearchExample {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Target found at index i
            }
        }
        return -1; // Target not found
    }
}
```
# Binary Search

**Concept:**
- Binary search is an efficient algorithm used to find the position of a target value within a **sorted** array.
- It works by repeatedly dividing the search interval in half, eliminating half of the elements at each step.

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)

## How It Works:
1. Start with the entire sorted array.
2. Compare the target value with the middle element.
3. If the target equals the middle element, return its index.
4. If the target is less than the middle element, search the left half of the array.
5. If the target is greater than the middle element, search the right half of the array.
6. Repeat the process until the target is found or the search interval becomes empty.

## Example Code:
```java
public class BinarySearchExample {
    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;
        
        while (left <= right) {
            int middle = left + (right - left) / 2;
            
            if (array[middle] == target) {
                return middle; // Target found
            }
            
            if (array[middle] < target) {
                left = middle + 1; // Search the right half
            } else {
                right = middle - 1; // Search the left half
            }
        }
        return -1; // Target not found
    }
}
```
# Greedy Algorithm
A greedy algorithm is a problem-solving approach that builds up a solution piece by piece, always choosing the next piece that offers the most immediate benefit or is the most optimal according to some criterion. The key idea is to make a series of choices that seem best at each step with the hope that these local optimal will lead to a global optimum.

# Graph Data Structure and Algorithms

A **graph** is a collection of nodes (also called vertices) and edges that connect pairs of nodes. Graphs are used to model relationships between objects in a wide range of applications, such as social networks, maps, web pages, or circuits.

## Graph Components:
- **Nodes/Vertices (V):** Represent the entities (e.g., people, places, or objects).
- **Edges (E):** Represent connections or relationships between pairs of nodes.

## Types of Graphs:
- **Directed Graphs (Digraphs):** Edges have a direction, meaning the relationship goes one way (from one vertex to another).
- **Undirected Graphs:** Edges have no direction, meaning the relationship is bidirectional.
- **Weighted Graphs:** Edges have weights (representing costs, distances, or capacities).
- **Unweighted Graphs:** All edges have the same weight or no weight at all.

## Applications:
1. Social Networks
2. Web Page Ranking (Google PageRank Algorithm)
3. Navigation and Maps (GPS, Google Maps)
4. Network Routing (Internet)
5. Biology (Protein Interaction Networks, Gene Sequencing)
6. Transportation Networks
7. Electrical Circuits
8. Image Processing and Computer Vision

## Advantages:
1. Social Networks
2. Web Page Ranking (Google PageRank Algorithm)
3. Navigation and Maps (GPS, Google Maps)
4. Network Routing (Internet)
5. Biology (Protein Interaction Networks, Gene Sequencing)
6. Transportation Networks
7. Electrical Circuits
8. Image Processing and Computer Vision

## Disadvantages:
1. Memory and Space Complexity
2. Computation Time for Large Graphs
3. Difficulties in Visualizing Large Graphs
4. Handling Dynamic Graphs
5. Scalability Issues






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

# Dynamic Programming in Java

## Definition
Dynamic Programming (DP) is a technique used to solve problems by breaking them down into smaller subproblems, solving each of those subproblems just once, and storing their solutions. The stored solutions are then reused (memoized) to solve the larger problem efficiently. DP is particularly effective for problems with overlapping subproblems and optimal substructure.

## Key Concepts
- **Overlapping Subproblems**: The problem can be broken down into smaller, reusable subproblems.
- **Optimal Substructure**: The optimal solution to the problem can be constructed from optimal solutions of its subproblems.
- **Memoization**: Storing the results of expensive function calls and reusing them when the same inputs occur again.

## Example: Fibonacci Series

The Fibonacci series is a classic example of a problem that can be efficiently solved using dynamic programming.
