class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedList {
    node head;
    linkedList() {
        head = null;
    }

    void insertAtTheEnd(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
        }
    }
    public static void main(String[] args) {
        linkedList obj = new linkedList();
        obj.insertAtTheEnd(10);
        
    }
}