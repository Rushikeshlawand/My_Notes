import java.util.Stack;

public class LongestValidParentheses {
    public static int findMaxLen(String str) {

        Stack<Integer> stack = new Stack<>();

        int maxLength = 0;

        stack.push(-1);

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(') {
                stack.push(i);
            } else {

                stack.pop();

                if (stack.isEmpty()) {

                    stack.push(i);
                } else {

                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String str1 = "((()";
        System.out.println("Length of the longest valid substring: " + findMaxLen(str1)); // Output: 2

        String str2 = ")()())";
        System.out.println("Length of the longest valid substring: " + findMaxLen(str2)); // Output: 4

        String str3 = "()(()))))";
        System.out.println("Length of the longest valid substring: " + findMaxLen(str3)); // Output: 6
    }
}
