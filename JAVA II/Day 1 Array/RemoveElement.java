import java.util.Scanner;
public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]array={12,24,35,356,6,7};
        int n= array.length;
        System.out.println("Enter the number to remove: ");
        int UserNumber= sc.nextInt();
//int fin=0;
        for (int i=0;i<n;i++){
            if (array[i]==UserNumber){
            //array[i]=array[i+1];
            array[i]= array.length-1;
            }
            System.out.print(array[i]+" ");
        }

    }
}