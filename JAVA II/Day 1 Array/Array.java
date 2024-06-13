public class Array {

       public static void main(String[] args) {
              int[] numbers = { 10, 20, 30, 40, 50 };
              for (int number : numbers) {
                     System.out.println(number);
              }
              String[] Names = { "Rishi", "Sandeep", "Ash" }; // modify the array element
              Names[1] = "DJ";
              for (String Name : Names) {
                     System.out.println(Name);
              }
       }
}