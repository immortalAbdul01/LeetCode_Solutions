class Solution {
    public String removeDuplicates(String s) {
String ans ="";

        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i<s.length();i++){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)){
                stack.pop();
            }else{


            stack.push(s.charAt(i));
            }           
        }

for(int i = 0 ; i<stack.size();i++){
    ans+=stack.get(i);
}

        return ans;
    }
}