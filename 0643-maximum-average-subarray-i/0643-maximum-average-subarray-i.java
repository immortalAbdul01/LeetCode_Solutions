class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
     

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;

        for (int end = k; end < nums.length; end++) {
            windowSum += nums[end] - nums[end - k];
            maxSum = Math.max(windowSum, maxSum);
           
        }
        return (double) maxSum/k;
    }
}