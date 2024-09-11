import java.util.Arrays;

public class arrayAddElementEnd {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] newArray = new int[array.length + 1];
        int value = 0;
        // int index=7;
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = value;
        System.out.println(Arrays.toString(newArray));
    }
}