// package BST;

// import java.util.*;

// class Node {
//     int data;
//     Node left, right;

//     Node(int data) {
//         this.data = data;
//         left = right = null;
//     }
// }

// public class spiralOrder {
//     Node root;

//     spiralOrder() {
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

//     void printSpiralOrder(Node root) {
//         if (root == null) {
//             return;
//         }

//         Stack<Node> s1 = new Stack<>();
//         Stack<Node> s2 = new Stack<>();

//         s1.push(root);

//         while (!s1.empty() || !s2.empty()) {
//             while (!s1.empty()) {
//                 Node temp = s1.pop();
//                 System.out.print(temp.data + " ");

//                 if (temp.right != null) {
//                     s2.push(temp.right);
//                 }
//                 if (temp.left != null) {
//                     s2.push(temp.left);
//                 }
//             }

//             while (!s2.empty()) {
//                 Node temp = s2.pop();
//                 System.out.print(temp.data + " ");

//                 if (temp.left != null) {
//                     s1.push(temp.left);
//                 }
//                 if (temp.right != null) {
//                     s1.push(temp.right);
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         spiralOrder tree = new spiralOrder();
//         tree.insert(10);
//         tree.insert(5);
//         tree.insert(3);
//         tree.insert(8);
//         tree.insert(9);
//         tree.insert(15);
//         tree.insert(12);
//         tree.insert(18);

//         System.out.println("Spiral order ");
//         tree.printSpiralOrder(tree.root);
//     }
// }
