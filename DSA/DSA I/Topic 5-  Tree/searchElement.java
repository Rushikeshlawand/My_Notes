public class searchElement {
    static boolean findEle(Node root, int target) {
        if (root == null) {
            return false;
        }
        if (root.data == target) {
            return true;
        }
        if (findEle(root.left, target) || findEle(root.right, target) ){
            return true;
        } else {
            return false;
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
        System.out.println(findEle(root, 2));//find element
    }
}