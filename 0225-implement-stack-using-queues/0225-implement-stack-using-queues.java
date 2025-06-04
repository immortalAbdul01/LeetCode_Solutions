class MyStack {

    Queue<Integer> main;
    Queue<Integer> helper;


    public MyStack() {
        main = new LinkedList<>();
        helper = new LinkedList<>();
    }
    
    public void push(int x) {
        while(!main.isEmpty()){
            helper.add(main.remove());
        }

        main.add(x);
        while(!helper.isEmpty()){
            main.add(helper.remove());
        }
        
    }
    
    public int pop() {
        return (!main.isEmpty()) ? main.remove() : -1;
    }
    
    public int top() {
        return (!main.isEmpty()) ? main.peek() : -1;
        
    }
    
    public boolean empty() {
        return main.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */