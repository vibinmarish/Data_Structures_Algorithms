
class GFG {
        public static void main (String[] args)throws IOException {
        
		    Stack<Long> stack= new Stack<>();
		    HashMap<Long,Long> map=new HashMap<>();
		    stack.push(a[0]);
		    for(int i=1;i<n;i++){
		        while(!stack.isEmpty() && a[i]>stack.peek() ){
		            map.put(stack.pop(),a[i]);
		        }
		        stack.push(a[i]);
		    }
		    
		    long m=-1;
		    while(!stack.isEmpty()) {
                     map.put(stack.pop(),m);
                   }
                
                  for(int i=0;i<n;i++)
                  System.out.print(map.get(a[i])+" ");  
	}
}}