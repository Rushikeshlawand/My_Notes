import java.util.Stack;

public class NextGretestNum {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        Stack<Integer> result = new Stack<>();

        stk.push(2);
        stk.push(1);
        stk.push(6);
        stk.push(7);

        while (!stk.isEmpty()) {
            int num = stk.pop();
            while (!result.isEmpty() && result.peek() < num) {
                result.pop();
            }
            if (result.isEmpty()) {
                System.out.println(num + " -> " + -1);
            } else {
                System.out.println(num + " -> " + result.peek());
            }
            result.push(num);
        }
    }
}