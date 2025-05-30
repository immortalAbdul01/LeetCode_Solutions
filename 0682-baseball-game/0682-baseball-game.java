import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> ans = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];

            if (op.equals("C")) {
                if (!ans.isEmpty()) {
                    ans.pop();
                }
            } else if (op.equals("D")) {
                if (!ans.isEmpty()) {
                    ans.push(ans.peek() * 2);
                }
            } else if (op.equals("+")) {
                if (ans.size() >= 2) {
                    int top = ans.pop();
                    int newTop = top + ans.peek();
                    ans.push(top); 
                    ans.push(newTop);
                }
            } else {
               
                ans.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int val : ans) {
            sum += val;
        }
        return sum;
    }
}
