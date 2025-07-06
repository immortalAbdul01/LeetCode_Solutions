class Solution {
    public int maxJump(int[] stones) {
        
         int maxJump = 0;

        
        for (int i = 2; i < stones.length; i++) {
            maxJump = Math.max(maxJump, stones[i] - stones[i - 2]);
        }

       
        maxJump = Math.max(maxJump, stones[1] - stones[0]);

        return maxJump;

    }
}