class Solution {
    public int minMoves2(int[] nums) {
          Arrays.sort(nums);
        int steps = 0;
        int first = 0, last = nums.length-1;

        while(first < last ){
            steps+= (nums[last]-nums[first]);
            first++;
            last--;
        }
        return steps;
    }
}