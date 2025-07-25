class Solution {
    public int integerReplacement(int n) {
        long num = n;
        int count = 0;
        
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                if (num == 3 || num % 4 == 1) {
                    num -= 1;
                } else {
                    num += 1;
                }
            }
            count++;
        }
        
        return count;
    }
}