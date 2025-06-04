class Solution {
    public char findTheDifference(String s, String t) {
        int [] ans = new int [26];
     
        for(char c : t.toCharArray()){
            ans[c-'a']++;
        }
        for(char c : s.toCharArray()){
            ans[c-'a']--;
           

        }
        for(int i = 0; i<26;i++){
            if(ans[i]==1){
                return (char) (i+'a');
            }
        }
        return ' ';
       
    }
}