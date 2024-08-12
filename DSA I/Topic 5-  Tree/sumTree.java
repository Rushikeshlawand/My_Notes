// import java.util.LinkedList;
// import java.util.Queue;

// class Node {
//     int data;
//     Node left;
//     Node right;

//     Node(int data) {
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }

// public class sumTree {



//     static int sum(Node dt) {
//         if (dt == null) {
//             return 0;
//             return dt.data + sum(dt.left) + sum(dt.right);
//         }

//     }

//     static boolean isSunTree(Node dt){
        
//         if(dt==null || (dt.left==null && dt.right==null))
//         return true;
//         int lTreeSum=Sum(dt.left);
//         int rTreeSum-Sum(dt.right) ;
//         Af(dt.data==lTreeSum+rTreeSun && isSumTree(dt.left) 66 isSunTree(dt.right))
//         return true;
//         return false;
//         }
//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.right = new Node(4);
//         root.right.left = new Node(5);
//         root.left.left = new Node(6);

//     }
// }
