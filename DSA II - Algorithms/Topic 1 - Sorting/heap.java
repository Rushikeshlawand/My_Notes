import java.util.Collections;
import java.util.PriorityQueue;

public class heap {
    public static void main(String[] args) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(15);
        maxHeap.add(10);
        maxHeap.add(20);

        System.out.println("Max-Heap elements:");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}