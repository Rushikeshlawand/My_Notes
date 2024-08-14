# Tree Data Structure

## Definition

A tree is a hierarchical data structure consisting of nodes, with a single node as the root. Each node can have zero or more child nodes, and a unique path exists from the root to each node.

## Key Terminology

1. **Node**: The basic unit of a tree containing a value or data.
2. **Root**: The top node of a tree, where tree traversal begins.
3. **Edge**: The link between two nodes.
4. **Leaf**: A node with no children.
5. **Parent**: A node that has one or more child nodes.
6. **Child**: A node directly connected to another node when moving away from the root.
7. **Subtree**: A tree consisting of a node and its descendants.
8. **Height**: The length of the longest path from the root to a leaf.
9. **Depth**: The length of the path from the root to a specific node.

## Why Tree is Considered a Non-Linear Data Structure?

The data in a tree are not stored in a sequential manner, i.e., they are not stored linearly. Instead, they are arranged on multiple levels, or we can say it is a hierarchical structure. For this reason, the tree is considered to be a non-linear data structure.

## Types of Trees

### Binary Tree

A binary tree is a tree where each node has at most two children, referred to as the left child and the right child.

**Properties:**

- **Full Binary Tree**: Every node has 0 or 2 children.
- **Perfect Binary Tree**: All internal nodes have two children and all leaves are at the same level.
- **Complete Binary Tree**: All levels are completely filled except possibly the last level, and the last level has all nodes as left as possible.
- **Balanced Binary Tree**: The height of the left and right subtrees of any node differ by at most one.

### Binary Search Tree (BST)

A binary search tree (BST) is a binary tree with an additional property:

- For each node, the value of all the nodes in the left subtree is less than the node’s value, and the value of all the nodes in the right subtree is greater than the node’s value.
- Facilitates fast lookup, addition, and deletion operations.

### AVL Tree

A self-balancing binary search tree where the height difference between the left and right subtrees is no more than one for every node.

- Provides O(log n) time complexity for search, insertion, and deletion.

### Red-Black Tree

A self-balancing binary search tree where nodes have an extra bit for color (red or black).

## Tree Traversal Methods

### Depth-First Search (DFS)

1. **Inorder Traversal (Left, Root, Right)**:
   - Visits the left subtree, then the root node, and finally the right subtree.
   - In a BST, it visits nodes in ascending order.

2. **Preorder Traversal (Root, Left, Right)**:
   - Visits the root node first, then the left subtree, and finally the right subtree.

3. **Postorder Traversal (Left, Right, Root)**:
   - Visits the left subtree, then the right subtree, and finally the root node.

### Breadth-First Search (BFS)

- **Level Order Traversal**:
  - Visits nodes level by level from the root to the leaves.

## Applications of Trees

1. **Binary Search Trees (BSTs)**: Efficient searching, insertion, and deletion operations.
2. **Heaps**: Used in priority queues and for implementing heap sort.
3. **Trie (Prefix Tree)**: Efficient information retrieval, such as autocomplete and spell-checking.
4. **Decision Trees**: Used in machine learning for classification and regression tasks.
5. **Syntax Trees**: Used in compilers to parse expressions and statements.
