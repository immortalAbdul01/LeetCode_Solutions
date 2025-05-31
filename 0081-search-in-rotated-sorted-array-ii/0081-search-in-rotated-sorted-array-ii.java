class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int s = 0 ;
        int e = nums.length-1;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(target>nums[mid]){
               s=mid+1;
            }

              if (nums[mid]>target){
                e = mid-1;
            }
            if(nums[mid]==target) {
             return true;
            }

        }
        return false;

    }
}