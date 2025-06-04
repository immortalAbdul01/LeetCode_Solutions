class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     int [] ans = new int  [26];
     for ( char c : magazine.toCharArray()){
        ans[c-'a']++;

     }

    for(char c : ransomNote.toCharArray()){
        ans[c-'a']--;
        if(ans[c-'a']<0){
            return false;
        }
    }
    return true;
    }
}