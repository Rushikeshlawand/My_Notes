import java.util.Arrays;

public class NextGreaterFrequencyElement {
    public static int[] nextGreaterFrequency(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        
        for (int i = 0; i < n; i++) {
            int currentFreq = getFrequency(arr, arr[i]);
            
            for (int j = i + 1; j < n; j++) {
                int nextFreq = getFrequency(arr, arr[j]);
                
                if (nextFreq > currentFreq) {
                    result[i] = arr[j];
                    break;
                }
            }
        }
        
        return result;
    }

    private static int getFrequency(int[] arr, int element) {
        int frequency = 0;
        for (int num : arr) {
            if (num == element) {
                frequency++;
            }
        }
        return frequency;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 2, 1};
        int[] result1 = nextGreaterFrequency(arr1);
        for (int num : result1) {
            System.out.print(num + " ");
        }
    }
}
