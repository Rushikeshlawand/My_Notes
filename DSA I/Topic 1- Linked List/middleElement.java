class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class middleElement {
    static node head;

    middleElement() {
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

    int getlen(node head) {
        int len = 0;
        node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    int middle(node head) {
        int len = getlen(head);
        node temp = head;
        int mid = len / 2;
        while (mid > 0) {
            temp = temp.next;
            mid--;
        }
        return temp.data;
    }
    public static void main(String[] args) {
        middleElement obj = new middleElement();
        obj.insertAtTheEnd(10);
        obj.insertAtTheEnd(20);
        obj.insertAtTheEnd(90);
        obj.insertAtTheEnd(40);
        System.out.println(obj.middle(middleElement.head));
    }
}
