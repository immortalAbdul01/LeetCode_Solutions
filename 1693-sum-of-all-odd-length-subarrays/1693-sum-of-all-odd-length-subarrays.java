class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        

        int sum = 0 ;
        int n = arr.length;
        for(int i = 0 ; i<n;i++){
            int left = i+1;
            int right=n-i;
            int total= left*right;
            int odd = (total+1)/2;

             sum+=arr[i]*odd;
        }
        return sum;
      
    }
}