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
