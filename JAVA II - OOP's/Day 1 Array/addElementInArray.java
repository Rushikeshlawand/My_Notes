import java.util.Arrays;
public class addElementInArray {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6};
        int index=2;
        int addEle=98;
        for (int i= array.length;i< index;i++) {
            array[i] = array[i - 1];
        }
        array[index]=addEle;
        System.out.println(Arrays.toString(array));
    }
}