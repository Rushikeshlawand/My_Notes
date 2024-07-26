
public class rotateLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    void add(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }


    void rotate(int k){

        if(head == null || head.next == null){
            return;
        }

        while (k !=  0) {

            Node currNode = head;
            Node shift = currNode.next;

            while (currNode.next != null) {
                currNode = currNode.next;
            }

            currNode.next = head;
            head.next = null;
            head = shift;

            k--;
        }


    }
    void print() {
        Node currNode = head;

        while (currNode!= null){
            System.out.print(currNode.data + " ") ;
            currNode = currNode.next;
        }
    }




    public static void main(String[] args) {

//        10->20->30->40->50->60 k = 4 50->60->10->20->30->40.

        rotateLinkedList list = new rotateLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        list.print();
        System.out.println(" ");
        list.rotate(4);
        list.print();
    }

}
