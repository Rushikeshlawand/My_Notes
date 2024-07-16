class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class countTheLength {
    node head;

    countTheLength() {
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

    int length() {
        int count = 0;
        node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    int middleElement() {
        node slow = head;
        node fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        countTheLength obj = new countTheLength();

        obj.insertAtTheEnd(10);
        obj.insertAtTheEnd(20);
        obj.insertAtTheEnd(30);
        obj.insertAtTheEnd(40);
        obj.insertAtTheEnd(50);
        obj.insertAtTheEnd(60);
        System.out.println("Length is:  " + obj.length());
        int middleElement = obj.middleElement();
        System.out.println("middle element is: "+middleElement);
    }
}
