package HomeWork;

public class HWZeroAtTheEnd {
    public static void main(String[] args) {
        int[]runs={124,2,0,45,0,34,0,0,3,223};
        int n= runs.length;
        int j=0;
        for (int i=0;i<n;i++){
            if(runs[i]!=0){
                if (i!=j){
                    runs[j]=runs[i];
                    runs[i]=0;
                }
                j++;
            }
        }
        for (int k=0;k<n;k++){
        System.out.print(runs[k]+",");
        }
    }
}

//2. Given an array of random numbers, Push all the zeros of a given array to the
//end of the array. For example, if the given array is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it
//should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The order of all other elements
//should be the same. Expected time complexity is O(n) and extra space is O(1).
//Example:
//Input : arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
//Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
//Input : arr[] = {1, 2, 0, 0, 0, 3, 6};
//Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
