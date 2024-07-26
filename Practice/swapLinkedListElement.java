package Practice;
public class swapLinkedListElement {

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

    public void swapLinkedList() {
        if (head == null || head.next == null) {
            return;
        }

        Node newHead = head.next;
        Node prev = null;
        Node curr = head;

        while (curr != null && curr.next != null) {
            Node nextPair = curr.next.next;
            Node second = curr.next;
            second.next = curr;
            curr.next = nextPair;

            if (prev != null) {
                prev.next = second;
            }

            prev = curr;
            curr = nextPair;
        }

        head = newHead;
    }



    void print() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
//        Input : 1->2->3->4->5->6->NULL
//        Output : 2->1->4->3->6->5->NULL

        swapLinkedListElement list = new swapLinkedListElement();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.print();
        System.out.println("After Swap : ");

        list.swapLinkedList();
        list.print();

    }

}
