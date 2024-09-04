
public class CoinChange {
    public static int countWays(int sum, int[] coins) {
        int[] dp = new int[sum + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int i = coin; i <= sum; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[sum];
    }

    public static void main(String[] args) {
        int sum1 = 4;
        int[] coins1 = {1, 2, 3};
        System.out.println(countWays(sum1,coins1)); 

        int sum2 = 10;
        int[] coins2 = {2, 5, 3, 6};
        System.out.println(countWays(sum2, coins2)); 
    }
}
