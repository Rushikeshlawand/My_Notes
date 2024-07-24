class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class palindrome {
    node head;

    palindrome() {
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

    node reverse(node head) {
        node prev = null;
        node current = head;
        node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        node slow = head;
        node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        node secondHalf = reverse(slow);
        node secondHalfCopy = secondHalf;

        node firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                reverse(secondHalfCopy);
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        reverse(secondHalfCopy);
        return true;
    }

    public static void main(String[] args) {
        palindrome obj = new palindrome();

        obj.insertAtTheEnd(11);
        obj.insertAtTheEnd(2);
        obj.insertAtTheEnd(3);
        obj.insertAtTheEnd(2);
        obj.insertAtTheEnd(1);

        System.out.println(obj.isPalindrome());
    }
}
