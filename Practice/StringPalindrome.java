
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

public class StringPalindrome {

    int delToMkPalindrom(String str) {

        int count = 0, i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                if ((str.charAt(i) == str.charAt(j - 1)) || (str.charAt(j) == str.charAt(i + 1)))
                    count++;
                else
                    count += 2;

                if (str.charAt(i) == str.charAt(j - 1))
                    j--;
                else if (str.charAt(j) == str.charAt(i + 1))
                    i++;
                else {
                    i++;
                    j--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        StringPalindrome pq = new StringPalindrome();
        String str = "aebcbda";
        System.out.println("Minimum deletions to make palindrome: " + pq.delToMkPalindrom(str));
    }
}
