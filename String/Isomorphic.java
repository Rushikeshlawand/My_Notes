package String;

public class Isomorphic {
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "xxy";
        
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                char str = str1.charAt(i);
            }

            for (int i = 0; i < str2.length(); i++) {
                char strr = str2.charAt(i);
            }

            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {

                    if (i==j) {
                        System.out.println("true");
                    }
                }
            }
        } else {
            System.out.println("String length of input is not same!");
        }
    }
}
