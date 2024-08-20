// package BST;

// class Node {
//     int data;
//     Node left, right;

//     Node(int data) {
//         this.data = data;
//         left = right = null;
//     }
// }

// public class LCA {
//     Node root;

//     LCA() {
//         root = null;
//     }

//     void bstt(int data) {
//         root = bst(root, data);
//     }

//     static Node bst(Node root, int data) {
//         if (root == null) {
//             root = new Node(data);
//             return root;
//         }
//         if (data < root.data) {
//             root.left = bst(root.left, data);
//         } else if (data > root.data) {
//             root.right = bst(root.right, data);
//         }
//         return root;
//     }

//     void leaf(Node root) {
//         if (root == null) {
//             return;
//         }
//         if (root.left == null && root.right == null) {
//             System.out.println(root.data);
//         }
//         leaf(root.left);
//         leaf(root.right);
//     }

//     Node findLCA(Node root, int n1, int n2) {
//         if (root == null) {
//             return null;
//         }

     
//         if (root.data > n1 && root.data > n2) {
//             return findLCA(root.left, n1, n2);
//         }

     
//         if (root.data < n1 && root.data < n2) {
//             return findLCA(root.right, n1, n2);
//         }

//         return root;
//     }

//     public static void main(String[] args) {
//         LCA rt = new LCA();
//         rt.bstt(10);
//         rt.bstt(5);
//         rt.bstt(3);
//         rt.bstt(8);
//         rt.bstt(9);
//         rt.bstt(15);
//         rt.bstt(12);
//         rt.bstt(18);

//         System.out.println("Leaf nodes:");
//         rt.leaf(rt.root);

//         System.out.println("\nLCA of 3 and 9: " + rt.findLCA(rt.root, 3, 9).data);
//         System.out.println("LCA of 3 and 12: " + rt.findLCA(rt.root, 3, 12).data);
//     }
// }
