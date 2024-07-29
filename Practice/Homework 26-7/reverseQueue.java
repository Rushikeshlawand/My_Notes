import java.util.LinkedList;
import java.util.Queue;

public class reverseQueue {
    
    public static void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }
        
        int front = queue.remove();
        reverseQueue(queue);
        queue.add(front);
    }
    
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(24);
        queue.add(9);
        queue.add(6);
        queue.add(8);
        queue.add(4);
        queue.add(1);
        queue.add(8);
        queue.add(3);
        queue.add(6);
        
        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
        
        Queue<Integer> queue2 = new LinkedList<>();
        queue2.add(8);
        queue2.add(7);
        queue2.add(2);
        queue2.add(5);
        queue2.add(1);
        
        System.out.println("Original Queue: " + queue2);
        reverseQueue(queue2);
        System.out.println("Reversed Queue: " + queue2);
    }
}
