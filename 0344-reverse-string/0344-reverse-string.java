class Solution {
    public void reverseString(char[] s) {
List<Character> ans = new ArrayList<>();
       for(int i = s.length-1;i>=0;i--){
        ans.add(s[i]);
       }

       for(int i = 0 ; i<ans.size();i++){
        s[i] = ans.get(i);
       }

    }
}