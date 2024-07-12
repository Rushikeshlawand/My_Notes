public class reverseString {
    public static void main(String[] args) {
        String s = "Rushikesh lawand";
        System.out.println("Before Reverse String: " + s);
        // Method 1: Using a new string to reverse
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            newS = ch + newS;
        }
        System.out.println("After Reverse String (Method 1): " + newS);
        // Method 2: Reversing in place without using a third variable
        char[] array = s.toCharArray();
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            // Swap characters without using a third variable
            array[left] = (char) (array[left] + array[right]);
            array[right] = (char) (array[left] - array[right]);
            array[left] = (char) (array[left] - array[right]);
            left++;
            right--;
        }
        String reversedString = new String(array);
        System.out.println("After Reverse String (Method 2): " + reversedString);
    }
}

//Before Reverse String: Rushikesh lawand
//After Reverse String (Method 1): dnawal hsekihsuR
//After Reverse String (Method 2): dnawal hsekihsuR