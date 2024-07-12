import java.util.Arrays;
public class duplicateArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 4, 5, 5, 5, 6, 7, 0 };
        int n = array.length;
        System.out.println("Element : Count");

        int[] tempArray = new int[n];
        int newArrayIndex = 0;
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && array[i] == array[i + 1]) {
                count++;
                i++;
            }
            if (count > 1) {
                System.out.println(array[i] + " : " + count);
            }
            tempArray[newArrayIndex++] = array[i];
        }
        int[] uniqueArray = Arrays.copyOf(tempArray, newArrayIndex);
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }
}

// Element : Count
// 4 : 2
// 5 : 3
// Array without duplicates: 1 2 3 4 5 6 7 0