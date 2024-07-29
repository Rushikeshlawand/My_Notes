// Two strings str1 and str2 are called isomorphic if there is a one-to-one mapping
// possible for every character of str1 to every character of str2. And all
// occurrences of every character in ‘str1’ map to the same character in ‘str2’.
// Examples:
// Input: str1 = “aab”, str2 = “xxy”
// Output: True
// Explanation: ‘a’ is mapped to ‘x’ and ‘b’ is mapped to ‘y’.
// Input: str1 = “aab”, str2 = “xyz”
// Output: False
// Explanation: One occurrence of ‘a’ in str1 has ‘x’ in str2 and other occurrence of ‘a’ has
// ‘y’.


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