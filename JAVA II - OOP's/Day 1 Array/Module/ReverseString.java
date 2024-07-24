package Module;
public class ReverseString {
    public static void main(String[] args) {

        String name = "Rushikesh", Reversed = "";
        char ch;
        for (int i = 0; i < name.length(); i++) {
            ch = name.charAt(i);
            Reversed = ch + Reversed;
        }
        System.out.println(Reversed);
    }
}