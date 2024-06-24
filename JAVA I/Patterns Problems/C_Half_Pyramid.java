public class C_Half_Pyramid {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) { // number of i star can only print on column. when number of i increases then                 // number of * print accordingly.
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}