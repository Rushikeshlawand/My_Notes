public class reverseString {
    public static String reverse(String s) {
        if (s.length() <= 1) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        String inputString = "Rushikesh";
        String reversedString = reverse(inputString);
        System.out.println(reversedString);
    }
}