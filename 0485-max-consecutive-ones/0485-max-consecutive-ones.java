class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
 int maxLength = 0 ;
 int left = 0 ;
 for(int right = 0 ; right<nums.length;right++){
    if(nums[right]==0){
        left = right+1;
    }
    maxLength = Math.max(maxLength,right-left+1);
 }    
 return maxLength;
    }
}