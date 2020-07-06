class GFG {
	public static void main (String[] args) {
		int count=0;
		    Arrays.sort(a);	//we sort the array so that we can use two pointer approach efficently
		    for(int i=n-1;i>=0;i--)
		    {
		        int start=0;	//we select the last element and keep two pointer from start and end.
		        int end=i-1;
		        while(start<end)	
		        {
		            if(a[start]+a[end]==a[i])
		            count++;
		            
		            if(a[start]+a[end]<a[i])	//if the sum is greater than the last element we ++start so that the total sum will increase because its is a sorted list
		            start++;
		            else
		            end--;
		            
		        }
		    }
		    if(count!=0)
		    System.out.println(count);
		    else
		    System.out.println(-1);
		}
	}
}