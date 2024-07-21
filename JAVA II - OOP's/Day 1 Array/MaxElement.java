public class MaxElement {
    public static void main(String[] args){

        int[] numbers={99,914,46,71,55,87};
        int max=numbers[0];

        for(int number:numbers){
            if(number>max){
                max=number;
            }
        }
System.out.println("Maximum: " +max);
    }
}
