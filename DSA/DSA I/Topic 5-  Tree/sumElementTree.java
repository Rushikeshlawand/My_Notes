public class sumElementTree {
    static int sum = 0;
    static void sumElement(Node root) {

        if (root == null) {
            return;
        }
        sum +=root.data;
        sumElement(root.left);
        sumElement(root.right);
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


        sumElement(root);
        System.out.println(sum);//sum of all elements

    }
}