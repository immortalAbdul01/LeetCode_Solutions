class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count =0;
        for(char c : jewels.toCharArray()){
            for(char z:stones.toCharArray()){
                if(c==z){
                    count++;
                }
            }
        }
        return count;
    }
}