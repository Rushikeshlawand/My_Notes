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

//    Create a new array with a length greater than the original array by one.
//    Copy elements from the original array to the new array up to the specified index.
//    Insert the new element at the specified index in the new array.
//    Copy the remaining elements from the original array to the new array starting from the specified index.
//
//In more detail:
//
//    Initialize a new array with size originalArray.length + 1.
//    Copy elements from the original array to the new array from the start up to (but not including) the specified index.
//    Assign the new element to the specified index in the new array.
//    Copy the remaining elements from the original array to the new array, starting from the specified index in the original array to the next index in the new array.
//    The new array now contains all elements of the original array with the new element inserted at the specified index.