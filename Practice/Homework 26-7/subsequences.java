public class subsequences {
    public static String[] findSubSequence(String str) {
        if (str.length() == 0) {
            String ans[] = { "" };
            return ans;
        }
        String smallAns[] = findSubSequence(str.substring(1));
        String ans[] = new String[2 * smallAns.length];
        int k = 0;
        for (int i = 0; i < smallAns.length; i++) {
            ans[k] = smallAns[i];
            k++;
        }

        for (int i = 0; i < smallAns.length; i++) {
            ans[k] = str.charAt(0) + smallAns[i];
            k++;
        }
        return ans;
    }

    static int longestPalindrom(String str[]) {
        String ans[] = new String[str.length];

        int k = 0;

        for (int j = 0; j < str.length; j++) {
            boolean flag = true;
            int len = str[j].length();
            for (int i = 0; i < str[j].length() / 2; i++) {
                if (str[j].charAt(i) != str[j].charAt(len - i - 1)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans[k] = str[j];
                k++;

            }
        }

        int max = ans[0].length();
        for (int i = 0; i < k; i++) {
            if (ans[i].length() > max) {
                max = ans[i].length();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String ans[] = findSubSequence(str);
        int t = longestPalindrom(ans);

        System.out.println(str.length() - t);

    }
}