class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
         int n = intervals.length;
        int[][] temp = new int[n + 1][2]; 
        int index = 0;
        int i = 0;

       
        while (i < n && intervals[i][1] < newInterval[0]) {
            temp[index++] = intervals[i++];
        }

        
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        temp[index++] = newInterval;

       
        while (i < n) {
            temp[index++] = intervals[i++];
        }

        int[][] result = new int[index][2];
        for (i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}