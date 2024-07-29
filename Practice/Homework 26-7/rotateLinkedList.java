// .Given a singly linked list, The task is to rotate the linked list counter-clockwise
// by k nodes.
// Examples:
// Input: linked list = 10->20->30->40->50->60, k = 4
// Output: 50->60->10->20->30->40.
// Explanation: k is smaller than the count of nodes in a linked list so (k+1 )th node i.e. 50
// becomes the head node and 60’s next points to 10
// Input: linked list = 30->40->50->60, k = 2
// Output: 50->60->30->40.

public class rotateLinkedList {
    // Definition of the Node class
    class Node {
        int data;
        Node next;

        // Constructor to initialize node data and next pointer
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Head of the linked list
    Node head;

    // Method to add a node at the end of the linked list
    void add(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) { // If the list is empty, make the new node the head
            head = newNode;
            return;
        }

        Node currNode = head; // Start from the head
        while (currNode.next != null) { // Traverse to the last node
            currNode = currNode.next;
        }
        currNode.next = newNode; // Add the new node at the end
    }

    // Method to rotate the linked list by k nodes
    void rotate(int k) {
        if (head == null || k == 0) { // If the list is empty or no rotation is needed
            return;
        }

        // Compute the length of the linked list
        Node currNode = head;
        int length = 1; // Start with length 1 to count the head node
        while (currNode.next != null) { // Traverse the list to find its length
            currNode = currNode.next;
            length++;
        }

        // If k is greater than the length of the list, reduce it
        k = k % length; // Only need to rotate by the remainder of k/length
        if (k == 0) { // If k is now 0, no rotation is needed
            return;
        }

        // Make the linked list circular
        currNode.next = head; // Link the last node to the head

        // Traverse to the (length - k)th node
        int stepsToNewHead = length - k; // The position of the new head
        currNode = head;
        for (int i = 1; i < stepsToNewHead; i++) { // Move to the node just before the new head
            currNode = currNode.next;
        }

        // Update the head and break the circular linked list
        head = currNode.next; // The new head is the (k+1)th node
        currNode.next = null; // Break the link to make the list linear again
    }

    // Method to print the linked list
    void print() {
        Node currNode = head; // Start from the head
        while (currNode != null) { // Traverse the list until the end
            System.out.print(currNode.data + " "); // Print the current node's data
            currNode = currNode.next; // Move to the next node
        }
        System.out.println(); // Print a new line after the list
    }

    public static void main(String[] args) {
        rotateLinkedList list = new rotateLinkedList();

        // Adding elements to the list: 10->20->30->40->50->60
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.print("Original list: ");
        list.print();

        list.rotate(4); // Rotate the list by 4 positions

        System.out.print("Rotated list: ");
        list.print(); // Expected output: 50->60->10->20->30->40
    }
}
