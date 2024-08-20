import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
              System.out.println(flag);
                break;
            }else{
            System.out.println(flag=false);
            }
        }
    }
}
