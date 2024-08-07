import java.util.LinkedList;
import java.util.Queue;

class Node1 {
    int data;
    Node1 left;
    Node1 right;

    Node1(int data) {
        this.data = data;
        left = right = null;
    }
}

public class leveltreeUsingQueue {

    static void levelorder(Node1 root) {
        Queue<Node1> q = new LinkedList<>();
        int sum = 0;
        q.add(root);

        while (!q.isEmpty()) {
            Node1 temp = q.poll();
            sum = sum + temp.data;
            System.out.println(temp.data);
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        System.out.println("sum is " + sum);
    }

    static boolean found(Node1 root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key)
            return true;
        return found(root.left, key) || found(root.right, key);

    }

    static void InsertData(Node1 root, int Key) {
        Queue<Node1> qt = new LinkedList<>();
        qt.add(root);
        while (!qt.isEmpty()) {
            Node1 temp = qt.poll();
            if (temp.left == null) {
                temp.left = new Node1(Key);
                break;
            } else {
                qt.add(temp.left);
            }
            if (temp.right == null) {
                temp.right = new Node1(Key);
                break;
            } else {
                qt.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Node1 root = new Node1(1);
        root.left = new Node1(2);
        root.right = new Node1(3);
        root.left.right = new Node1(4);
        root.left.left.right = new Node1(6);

        root.right.left = new Node1(21);
        root.right.right = new Node1(6);

        levelorder(root);
        System.out.println();

        System.out.println(found(root, 59));

    }
}