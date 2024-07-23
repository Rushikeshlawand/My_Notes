import java.util.Stack;
public class AddandPrint {
    public static void main(String[] args) {
        Stack<Integer> elements = new Stack<>();

        for (int i = 0; i <= 10; i++) {
            elements.push(i);
        }
        while (!elements.isEmpty()) {
            int value = elements.pop();
            if (value % 2 == 1) {
                System.out.print(value + " ");
            }
        }
    }
}