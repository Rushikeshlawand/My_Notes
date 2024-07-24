import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<Integer> qe = new LinkedList<>();
        qe.add(10);
        qe.add(20);
        qe.add(30);
        qe.add(40);
        qe.add(50);

        System.out.println(qe.peek());
    }
}
