public class AverageValue {
    public static void main(String[] args) {
        int[]array={10,20,30,40,50};
        int Avg=0;
        int n=array.length;
        for (int i=0;i<n;i++){
            Avg+=array[i];
        }
        System.out.println(Avg/n);
    }
}
// Write a Java program to calculate the average value of array elements.