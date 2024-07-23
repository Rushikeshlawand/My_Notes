import java.util.Stack;

public class sortTheStack {
    public static void main(String[] args) {
        Stack<Integer> orgStack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();
        orgStack.push(2);
        orgStack.push(4);
        orgStack.push(1);
        orgStack.push(9);
        orgStack.push(10);
        orgStack.push(2);
        orgStack.push(3);

        while (!orgStack.isEmpty()) {
            int current = orgStack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                orgStack.push(tempStack.pop());
            }
            tempStack.push(current);
        }
        while (!tempStack.empty()) {
            System.out.print(tempStack.pop() + " ");
        }
    }
}