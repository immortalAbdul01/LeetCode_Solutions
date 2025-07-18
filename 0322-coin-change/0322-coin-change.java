class Solution {
    public int coinChange(int[] coins, int amount) {
         int[] dp = new int[amount + 1];

        Arrays.fill(dp, amount + 1);
        dp[0] = 0; 
        for (int target = 1; target <= amount; target++) {
            for (int coin : coins) {
                if (target - coin >= 0) {
                    dp[target] = Math.min(dp[target], 1 + dp[target - coin]);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];

    }
}