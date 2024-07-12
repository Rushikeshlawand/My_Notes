import java.util.Arrays;

public class sameStringOrNot {
    public static void main(String[] args) {
        String S1 = "Rushi";
        String S2 = "Rushi";

        char[] array1 = S1.toCharArray();
        char[] array2 = S2.toCharArray();

        for (int i = 0; i < S1.length(); i++) {
            array1[i] = S1.charAt(i);
        }
        System.out.println(Arrays.toString(array1));

        for (int i = 0; i < S2.length(); i++) {
            array2[i] = S2.charAt(i);
        }
        System.out.println(Arrays.toString(array2));

        if (S1.equals(S2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
