class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int prefix[] = new int[n];
        prefix[0] = nums[0];
        for(int i=1;i<n;i++) {
            prefix[i]= nums[i]+prefix[i-1];
            
        }

        for(int i=0;i<n;i++){
            if(i==0){
                nums[i]=Math.abs(prefix[n-1]-prefix[i]);
                continue;
            }else if(i==n-1){
                nums[i] = prefix[n-2];
                continue;
            }

            nums[i] = Math.abs(Math.abs((prefix[n-1]-prefix[i]))-prefix[i-1]);
        }

        return nums;
    }
}