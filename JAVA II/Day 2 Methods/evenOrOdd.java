public class evenOrOdd {
    static boolean isEven(int number){
        if (number%2==0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        boolean result=isEven(5);
        System.out.println(result);
    }
}