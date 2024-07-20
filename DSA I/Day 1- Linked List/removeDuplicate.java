class node {
    int data;
    node next;

    public node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class removeDuplicate {
    node head;

    public removeDuplicate() {
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

    void duplicate(int data){
            return;
        }
    
    void printData() {
        node last = head;
        while (last != null) {
            System.out.print(last.data+" ");
            last = last.next;
        }
    }

    public static void main(String[] args) {
        removeDuplicate obj=new removeDuplicate();
        obj.insertAtTheEnd(12);
        obj.insertAtTheEnd(12);
        obj.insertAtTheEnd(14);
        obj.insertAtTheEnd(15);
        obj.printData();
    }
}
