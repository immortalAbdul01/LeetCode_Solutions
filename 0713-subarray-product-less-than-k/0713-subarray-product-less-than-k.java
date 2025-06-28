class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
          if (k <= 1) return 0;

        int product = 1, result = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            product *= nums[end];

            while (product >= k) {
                product /= nums[start];
                start++;
            }

            result += (end - start + 1);
        }

        return result;
    }
}