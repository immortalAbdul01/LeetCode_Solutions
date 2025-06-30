class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> helper = new ArrayList<>();
        findCombinations(0,candidates,target,ans,helper);
        return ans;
    }
    static void findCombinations(int idx ,int [] arr , int target , List<List<Integer>> ans , List<Integer> helper){
        if(idx==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(helper));
            }
            return ;
        }
        if(arr[idx]<=target){
            helper.add(arr[idx]);
            findCombinations(idx,arr,target-arr[idx],ans,helper);
            helper.remove(helper.size()-1);
        }

        findCombinations(idx+1,arr,target,ans,helper);
    }
}