class Solution {
    public int[] rearrangeArray(int[] nums) {
  ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int[] ans = new int[nums.length];

        for (int num : nums) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }

        int i = 0, p = 0, n = 0;
        while (i < nums.length) {
            ans[i++] = pos.get(p++);
            ans[i++] = neg.get(n++);
        }

        return ans;
    }
}