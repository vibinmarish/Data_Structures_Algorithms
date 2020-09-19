class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    int pop()
    {
	    if(q1.isEmpty()){
	        return -1;
	    }
	    while(q1.size()!=1){	//Removing the elements in the queue until there is the last one left.
	        q2.add(q1.poll());
	    }
	    
	    int val=q1.poll();
	    
	    Queue<Integer> q=q1;	//Swap queue
	    q1=q2;
	    q2=q;
	    
	    return val;
    }
	
    void push(int a)
    {
	    q1.add(a);	
    }
}
