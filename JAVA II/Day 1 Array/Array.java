public class Array {

       public static void main(String[] args) {
              int[] numbers = { 10, 20, 30, 40, 50 };
              int num1 = numbers.length;


              System.out.println("Original array:");
              for (int number : numbers) {
                     System.out.println(number);
              }

              for (int i = 1; i < num1 - 1; i++) {
                     numbers[i] = numbers[i + 1];
              }

              numbers[num1 - 1] = 0;


              System.out.println("Modified array:");
              for (int number : numbers) {
                     System.out.println(number);
              }
       }
}
