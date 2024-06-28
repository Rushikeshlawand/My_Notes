public class MethodForSwap {
    static void swapTwoNum(int firstNum,int secondNum){
        firstNum=firstNum+secondNum;
        secondNum=firstNum-secondNum;
        firstNum=firstNum-secondNum;
        System.out.println("First Num is:  "+firstNum+","+" Second num is: "+secondNum);
    }
    public static void main(String[] args) {
       swapTwoNum(2,3);
    }
}
