public class Solution {
    void frq(int[] nums) {
        int num=0;

        for(int  i=0;i<nums.length-1;i++){
            for(int j=i+1;i<nums.length;j++){
                if (nums[i]==nums[i]) {
                    num=nums[i];
                  }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        Solution obj=new  Solution();
        obj.frq(nums);
        System.out.println(obj.frq(num));
    }
}
