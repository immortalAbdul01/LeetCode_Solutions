class Solution {
    public int countGoodSubstrings(String s) {
        
        int c=0;
        char arr[] =  s.toCharArray();
        for(int i=2;i<arr.length;i++){
            if(arr[i-2]!=arr[i-1] && arr[i-1]!=arr[i] && arr[i-2]!=arr[i])
            c++;
        }

        return c;
    }
}