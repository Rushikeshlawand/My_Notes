class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        next = null;
    }
}

public class identicalOrNot {

    node head;

    identicalOrNot() {
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

    void printData() {
        node last = head;
        while (last != null) {
            System.out.println(last.data);
            last = last.next;

        }
    }

    boolean areIdentical(node head1, node head2) {
        node current1 = head1;
        node current2 = head2;
        while (current1 != null && current2 != null) {
            if (current1.data != current2.data) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return (current1 == null && current2 == null);
    }

    public static void main(String[] args) {
        identicalOrNot obj = new identicalOrNot();
        obj.insertAtTheEnd(10);
        obj.insertAtTheEnd(20);
        obj.insertAtTheEnd(30);
        obj.insertAtTheEnd(40);
        obj.printData();

        System.out.println("////////");

        identicalOrNot obj1 = new identicalOrNot();
        obj1.insertAtTheEnd(10);
        obj1.insertAtTheEnd(20);
        obj1.insertAtTheEnd(30);
        obj1.insertAtTheEnd(40);
        obj1.printData();

        if (obj.areIdentical(obj.head, obj1.head)) {
            System.out.println("identical");
        } else {
            System.out.println("Not identical");
        }
    }
}