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
public class treeUsingQueue {

    static void levelorder(Node1 root) {
        Queue<Node1> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node1 temp = q.poll();
            System.out.println(temp.data);
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Node1 root = new Node1(1);
        root.left = new Node1(2);
        root.right = new Node1(3);
        root.left.right = new Node1(4);
        root.right.left = new Node1(5);
        root.left.left = new Node1(6);

        levelorder(root);
        System.out.println();
    }
}