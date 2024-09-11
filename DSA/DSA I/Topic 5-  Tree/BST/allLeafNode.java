// package BST;

// class Node {
//     int data;
//     Node left, right;

//     Node(int data) {
//         this.data = data;
//         left = right = null;
//     }
// }

// public class allLeafNode {
//     Node root;

//     allLeafNode() {
//         root = null;
//     }

//     void insert(int data) {
//         root = insertRec(root, data);
//     }

//     Node insertRec(Node root, int data) {
//         if (root == null) {
//             root = new Node(data);
//             return root;
//         }
//         if (data < root.data) {
//             root.left = insertRec(root.left, data);
//         } else if (data > root.data) {
//             root.right = insertRec(root.right, data);
//         }
//         return root;
//     }

//     void printLeafNodes(Node root) {
//         if (root == null) {
//             return;
//         }
//         if (root.left == null && root.right == null) {
//             System.out.println(root.data);
//             return;
//         }
//         if (root.left != null) {
//             printLeafNodes(root.left);
//         }
//         if (root.right != null) {
//             printLeafNodes(root.right);
//         }
//     }

//     public static void main(String[] args) {
//         allLeafNode tree = new allLeafNode();
//         tree.insert(10);
//         tree.insert(5);
//         tree.insert(3);
//         tree.insert(8);
//         tree.insert(9);
//         tree.insert(15);
//         tree.insert(12);
//         tree.insert(18);

//         System.out.println("Leaf nodes:");
//         tree.printLeafNodes(tree.root);
//     }
// }
