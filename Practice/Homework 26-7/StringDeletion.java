// 1. Minimum number of deletions to make a string palindrome
// Given a string of size ‘n’. The task is to remove or delete the minimum
// number of characters from the string so that the resultant string is a
// palindrome.
// Note: The order of characters should be maintained.
// Examples :
// Input : aebcbda
// Output : 2
// Remove characters 'e' and 'd'
// Resultant string will be 'abcba'
// which is a palindromic string



public class StringDeletion {

    static int md(String s) {
        return mdHelper(s, 0, s.length() - 1);
    }

    static int mdHelper(String s, int left, int right) {
        if (left >= right) {
            return 0;
        }
        if (s.charAt(left) == s.charAt(right)) {
            
                return mdHelper(s, left + 1, right - 1);
            }
            int deleteLeft = mdHelper(s, left + 1, right);
            int deleteRight = mdHelper(s, deleteLeft, right - 1);
        
        return 1 + Math.min(deleteLeft, deleteRight);
    }

    public static void main(String[] args) {
        String s = "aebcbda";
        System.out.println(md(s));
    }
}
