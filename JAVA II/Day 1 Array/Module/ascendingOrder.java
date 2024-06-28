package Module;
public class ascendingOrder {
    public static void Order(int[]array){
        int n= array.length;
        for (int i=0;i<n-1;i++)
        {
            for (int j=0;j<n-i-1;j++)
            {
                if (array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]array={4,2,445,6,7,3};
       Order(array);
    }
}

//Initialize the Array:
//    Start with an array of integers that you want to sort.
//Iterate Through the Array:
//    Use nested loops to compare adjacent elements and swap them if they are in the wrong order.
//Swap Elements:
//    If the current element is greater than the next element, swap them.
//Repeat Until Sorted:
//    Continue this process (outer loop) until no more swaps are needed in a pass (inner loop), indicating that the array is sorted.
//Output the Sorted Array:
//    Once sorted, print or return the array with elements in ascending order.