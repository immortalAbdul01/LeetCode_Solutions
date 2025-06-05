class Solution {
    public int longestOnes(int[] nums, int k) {
     int left = 0;
     int zeros =0;
     int maxLen = 0;
     for(int i = 0 ; i<nums.length;i++){
        if(nums[i]==0){
            zeros++;
        }
        while(zeros>k){
            if(nums[left]==0){
                zeros--;
               
            }left++;

        }
        maxLen = Math.max(maxLen,i-left+1);

     }
     return maxLen;

    }
}