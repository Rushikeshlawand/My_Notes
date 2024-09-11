package Module;

public class StringManipulator {

    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
    public String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }
    public String append(String original, String toAppend) {
        return original + toAppend;
    }
    public String append(String original, char toAppend) {
        return original + toAppend;
    }
    public String append(String original, int toAppend) {
        return original + toAppend;
    }

    public static void main(String[] args) {
        StringManipulator sm = new StringManipulator();
        String reversed = sm.reverse("hello");
        System.out.println("Reversed: " + reversed); 

        String capitalized = sm.capitalize("java");
        System.out.println("Capitalized: " + capitalized); 

        String appendedString = sm.append("Hello", " World");
        System.out.println("Appended String: " + appendedString); 

        String appendedChar = sm.append("Hello", '!');
        System.out.println("Appended Char: " + appendedChar); 

        String appendedInt = sm.append("Count: ", 123);
        System.out.println("Appended Int: " + appendedInt); 
    }
}
