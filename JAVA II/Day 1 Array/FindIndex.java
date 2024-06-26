import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[]array={12,23,44,5,5,66,99};
        int n= array.length;
        System.out.println("Enter the number to find index: ");
        int UserNumber=sc.nextInt();

        for (int i=0;i<n;i++){
        if (array[i]==UserNumber){
            System.out.println(i);
        }
        }
    }
}
