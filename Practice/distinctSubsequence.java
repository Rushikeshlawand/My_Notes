package Practice;
import java.util.ArrayList;

public class distinctSubsequence {

    static int distinctSubsequences(String str) {

        if (str.length() == 1)
            return 2;

        if (str.isEmpty())
            return 0;

        ArrayList<String> subString = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                StringBuilder sb = new StringBuilder();
                for (int k = i; k <= j; k++) {
                    sb.append(str.charAt(k));
                }
                subString.add(sb.toString());
            }
        }

        for (int i = 0; i < subString.size(); i++) {
            for (int j = i + 1; j < subString.size(); j++) {
                if (subString.get(i).equals(subString.get(j))) {
                    subString.remove(j);
                    j--; 
                }
            }
        }

        return subString.size() + 1;
    }

    public static void main(String[] args) {
        String str = "gfg";
        int result = distinctSubsequences(str);
        System.out.println("Number of distinct subsequences: " + result);
    }
}
