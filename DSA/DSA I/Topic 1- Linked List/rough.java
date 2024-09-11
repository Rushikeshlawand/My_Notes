class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class rough {
    Node head;

    rough() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void printList(){
        Node current=head;
        while (current!=null) {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        rough obj=new rough();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.printList();
    }
}
