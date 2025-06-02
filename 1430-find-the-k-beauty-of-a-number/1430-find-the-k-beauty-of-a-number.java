class Solution {
    public int divisorSubstrings(int num, int k) {

        String s = String.valueOf(num);
        int left =0;
        int c=0;
        if(s.length()<=k) return 1;

        for(int i=k;i<=s.length();i++){
            int n = Integer.parseInt(s.substring(left,i));
            System.out.print(n+" ");
            if(n!=0&& num%n==0){
                c++;
            }
            left++;
        }
        return c; 
    }
}