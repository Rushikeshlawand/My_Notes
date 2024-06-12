public class Nested_if_else {
    public static void main(String args[]){
        int a=1;
        int b=2;
        int c=3;
        if(a>b){
            if(a>c){
                System.out.println("A is greater than b & c");
            }
            else{
                System.out.println("A is smaller than b & c");
            }
        }
        else{
            if(b>c){
                System.out.println("B is greater than c");
            } else{
                System.out.println("C is largest");
            }
        }

    }
    
}
