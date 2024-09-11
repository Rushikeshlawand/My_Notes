import java.util.Scanner;
import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();

        Stack<Character> obj = new Stack<Character>();

        for (int i = 0; i < Name.length(); i++) {
            obj.push(Name.charAt(i));
        }

        String reverseName = "";
        while (!obj.isEmpty()) {
            reverseName = reverseName + obj.pop();
        }
        System.out.println(reverseName);
    }
}
