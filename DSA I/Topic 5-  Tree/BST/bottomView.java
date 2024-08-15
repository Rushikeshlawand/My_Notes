package BST;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class bottomView {
    Node root;

    bottomView() {
        root = null;
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    void printBottomView(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> nodeQueue = new LinkedList<>();
        Queue<Integer> hdQueue = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();

        nodeQueue.add(root);
        hdQueue.add(0);

        while (!nodeQueue.isEmpty()) {
            Node temp = nodeQueue.poll();
            int hd = hdQueue.poll();

            map.put(hd, temp.data);

            if (temp.left != null) {
                nodeQueue.add(temp.left);
                hdQueue.add(hd - 1);
            }
            if (temp.right != null) {
                nodeQueue.add(temp.right);
                hdQueue.add(hd + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
    }

    public static void main(String[] args) {
        bottomView tree = new bottomView();
        tree.insert(10);
        tree.insert(5);
        tree.insert(3);
        tree.insert(8);
        tree.insert(9);
        tree.insert(15);
        tree.insert(12);
        tree.insert(18);

        System.out.println("Bottom view of the tree:");
        tree.printBottomView(tree.root);
    }
}
