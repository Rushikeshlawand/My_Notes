public class IsomorphicEx {

    public static boolean isIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int initialDifference = str2.charAt(0) - str1.charAt(0);

        for (int i = 1; i < str1.length(); i++) {
            int currentDifference = str2.charAt(i) - str1.charAt(i);
            if (currentDifference != initialDifference) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("aab", "xxy"));
        System.out.println(isIsomorphic("aab", "xyz"));
    }
}

// Input: str1 = “aab”, str2 = “xxy”
// Output: True
// Explanation: ‘a’ is mapped to ‘x’ and ‘b’ is mapped to ‘y’.