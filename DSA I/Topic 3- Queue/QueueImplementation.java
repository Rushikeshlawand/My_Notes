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

        qe.remove();
        System.out.println("1st element is "+qe.peek());
        System.out.println("size is "+qe.size());
        System.out.println(qe.poll()); // return & remove the 1st element.
        System.out.println(qe.peek());
    }
}
