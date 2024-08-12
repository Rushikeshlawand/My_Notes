public class maxTreeElement {
    static int max = 0;
    static void maxElement(Node root) {

        if (root == null) {
            return;
        }
        if (root.data > max) {
            max = root.data;
        }
        maxElement(root.left);
        maxElement(root.right);
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
        maxElement(root);
        System.out.println(max);//max ele in BT
    }

}