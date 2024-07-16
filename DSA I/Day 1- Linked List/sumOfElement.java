class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class sumOfElement {
    node head;

    sumOfElement() {
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

    int sumOfElements() {
        int sum = 0;
        node current = head;
        while (current != null) {
            sum += current.data;
            current = current.next;
        }
        return sum;
    }
    public static void main(String[] args) {
        sumOfElement obj = new sumOfElement();
        obj.insertAtTheEnd(10);
        obj.insertAtTheEnd(20);
        obj.insertAtTheEnd(30);
        obj.insertAtTheEnd(40);
        obj.insertAtTheEnd(50);
        System.out.println("Sum of elements is : " + obj.sumOfElements());
    }
}
