

public class rightMostElement {
    static int rightEle(Node root) {
        if (root.right == null) {
            return root.data;
        }
        int data = rightEle(root.right);
        return data;
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
        int n =rightEle(root);
        System.out.println(n);
    }
}