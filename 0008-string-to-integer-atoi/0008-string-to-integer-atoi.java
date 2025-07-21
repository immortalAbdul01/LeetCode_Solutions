class Solution {
    public int myAtoi(String s) {
      int i = 0, sign = 1, res = 0;
    s = s.trim();
    if (s.isEmpty()) return 0;

    if (s.charAt(i) == '-' || s.charAt(i) == '+')
        sign = s.charAt(i++) == '-' ? -1 : 1;

    while (i < s.length() && Character.isDigit(s.charAt(i))) {
        int digit = s.charAt(i++) - '0';
        if (res > (Integer.MAX_VALUE - digit) / 10)
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        res = res * 10 + digit;
    }

    return sign * res;

    }
}