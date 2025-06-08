class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
Map<Integer, Integer> modMap = new HashMap<>();
        modMap.put(0, -1); 
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int mod = k != 0 ? sum % k : sum; 
            if (modMap.containsKey(mod)) {
                if (i - modMap.get(mod) >= 2) {
                    return true;
                }
            } else {
                modMap.put(mod, i);
            }
        }
        
        return false;
    }
}