class MyStack {
    private Queue<Integer> st1;
    
    public MyStack() {
        st1 = new LinkedList<>();
    }
    
    public void push(int x) {
        st1.add(x);
        for(int i = 0; i<st1.size()-1; i++) st1.add(st1.poll());
    }
    
    public int pop() {return st1.poll();}
    
    public int top() {return st1.peek();}
    
    public boolean empty() {return st1.isEmpty();}
}