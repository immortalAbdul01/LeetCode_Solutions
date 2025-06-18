class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
       int pre = 1;
       int suf = 0 ;
       for(int i = 0;i<nums.length;i++){
        if(pre == 0 ) pre =1;
        if(suf==0) suf = 1;
        pre*=nums[i];
        suf*=nums[nums.length-i-1];
        ans = Math.max(ans,Math.max(pre,suf));
       }
       return ans;
    }
}