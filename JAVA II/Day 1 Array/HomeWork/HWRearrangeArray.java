package HomeWork;
public class HWRearrangeArray {
    public static void main(String[] args) {

                int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
                int n = arr.length;
                int[] newarr = new int[n];
                for (int i = 0; i < n; i++) {
                    newarr[i] = -1;
                }
                for (int i = 0; i < n; i++) {
                    if (arr[i] >= 0) {
                        int temp = arr[i];
                        newarr[temp] = arr[i];
                    }
                }
                for (int i=0;i<n;i++){
                    System.out.print(newarr[i]+" ");
                }
            }
        }
//. Given an array of elements of length N, ranging from 0 to N – 1. All elements
//may not be present in the array. If the element is not present then there will be -1
//present in the array. Rearrange the array such that A[i] = i and if i is not present,
//display -1 at that place.
//Examples:
//Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
//Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
//Input : arr = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
//11, 10, 9, 5, 13, 16, 2, 14, 17, 4}