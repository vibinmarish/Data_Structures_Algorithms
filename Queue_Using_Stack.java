class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    void Push(int x)
    {
	   s1.push(x);
    }
	
    
        int Pop()
    {
        if(!s2.isEmpty()){		//Stack2 is not empty, then pop
            return s2.pop();
        }
        if(s1.isEmpty()){		// Both the stack is empty 
            return -1;
        }
        
        while(!s1.isEmpty()){	// Push the elements from s1 to s2. This reverse the stack so now top element it is like the front queue. 
            s2.push(s1.pop());
        }
        
	   return s2.pop();
    }
}