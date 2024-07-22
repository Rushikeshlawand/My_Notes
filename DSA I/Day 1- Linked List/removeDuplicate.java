class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class removeDuplicate {
    Node head;

    public removeDuplicate() {
        this.head = null;
    }

    public void insertAtTheEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void removeDuplicates() {
        if (head == null) {
            return;
        }

        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public void printData() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        removeDuplicate obj = new removeDuplicate();
        obj.insertAtTheEnd(12);
        obj.insertAtTheEnd(12);
        obj.insertAtTheEnd(14);
        obj.insertAtTheEnd(15);
        System.out.print("Before removing duplicates: ");
        obj.printData();
        System.out.println();

        obj.removeDuplicates();
        System.out.print("After removing duplicates: ");
        obj.printData();
    }
}
