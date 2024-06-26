import java.util.Scanner;
public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]array={12,24,35,356,6,7};
        int n= array.length;
        System.out.println("Enter the number to remove: ");
        int UserNumber= sc.nextInt();
        for (int i=UserNumber;i<n-1;i++){
           array[i]= array[i+1];
        }
        System.out.print(array+" ");
            }
    }