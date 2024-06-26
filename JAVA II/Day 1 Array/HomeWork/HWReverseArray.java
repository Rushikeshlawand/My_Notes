package HomeWork;

public class HWReverseArray {
    public static void main(String[] args) {
        int[]array={1123,212,3123,12,435,46,56,57,235,23};
        int n= array.length;
        int temp;
        for (int i=0;i<n/2;i++){
            temp=array[i];
            array[i]=array[n-i-1];
            array[n-i-1]=temp;
        }
        System.out.print("Reversed array is: ");
        for (int k=0;k<n;k++){
            System.out.print(array[k]+",");
        }
    }
}

//1.Array reverse or reverse a array means changing the position of each number
//of the given array to its opposite position from end, i.e. if a number is at position
//1 then its new position will be Array.length, similarly if a number is at position 2
//then its new position will be Array.length – 1, and so on.
//Input: original_array[] = {1, 2, 3} Output: array_reversed[] = {3, 2, 1}
//Input: original_array[] = {4, 5, 1, 2}
//Output: array_reversed[] = {2, 1, 5, 4}