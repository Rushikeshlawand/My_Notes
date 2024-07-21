public class InvertedPyramidStar {
    public static void main(String[] args) {

        for (int l=1;l<=7;l++){
            for (int j=1;j<=l;j++){
                System.out.print(" ");
            }
            for (int k=7;k>(l*2);k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
