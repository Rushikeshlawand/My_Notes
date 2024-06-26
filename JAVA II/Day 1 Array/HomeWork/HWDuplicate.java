package HomeWork;

public class HWDuplicate {
    public static void main(String[] args) {
        int[]array={2,3,3,3,3,3,4,5,6,44,4,4};
        int n= array.length;
        for (int i=0;i<n;i++){
        boolean flag=true;

        for (int j=0;j<i;j++){
            if(array[i]==array[j]){
                flag=false;
                break;
            }
        }
        if (flag){
            System.out.print(array[i]+ " ");
        }
    }
        System.out.println();
    }
}
//4. Given an integer array, print all distinct elements in an array. The given array
//may contain duplicates and the output should print every element only once. The
//given array is not sorted.
//Examples:
//Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
//Output: 12, 10, 9, 45, 2
//Input: arr[] = {1, 2, 3, 4, 5}
//Output: 1, 2, 3, 4, 5