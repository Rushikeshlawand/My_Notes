public class reverseString {
    public static void main(String[] args) {
        String revv = "hiii";
        String rev = "";
        for (int i = revv.length() - 1; i >= 0; i--) {
            rev += revv.charAt(i);
        }
        System.out.println("Reversed string: " + rev);
       
    }
}
