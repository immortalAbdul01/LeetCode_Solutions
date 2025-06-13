class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       ArrayList<Integer> ans = new ArrayList<>();
       for(int i = 0 ; i<nums.length;i++){
        if(set.contains(nums[i])){
            ans.add(nums[i]);

        }
        else{
            set.add(nums[i]);
        }
       } 
       return ans;
    }
}