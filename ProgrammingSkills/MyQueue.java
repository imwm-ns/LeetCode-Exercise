import java.util.Stack;

class MyQueue {
    Stack<Integer> front = new Stack<>();
    Stack<Integer> back = new Stack<>();
    int init;
    
    public MyQueue() {
        init = 0;
    }
    
    public void push(int x) {
        back.push(x);
    }
    
    public int pop() {
        if (!back.isEmpty()) {
            while (!back.isEmpty()) front.push(back.pop());
        }
        if (!front.isEmpty()) init = front.pop();
        while (!front.isEmpty()) back.push(front.pop());
        return init;
    }
    
    public int peek() {
        if (!back.isEmpty()) {
            while (!back.isEmpty()) front.push(back.pop());
        }
        if (!front.isEmpty()) init = front.peek();
        while (!front.isEmpty()) back.push(front.pop());
        return init;
    }
    
    public boolean empty() {
        if (back.isEmpty()) return true;
        return false;
    }
}