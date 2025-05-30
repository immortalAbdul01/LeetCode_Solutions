class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> ans = new Stack<>();
int i = 0;
   for( int x : pushed){
    ans.push(x);

    while(!ans.isEmpty() && ans.peek()==popped[i]){
        ans.pop();
        i++;
    }
   }
   return ans.isEmpty();

    }
}     