import java.util.Arrays;

public class IteratingArray {
    public static void main(String[] args) {
        int []Array={1,3,4,5,66,7,6564};
        int[]newArray={10};
        System.out.println("Org array: "+ Arrays.toString(Array));
        for (int i=0;i< Array.length;i++){
        newArray[i]=Array[i];
        }
        System.out.println("New Array is: "+Arrays.toString(newArray));
}
}