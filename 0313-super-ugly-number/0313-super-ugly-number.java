class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        long[] ret = new long[n];
        ret[0] = 1;

        int k = primes.length;
        int[] index = new int[k];
        long[] next = new long[k];

        for (int i = 0; i < k; i++) {
            next[i] = primes[i];
        }

        for (int i = 1; i < n; i++) {
            long nextUgly = Long.MAX_VALUE;
            for (int j = 0; j < k; j++) {
                nextUgly = Math.min(nextUgly, next[j]);
            }

            ret[i] = nextUgly;

            for (int j = 0; j < k; j++) {
                if (next[j] == nextUgly) {
                    index[j]++;
                    next[j] = primes[j] * ret[index[j]];
                }
            }
        }
        return (int) ret[n - 1];
    }
}