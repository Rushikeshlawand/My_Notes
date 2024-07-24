class LL { // This is the main class for the linked list.
    Node head; // A reference to the first node of the linked list.
    private int size; // A private integer to keep track of the size of the linked list.

    LL() { // Constructor initializing size to 0.
        size = 0;
    }

    // Inner Node Class
    public class Node { // An inner class representing each node in the linked list.
        int data;
        Node next; // Reference to the next node in the linked list.

        Node(int data) { // Constructor initializing the node's data and setting the next reference to
                         // null.
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Adding an Element at the Beginning
    public void addFirst(int data) { // Method to add a new node at the beginning of the list.
        Node newNode = new Node(data); // Create a new node with the provided data.
        newNode.next = head; // Set the new node's next reference to the current head.
        head = newNode; // Update the head to point to the new node.
    }

    // Adding an Element at the End
    public void addLast(int data) { // Method to add a new node at the end of the list.
        Node newNode = new Node(data);

        if (head == null) { // If head is null, set head to newNode.
            head = newNode;
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null) { // Traverse to the last node and set its next reference to the new node.
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    // Printing the List
    public void printList() {
        Node currNode = head;
        while (currNode != null) { // Traverse from head to the end, printing each node's data
            System.out.print(currNode.data + " => ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Removing the First Element
    public void removeFirst() {
        if (head == null) { // If head is null, print a message indicating the list is empty.
            System.out.println("Empty list");
            return;
        }
        head = head.next; // Otherwise, set head to head.next and decrement the size.
        size--;
    }

    // Removing the Last Element
    public void removeLast() {
        if (head == null) { // If head is null, print a message indicating the list is empty.
            System.out.println("Empty list");
            return;
        }
        size--; // Decrement the size.
        if (head.next == null) { // If head.next is null, set head to null.
            head = null;
            return;
        }

        Node currNode = head; // Traverse to the second last node and set its next reference to null.
        Node lastNode = head.next;
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }

    // Getting the Size
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LL obj = new LL();
        obj.addFirst(10);
        obj.addFirst(20);
        obj.addFirst(30);
        obj.printList(); // 30 => 20 => 10 => null
        obj.addLast(40);
        obj.printList(); // 30 => 20 => 10 => 40 => null
        obj.removeFirst();
        obj.printList(); // 20 => 10 => 40 => null
        obj.removeLast();
        obj.printList();
        System.out.println("length size of Linked list is: " + obj.getSize()); // 4
    }
}
