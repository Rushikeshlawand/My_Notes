public class rough {

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int buy = prices[0], sell = prices[0];
        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < buy) {
                buy = prices[i];
            }
            if (prices[i] > sell) {
                sell = prices[i];
            }

        }

        System.out.println(sell);
        System.out.println(buy);

    }
}