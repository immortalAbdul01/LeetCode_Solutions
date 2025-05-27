class Solution {
    public boolean isAnagram(String s, String t) {

        int arr1[] = new int[130];
        int arr2[] = new int[130];

        if(s.length()!=t.length()) return false;

        for(int i=0;i<s.length();i++){
            int idx =(int) s.charAt(i);
            arr1[idx] = arr1[idx]+1;

            int tdx = (int) t.charAt(i);
            arr2[tdx] = arr2[tdx]+1;
        } 

        return Arrays.equals(arr1,arr2);
       
    }
}