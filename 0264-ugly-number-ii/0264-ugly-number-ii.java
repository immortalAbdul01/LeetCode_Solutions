class Solution {
    public int nthUglyNumber(int n) {
       int dp [] = new int[1690];
        dp[0] =1;
       int ugly =0 , i2=0,i3=0,i5=0;

       for(int i =1 ; i<1690;i++){
        dp[i] = Math.min(Math.min(dp[i2]*2,dp[i3]*3),dp[i5]*5 );
        ugly= dp[i];
        if(ugly == dp[i2]*2)i2++;
        if(ugly == dp[i3]*3)i3++;
        if(ugly == dp[i5]*5)i5++;



       }
       return dp[n-1];
    }
}