public class Array {
    public static void main(String[] args) {
        int[] staticArray={1,2,3,4,5};
        int[] dynamicArray=new int[5];
        
        for(int i=0; i<dynamicArray.length; i++){
            dynamicArray[i]=i+1;
        }
    }
}