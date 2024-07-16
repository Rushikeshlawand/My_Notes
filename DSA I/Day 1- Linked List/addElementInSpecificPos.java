class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class addElementInSpecificPos {
    node head;

    addElementInSpecificPos() {
        head = null;
    }

    void insertAtAnypoint(node pre, int data) {
        if (pre.next == null) {
            return;
        }
        node newnNode = new node(data);
        newnNode.next = pre.next;
        pre.next = newnNode;
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

    void printData() {
        node last = head;
        while (last != null) {
            System.out.println(last.data);
            last = last.next;

        }
    }

    public static void main(String[] args) {
        addElementInSpecificPos obj = new addElementInSpecificPos();
        obj.insertAtTheEnd(10);
        obj.insertAtTheEnd(20);
        obj.insertAtTheEnd(30);
        obj.insertAtTheEnd(40);
        obj.insertAtTheEnd(50);

        node addNode=obj.head.next.next.next;
        obj.insertAtAnypoint(addNode, 1);
        obj.printData();
    }
}
