public class ArrayLinearSearch {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        int target=30;
        boolean found=false;

        for (int i=0; i< array.length; i++){
            if(array[i]==target){
                found=true;
                System.out.println("Element " + target+ " found at index " +i);
            break;
            }
        }
        if (!found){
            System.out.println("Element " + target+"not found");
        }
    }
}
