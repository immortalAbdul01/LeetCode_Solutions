class Solution {
    public int maxRepeating(String sequence, String word) {
        int count =0;
        StringBuilder ans = new StringBuilder(word);
        while(sequence.contains(ans.toString())){
            count++;
            ans.append(word);
        }
        return count;
    }
}