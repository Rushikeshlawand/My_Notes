public class ReverseArray {
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
