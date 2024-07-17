class node {
    int data;
    node next;

   public node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedList {
    node head;

    public linkedList() {
        this.head = null;
    }

    public void insertAtTheEnd(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    void printData() {
        node last = head;
        while (last != null) {
            System.out.println(last.data);
            last = last.next;

        }
    }
    public static void main(String[] args) {
        linkedList obj = new linkedList();
        obj.insertAtTheEnd(10);
        obj.insertAtTheEnd(20);
        obj.insertAtTheEnd(30);
        obj.insertAtTheEnd(40);
        obj.insertAtTheEnd(50);
        obj.printData();
    }
}