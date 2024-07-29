public class MergeLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    void mergeAtEnd(MergeLinkedList secondList) {
        if (head == null) {
            head = secondList.head;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = secondList.head;
        }
        secondList.head = null; // Empty the second list
    }

    void print() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergeLinkedList list1 = new MergeLinkedList();
        // 5->7->17->13->11
        list1.add(5);
        list1.add(7);
        list1.add(17);
        list1.add(13);
        list1.add(11);
        System.out.print("First list: ");
        list1.print();

        MergeLinkedList list2 = new MergeLinkedList();
        // 12->10->2->4->6
        list2.add(12);
        list2.add(10);
        list2.add(2);
        list2.add(4);
        list2.add(6);
        System.out.print("Second list: ");
        list2.print();

        list1.mergeAtEnd(list2);

        System.out.print("Merged first list: ");
        list1.print();
        System.out.print("Second list after merge (should be empty): ");
        list2.print();
    }
}
