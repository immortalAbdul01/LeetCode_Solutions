class Solution {
    public int findMin(int[] nums) {
        int ans=-1;

       for(int i=0;i<nums.length-1;i++){

            int j=i+1;
            if(nums[j]<nums[i]){
                ans=nums[j];
            }
       }

        return (ans==-1) ? nums[0] : ans;
    }
}