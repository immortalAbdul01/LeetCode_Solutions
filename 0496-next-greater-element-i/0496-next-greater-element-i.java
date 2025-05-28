class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int n=nums2.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && nums2[stack.peek()]<nums2[i] ){
                
                map.put(nums2[stack.pop()],nums2[i]);
            }

            stack.push(i);
        }

        while(!stack.isEmpty()){
            
            map.put(nums2[stack.pop()],-1);
        }

        for(int i=0;i<nums1.length;i++){
            nums1[i] = map.get(nums1[i]);
        }

        return nums1;
    }
}