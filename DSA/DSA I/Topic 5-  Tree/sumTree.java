// class Node {
//     int data;
//     Node left, right;

//     Node(int item) {
//         data = item;
//         left = right = null;
//     }
// }
// public class sumTree {

//     static int isSumTree(Node root) {
//         if (root == null)
//             return 0;

//         if (root.left == null && root.right == null)
//             return root.data;

//         int leftSum = isSumTree(root.left);
//         int rightSum = isSumTree(root.right);

//         if (leftSum == -1 || rightSum == -1 || root.data != leftSum + rightSum)
//             return -1;

//         return root.data + leftSum + rightSum;
//     }

//     public static void main(String[] args) {
//         Node root = new Node(26);
//         root.left = new Node(16);
//         root.right = new Node(6);
//         root.left.left = new Node(2);
//         root.left.right = new Node(2);
//         // root.right.right = new node(3);
//         // root.left.right.left = new node(3);
//         // root.left.right.right= new node(3);

//         if (isSumTree(root) != -1) {
//             System.out.println("sum tree.");
//         } else {
//             System.out.println("not a sum tree.");
//         }
//     }
// }