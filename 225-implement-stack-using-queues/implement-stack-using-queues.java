class MyStack {
    private Queue<Integer> st1;
    private Queue<Integer> st2;
    
    public MyStack() {
        st1 = new LinkedList<>();
        st2 = new LinkedList<>();
    }
    
    public void push(int x) {
        while(!st1.isEmpty())   st2.add(st1.poll());
        st1.add(x);
        while(!st2.isEmpty())   st1.add(st2.poll());
    }
    
    public int pop() {
        return st1.poll();
    }
    
    public int top() {
        return st1.peek();
    }
    
    public boolean empty() {
        // if(st1.peek()!=null)    return true
        return (st1.peek()==null);
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