import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class deletenode {
    Node root;

    void insertEle(int key) {
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
            return;
        }

        Queue<Node> que = new LinkedList<>();
        que.add(root);

        while (!que.isEmpty()) {
            Node temp = que.poll();
            if (temp.left == null) {
                temp.left = newNode;
                break;
            } else {
                que.add(temp.left);
            }
            if (temp.right == null) {
                temp.right = newNode;
                break;
            } else {
                que.add(temp.right);
            }
        }
    }

    void deleteEle(int key) {
        if (root == null) {
            return;
        }

        Queue<Node> que = new LinkedList<>();
        que.add(root);

        Node keyNode = null;
        Node temp = null;

        while (!que.isEmpty()) {
            temp = que.poll();

            if (temp.data == key) {
                keyNode = temp;
            }

            if (temp.left != null) {
                que.add(temp.left);
            }

            if (temp.right != null) {
                que.add(temp.right);
            }
        }

        if (keyNode != null) {
            int x = temp.data;
            deleteDeepest(temp);
            keyNode.data = x;
        }
    }

    void deleteDeepest(Node delNode) {
        Queue<Node> que = new LinkedList<>();
        que.add(root);

        Node temp;

        while (!que.isEmpty()) {
            temp = que.poll();

            if (temp == delNode) {
                temp = null;
                return;
            }

            if (temp.right != null) {
                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                } else {
                    que.add(temp.right);
                }
            }

            if (temp.left != null) {
                if (temp.left == delNode) {
                    temp.left = null;
                    return;
                } else {
                    que.add(temp.left);
                }
            }
        }
    }

    // Method to print the tree in level order
    void printTree() {
        if (root == null) {
            return;
        }

        Queue<Node> que = new LinkedList<>();
        que.add(root);

        while (!que.isEmpty()) {
            Node temp = que.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null) {
                que.add(temp.left);
            }

            if (temp.right != null) {
                que.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        deletenode obj = new deletenode();
        obj.insertEle(5);
        obj.insertEle(4);
        obj.insertEle(2);
        obj.insertEle(1);

        System.out.println("Tree before deletion:");
        obj.printTree();
        System.out.println();

        obj.deleteEle(4);

        System.out.println("Tree after deletion:");
        obj.printTree();
        System.out.println();
    }
}
