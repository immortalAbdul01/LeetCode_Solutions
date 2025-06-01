class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0 ;
        int min = Integer.MAX_VALUE;
        int sums = 0;

        for(int right  = 0 ; right<nums.length;right++){
            sums+=nums[right];

            while(sums>=target){
              
             min = Math.min(min,right-left+1);
                sums-=nums[left];
                left++;

            }

            // if(sums==target)   min = Math.min(min,right-left+1);
        }
        return (min==Integer.MAX_VALUE) ? 0:min ;
       
    }
}