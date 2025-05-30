class Solution {
    public String removeDuplicates(String s) {
        char[] result = new char[s.length()];
        int i = 0;  

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (i > 0 && result[i - 1] == c) {
                i--;  
            } else {
                result[i++] = c;  
            }
        }

        return new String(result, 0, i);
    }
}
