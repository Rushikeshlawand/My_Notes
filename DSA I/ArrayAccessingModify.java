public class ArrayAccessingModify {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};

        //Accessing element
        int FirstElement=array[0];
        int ThirdElement=array[2];

        array[1]=99; //modify this num in array

        for(int i=0; i< array.length; i++){
            System.out.println("Element at index " +i+ ":" + array[i]);
        }
    }
}