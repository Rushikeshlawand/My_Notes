import java.util.Stack;

public class GRE {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 15, 2, 67 };
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] > st.peek()) {
                st.pop();
            }

            if (!st.isEmpty()) {
                System.out.println(arr[i] + " " + st.peek());
            } else
                System.out.println(arr[i] + " " + (-1));
        }
        st.push(arr[i]);
    }
}
