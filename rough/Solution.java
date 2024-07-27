package rough;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {

    public static int strstr(int[] nums, int target) {
        int n = nums.length;
        int[] array = new int[n + 1];
        int i;
        for (i = 0; i < n + 1; i++) {
            array[i] = nums[i];

        }
        array[n] = target;
        Arrays.sort(array);
        for (i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        int index = solution.strstr(nums, target);
        System.out.println("Index of target " + target + " is: " + index);
    }
}
