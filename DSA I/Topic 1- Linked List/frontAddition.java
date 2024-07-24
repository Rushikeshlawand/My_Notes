class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class frontAddition {
    node head;

    frontAddition() {
        head = null;
    }

    void insertAtTheEnd(int data) {
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

    void insertAtTheFront(int data) {
        node newNode = new node(data);
        newNode.next = head;
        head = newNode;
    }

    void printData() {
        node last = head;
        while (last != null) {
            System.out.println(last.data);
            last = last.next;

        }
    }
    public static void main(String[] args) {
        frontAddition obj = new frontAddition();
        obj.insertAtTheEnd(10);
        obj.insertAtTheEnd(20);
        obj.insertAtTheEnd(30);
        obj.insertAtTheEnd(40);
        obj.insertAtTheEnd(50);
        obj.insertAtTheFront(1);
        obj.printData();
    }
}
