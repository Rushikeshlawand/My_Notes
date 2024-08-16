package BST;

import java.math.BigInteger;

public class rough {

    static BigInteger fact(BigInteger num) {
        if (num.equals(BigInteger.ZERO)) {
            return BigInteger.ONE; 
        }
        return num.multiply(fact(num.subtract(BigInteger.ONE))); 
    }
    public static void main(String[] args) {
        rough obj = new rough();
        BigInteger number = new BigInteger("50");
        System.out.println(fact(number)); 
    }
}
