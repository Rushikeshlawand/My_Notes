public class PyradmidStar {
    public static void main(String[] args) {
        int m=7;
        for (int i=1;i<=m;i++){
            for (int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
