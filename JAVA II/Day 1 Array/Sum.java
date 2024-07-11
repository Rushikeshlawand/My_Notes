public class Sum {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,55};
        int sum=0;
        int product=1;
        for (int i=0;i< array.length;i++){
            sum+=array[i];
            product*=array[i];
        }
        System.out.println("Sum is: "+ sum);
        System.out.println("Product is: "+ product);
    }
}