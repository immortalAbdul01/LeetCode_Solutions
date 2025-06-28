class Solution {
    public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            generateList(0,nums,new ArrayList<Integer>(), ans);
            return ans;



    }
    static void generateList(int index , int [] arr , List<Integer> current , List<List<Integer>> ans ){
        ans.add(new ArrayList<>(current));

        for(int i = index ; i<arr.length;i++){
            current.add(arr[i]);
        

        generateList(i+1,arr,current,ans);
        current.remove(current.size()-1);
        }
    }
}