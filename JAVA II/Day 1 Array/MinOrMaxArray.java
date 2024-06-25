import java.util.*;
class MinOrMaxArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[]arr=new int[a];
        for (int i=0;i<a;i++){
            int number=sc.nextInt();
            arr[i]=number;
        }
        //int a[]={1,423,6111,46,34,23,13,53,4};

        //Implemented inbuilt function to sort array
        Arrays.sort(arr);

        // after sorting the value at 0th position will minimum and
        //nth position will be maximum
        System.out.println("min: "+arr[0]+" max: "+arr[arr.length-1]);
    }
}
