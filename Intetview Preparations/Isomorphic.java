public class Isomorphic {
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "xxy";
        
        if (str1.length() == str2.length()) {
            System.out.println("The length of both string are same!");

            for (int i = 0; i < str1.length(); i++) {
                char str = str1.charAt(i);
            }

            for (int i = 0; i < str2.length(); i++) {
                char strr = str2.charAt(i);
            }

            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {

                    if (str(i)) {
                        System.out.println("true");
                        break;
                    }else{
                        System.out.println("False");
                        break;
                    }
                }
            }
        } else {
            System.out.println("length of input string is not same!");
        }
    }
}
