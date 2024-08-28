import java.util.*;

public class dumb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int first=0,second=1;
        System.out.print(first+" "+second);

        for (int i =3;i<=num; i++) {
            int next=first+second;
            System.out.print(", "+next);
            first=second;
            second=next;
        }
    }
}