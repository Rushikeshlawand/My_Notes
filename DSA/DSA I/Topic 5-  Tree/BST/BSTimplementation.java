package BST;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BSTimplementation {
    Node root;

    BSTimplementation() {
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

    public static void main(String[] args) {
        BSTimplementation rt = new BSTimplementation();
        rt.bstt(10);
        rt.bstt(5);
        rt.bstt(3);
        rt.bstt(8);
        rt.bstt(9);

    }
}