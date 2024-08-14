package BST;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class LCA {
    Node root;

    LCA() {
        root = null;
    }

    void bstt(int data) {
        root = bst(root, data);
    }

    static Node bst(Node root, int data) {
        Node newnode = new Node(data);

        if (root == null) {
            root = newnode;
            return root;
        }
        if (root.data > data) {
            root.left = bst(newnode, data);

        } else {
            root.right = bst(root.right, data);
        }
        return root;
    }

    void leaf(Node root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.println(root.data);
        }
        leaf(root.left);
    }

    public static void main(String[] args) {
        LCA rt = new LCA();
        rt.bstt(10);
        rt.bstt(5);
        rt.bstt(3);
        rt.bstt(8);
        rt.bstt(9);
        System.out.println();
        rt.leaf(rt.root);

    }
}