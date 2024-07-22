import java.util.Stack;

public class reverseIndividualWords {
    public static void main(String[] args) {
        String str = "How are u?";
        Stack<Character> st = new Stack<>();
        String rev = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                st.push(str.charAt(i));
            } else {
                while (!st.isEmpty()) {
                    rev += st.pop();
                }
            }
            rev =rev+ ' ';
        }
        while (!st.isEmpty()) {
            rev =rev+ st.pop();
        }
        System.out.println(rev.trim());
    }
}
