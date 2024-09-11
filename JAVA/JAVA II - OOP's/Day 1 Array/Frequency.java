import java.util.Scanner;

class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {1, 2, 3,3, 4,5,5,5};

        System.out.println("Enter the number to find the frequency of:");
        int number = sc.nextInt();

        int frequency = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                frequency++;
            }
        }

        System.out.println("The frequency of " + number + " is: " + frequency);

    }
}
