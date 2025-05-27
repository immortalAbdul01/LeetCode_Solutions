class Solution {
    public boolean isAnagram(String s, String t) {
        
        char str []= s.toCharArray();
        char trr []= t.toCharArray();

        Arrays.sort(str);
        Arrays.sort(trr);

        if(Arrays.equals(str,trr)){
            return true;
        }else{
            return false;
        }

    }
}