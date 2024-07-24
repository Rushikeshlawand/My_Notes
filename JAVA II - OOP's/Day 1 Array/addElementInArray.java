import java.util.Arrays;

public class addElementInArray {
    public static void main(String[] args) {
        int[]array={124,24,3,5,67,6,433,35,6,788};
        int[]newArray=new int[array.length+1];
        int value=0;
       // int index=1;
        for(int i=0;i<array.length;i++){
            newArray[i]=array[i];
        }
        newArray[array.length]=value;
        System.out.println(Arrays.toString(newArray));
    }
}