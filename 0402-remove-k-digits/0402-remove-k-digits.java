class Solution {
    public String removeKdigits(String num, int k) {
         int n = num.length();
        if (k == n) return "0";

        StringBuilder stack = new StringBuilder();

        for (char digit : num.toCharArray()) {
           
            while (stack.length() > 0 && k > 0 && stack.charAt(stack.length() - 1) > digit) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }
            stack.append(digit);
        }

        
        while (k > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }

      
        int i = 0;
        while (i < stack.length() && stack.charAt(i) == '0') {
            i++;
        }

        String result = stack.substring(i);
        return result.isEmpty() ? "0" : result;
    }
}