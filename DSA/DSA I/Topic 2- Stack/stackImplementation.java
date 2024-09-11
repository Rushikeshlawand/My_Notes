import java.util.Stack;

public class stackImplementation {
    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        System.out.println(obj.pop());
        System.out.println(obj.peek());
        System.out.println(obj.empty());
        System.out.println(obj.size());
        while (!obj.empty()) {
            System.out.print(obj.peek() + " ");
            obj.pop();
        }
    }
}
