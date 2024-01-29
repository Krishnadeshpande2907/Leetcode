class MinStack {
    Stack<Integer> rack = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        rack.push(val);
    }
    
    public void pop() {
        rack.pop();
    }
    
    public int top() {
        return rack.peek();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<rack.size(); i++){
            int value = rack.get(i);
            if(value<min)   min = value;
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */