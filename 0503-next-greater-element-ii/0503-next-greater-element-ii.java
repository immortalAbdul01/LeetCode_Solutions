class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        
        Deque<Integer> stack = new ArrayDeque<>();

       
        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];
        
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                int index = stack.pop();
                res[index] = num;
            }

          
            if (i < n) {
                stack.push(i);
            }
        }
        
        return res;
    }
}