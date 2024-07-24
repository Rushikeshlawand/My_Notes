import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    public static void main(String[] args) {
        Queue<Integer> qe = new LinkedList<Integer>();

        qe.add(10);
        qe.add(20);
        qe.add(30);
        qe.add(40);
        qe.add(50);

        // push
        for (int i = 0; i < qe.size(); i++) {
            qe.add(qe.poll());
            System.out.print(qe.peek() + " ");
        }
        // pop
        System.out.println(qe.poll());

        //Top
        System.out.println(qe.peek());

        //Empty
        System.out.println(qe.isEmpty());
    }
}
