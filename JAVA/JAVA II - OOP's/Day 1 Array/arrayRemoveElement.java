public class arrayRemoveElement {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int value = 5;
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != value) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
