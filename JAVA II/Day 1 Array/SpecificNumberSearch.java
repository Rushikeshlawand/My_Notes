import java.util.Scanner;

public class SpecificNumberSearch {
    public static void main(String[] args) {

                int[]array={1243,1434,34,5523,3234,12,88};
                int n= array.length;
                Scanner sc=new Scanner(System.in);

                System.out.println("Enter the number you want to search: ");
                int SpecificNum=sc.nextInt();
                boolean flag=false;
                for (int i=0;i<n;i++){
                    if (array[i]==SpecificNum){
                        flag=true;
                    }
                }
                if (flag){
                    System.out.println("Your number "+ SpecificNum + " is available in the array!");
                }else{
                    System.out.println("Your number "+ SpecificNum + " is not available in the array");
                }
    }
}
