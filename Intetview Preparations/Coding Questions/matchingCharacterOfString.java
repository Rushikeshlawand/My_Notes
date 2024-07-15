//Write a program to count the number of matching character in the pair of the string1 “abcd” and string2 “abad”. output is 3 . Also tell time complexity of the whole solution

public class matchingCharacterOfString {
    public static void main(String[] args) {
        String S1 = "Rushi";
        String S2 = "rushi";

        char[] S1Array = S1.toCharArray();
        char[] S2Array = S2.toCharArray();
        int count = 1;

        for (int i = 0; i < S1Array.length; i++) {
            for (int j = 0; j < S2Array.length; j++) {
                    if (S1Array[i]==S2Array[j]) {
                        
                    }
            }
        }
    }
}