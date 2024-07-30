// Given a string ‘S’ (composed of digits) and an integer ‘X”, the task is to count all the sub-strings of ‘S’ that satisfy the following conditions:  
// The sub-string must not begin with the digit ‘0’.
// And the numeric number it represents must be greater than ‘X’.
// Note: Two ways of selecting a sub-string are different if they begin or end at different indices.

// Input: S = "471", X = 47
// Output: 2
// Only the sub-strings "471" and "71" 
// satisfy the given conditions.

// Input: S = "2222", X = 97
// Output: 3
// Valid strings are "222", "222" and "2222".

public class SubStringCount {

    public static void subString(String S, int x) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {

            for (int j = i + 1; j < S.length(); j++) {
                String substring = S.substring(i, j+1);

                int num = Integer.parseInt(substring);

                if (num > x) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String S = "2222";
        int x = 97;
        subString(S, x);
    }
}