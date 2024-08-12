public class sumTree {
    static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    static int isSumTree(Node root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return root.data;

        int leftSum = isSumTree(root.left);
        int rightSum = isSumTree(root.right);

        if (leftSum == -1 || rightSum == -1 || root.data != leftSum + rightSum)
            return -1;

        return root.data + leftSum + rightSum;
    }

    public static void main(String[] args) {
        Node root = new Node(26);
        root.left = new Node(16);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(2);
//        root.right.right = new node(3);
//        root.left.right.left = new node(3);
//        root.left.right.right= new node(3);

        System.out.print("Post-order: ");
        postOrder(root);
        System.out.println();

        if (isSumTree(root) != -1) {
            System.out.println("sum tree.");
        } else {
            System.out.println("not a sum tree.");
        }
    }
}