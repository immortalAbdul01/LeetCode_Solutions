class Solution {
    public int longestBeautifulSubstring(String word) {
       int len =1;
       int ans =0;
       int count = 1;
       for(int i =1 ;i<word.length();i++){
        if(word.charAt(i)>=word.charAt(i-1)){
            len++;
        
        if(word.charAt(i)!=word.charAt(i-1)){
            count++;

        }}
        else{
            len=1;
            count=1;
        }
        if(count==5){

        ans=Math.max(ans,len);
        }
       }
       return ans;

    }
}