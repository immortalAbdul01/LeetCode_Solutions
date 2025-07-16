class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
         int n = triangle.size();
        int[] dp = new int[n];

      
        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(n - 1).get(i);
        }

        for (int level = n - 2; level >= 0; level--) {
            for (int i = 0; i <= level; i++) {
                dp[i] = triangle.get(level).get(i) + Math.min(dp[i], dp[i + 1]);
            }
        }

        return dp[0]; 

    }
}