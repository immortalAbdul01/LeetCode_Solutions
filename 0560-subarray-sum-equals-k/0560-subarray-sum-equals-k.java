class Solution {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        // int [] ans = new int [nums.length];
    
        for(int i =0 ; i<nums.length;i++){
            
          for(int j = i ; j<nums.length;j++){
            int sum =0;
            for(int p = i ; p<=j;p++){
               sum+=nums[p];
                
            }
            if(sum==k){
                count++;
            }
          }
        }
        return count;
    }
}