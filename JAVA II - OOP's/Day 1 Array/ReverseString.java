public class ReverseString {
    public static void main(String str[]) {
        String name = "RushikeshLawand";
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);
        }
        System.out.println("Reversed string: " + rev);
    }
}