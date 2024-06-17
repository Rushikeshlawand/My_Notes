public class Inverted_Half_Pyramid {
    public static void main(String[] args){
    int n=4;

    for (int i=n; i>=1; i--){ //Row: 1st number of n * print. it decreases till number of i=1
        for( int j=1; j<=i; j++){ //Column: it starts from 1 and end to number of i=
            System.out.print(" * ");
        }
        System.out.println();
    }
    
    }
}
