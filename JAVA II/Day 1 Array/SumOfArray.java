public class SumOfArray {

    public static void main(String[] args){

        int[] number={10,20,30,40};
        int Mul=1;
        for(  int numbe: number){
            Mul*=numbe;
        }
        System.out.println("Sum is:" +Mul);
    }
}