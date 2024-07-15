Introduction 

A LinkedList in Java is a linear and fundamental data structure that stores the Java components. It offers Java users an efficient, flexible way to store and work with various Java elements.
Java LinkedList allows dynamic size adjustment as and when elements are subtracted or added. Here in this tutorial, you will learn what is LinkedList, its needs, its operation, demonstration, LinkedList in a data structure, and much more.
A linked list is a linear data structure where elements are stored in nodes, and each node points to the next node in the sequence.

*Types of Linked Lists:
Singly Linked List: Each node points to the next node.
Doubly Linked List: Each node points to both the next and the previous node.
Circular Linked List: The last node points back to the first node, forming a circle.

*Why Use Linked Lists:

1. Dynamic Size: Unlike arrays, linked lists can grow and shrink in size dynamically. This makes them suitable for situations where the number of elements is unknown or varies significantly.
2. Efficient Insertions/Deletions: Insertions and deletions in a linked list are more efficient compared to arrays. Adding or removing elements can be done in constant time O(1) if the position is known, without the need to shift elements like in arrays.
3. Memory Utilization: Linked lists do not require a contiguous block of memory. This can help in better memory utilization, especially in systems with limited memory or fragmented memory.
4. Flexible Data Structures: Linked lists form the basis for implementing various other data structures such as stacks, queues, and graphs. They provide a flexible way to represent these structures.
5. Ease of Expansion: Adding new elements to a linked list does not require resizing or copying the existing elements, unlike dynamic arrays which might need to allocate new memory and copy old elements during resizing.

*A DS in which elements are stored in non contiouos allocation memory
Each element in LL is a node.
node is 2 types
1. data types
2. address which hold address of next node.
1st node called special node "head". 
Last node callend "tail". having address null.
insetion & deletion happens in constant time.
