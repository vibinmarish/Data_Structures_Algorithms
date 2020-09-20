class MinStack {

    Stack<Integer> stack = new Stack<>(); 
    Stack<Integer> min = new Stack<>();
    
    public void push(int x) 
    {
        stack.push(x); 
        if(min.isEmpty() || x < min.peek())		//Push the min element to a stack
            min.push(x); 
        else 
            min.push(min.peek()); 			//Push the top of the stack again if no new min element is found
    }
    
    public void pop() {
        stack.pop(); 
        min.pop(); 
    }
    
    public int top() {
        return stack.peek(); 
    }
    
    public int getMin() {
        return min.peek(); 
    }
}