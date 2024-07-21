    // class node {
    //     int data;
    //     node next;

    //     public node(int data) {
    //         this.data = data;
    //         this.next = null;
    //     }
    // }

    // public class removeDuplicate {
    //     node head;

    //     public removeDuplicate() {
    //         this.head = null;
    //     }

    //     public void insertAtTheEnd(int data) {
    //         node newNode = new node(data);
    //         if (head == null) {
    //             head = newNode;
    //             return;
    //         }
    //         node last = head;
    //         while (last.next != null) {
    //             last = last.next;
    //         }
    //         last.next = newNode;
    //     }

    //     int duplicate(int data) {
    //         if (head == null) {
    //             return 0;
    //         }
    //         node temp = head;
    //         node temp2 = head.next;
    //         int last = head.val;
    //         while (temp2 != null) { // while end of Linked list
    //             if (temp2.val == last) { // Current number same to last number
    //                 if (temp2.next == null) { // If last element, just delete and break loop
    //                     temp.next = null;
    //                     break;
    //                 }
    //                 temp2 = temp2.next; // Not last, then delete that element
    //                 temp.next = temp2; // and move to next element
    //             } else { // If not the same as last element, jump to next node
    //                 temp = temp2;
    //                 last = temp.val;
    //                 temp2 = temp2.next;
    //             }
    //         }
    //         return head; // return the head back
    //     }

    //     void printData() {
    //         node last = head;
    //         while (last != null) {
    //             System.out.print(last.data + " ");
    //             last = last.next;
    //         }
    //     }

    //     public static void main(String[] args) {
    //         removeDuplicate obj = new removeDuplicate();
    //         obj.insertAtTheEnd(12);
    //         obj.insertAtTheEnd(12);
    //         obj.insertAtTheEnd(14);
    //         obj.insertAtTheEnd(15);
    //         obj.printData();
    //     }
    // }
