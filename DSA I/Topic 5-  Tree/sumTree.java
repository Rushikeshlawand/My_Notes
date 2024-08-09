import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class sumTree {

    static void InsertData(Node root, int Key) {
        Queue<Node> qt = new LinkedList<>();
        qt.add(root);
        while (!qt.isEmpty()) {
            Node temp = qt.poll();
            if (temp.left == null) {
                temp.left = new Node(Key);
                break;
            } else {
                qt.add(temp.left);
            }
            if (temp.right == null) {
                temp.right = new Node(Key);
                break;
            } else {
                qt.add(temp.right);
            }
        }
    }

    static boolean sumTree(Node root) {
        if (root == null) {
            return false;
        }
        

        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.left.left = new Node(6);

    }
}
