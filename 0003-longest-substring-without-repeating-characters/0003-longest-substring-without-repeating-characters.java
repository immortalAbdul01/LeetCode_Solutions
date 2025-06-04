class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
       int [] hash = new int [256];
       Arrays.fill(hash,-1);
       int idx =0;
       for(int i = 0; i<s.length();i++){
        if(hash[s.charAt(i)]!=-1){
            idx = Math.max(hash[s.charAt(i)]+1,idx);
        }
        max=Math.max(max,i-idx+1);
        hash[s.charAt(i)]=i;
       }
       return max;
    }
}