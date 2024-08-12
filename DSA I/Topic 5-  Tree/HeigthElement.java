import java.util.LinkedList;
import java.util.Queue;

public class HeigthElement {
    static int HeightNode(Node root){
        if(root==null){
            return 0;
        }
        int lheight=HeightNode(root.left);
        int rheight=HeightNode(root.right);
        return 1+Math.max(lheight, rheight);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(1);
        root.right.left = new Node(2);
        root.left.left = new Node(13);
        root.left.left.left = new Node(15);
        root.left.left.right = new Node(14);
        root.left.left.left.left = new Node(16);

        System.out.println("Count : "+HeightNode(root));
    }
}