import java.util.LinkedList;
import java.util.Queue;

public class levelOrder {

    static void levelOreder(Node root) {
        Queue<Node> que = new LinkedList<>();
        que.add(root);

        while (!que.isEmpty()) {
            Node temp = que.poll();
            if (temp == null) {
                break;
            }
            System.out.println(temp.data + " ");
            if (root.left != null) {
                que.add(temp.left);
            }
            if (root.right != null) {
                que.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.right = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        levelOreder(root);
    }
}