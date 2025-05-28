import java.util.Stack;

class MyQueue {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Costly push
    public void push(int x) {
        // Move everything from stack1 to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        // Push x into empty stack1
        stack1.push(x);

        // Move everything back to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int pop() {
        return stack1.pop(); // simple pop
    }

    public int peek() {
        return stack1.peek(); // simple peek
    }

    public boolean empty() {
        return stack1.isEmpty();
    }
}
