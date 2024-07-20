package LeetCode;
public class stringMatchingInArray {
    public static void main(String[] args) {
        String[] words = { "mass", "as", "hero", "superhero" };
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                System.out.print(ch + " ");
            }
        }
    }
}