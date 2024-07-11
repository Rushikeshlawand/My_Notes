public class gretestCommomDivisior {
    public static int div(int n, int i) {
        if (i > n) {
            return 0;
        }
        if (n % i == 0) {
            return 1 + div(n, i + 1);
        } else {
            return div(n, i + 1);
        }
    }
    public static int[] findMaxDiv(int current, int end, int maxDivisor, int numwithmaxDivisor) {
        if (current > end) {
            return new int[] { numwithmaxDivisor, maxDivisor };
        }
        int divisorsCount = div(current, 1);
        if (divisorsCount > maxDivisor) {
            maxDivisor = divisorsCount;
            numwithmaxDivisor = current;
        }
        return findMaxDiv(current + 1, end, maxDivisor, numwithmaxDivisor);
    }
    public static void main(String[] args) {
        int startRange = 1;
        int endRange = 1000;
        int[] result = findMaxDiv(startRange, endRange, 0, 0);
        System.out.println("The number with the greatest number of divisors between " + startRange + " and " + endRange
                + " is " + result[0] + " with " + result[1] + " divisors.");
    }
}
