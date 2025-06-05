class Solution {
    public int longestBeautifulSubstring(String word) {
       int maxLen = 0;
        int count = 1;
        int len = 1;

        for (int i = 1; i < word.length(); i++) {
            char prev = word.charAt(i - 1);
            char curr = word.charAt(i);

            if (curr >= prev) {
                len++;
                if (curr != prev) count++;
            } else {
                len = 1;
                count = 1;
            }

            if (count == 5) {
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }
}