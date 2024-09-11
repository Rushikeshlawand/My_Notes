public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] lastIndex = new int[256];
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1;
        }
        int left = 0;
        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);

            if (lastIndex[currentChar] != -1) {
                left = Math.max(left, lastIndex[currentChar] + 1);
            }
            lastIndex[currentChar] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("The length  is: " + lengthOfLongestSubstring(s));
    }
}