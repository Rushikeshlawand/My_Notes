import java.util.Scanner;

public class searchelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int[]narray=new int[n];

        for (int i=0;i<n;i++){
            int number=sc.nextInt();
            narray[i]=number;
        }
       for (int i=0;i<n;i++){
           System.out.println(narray[i]);
       }
        System.out.println("which element you want to search?");
       int input=sc.nextInt();

        boolean found=false;
        for (int i=0;i<n;i++) {
            if (narray[i] == input) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
