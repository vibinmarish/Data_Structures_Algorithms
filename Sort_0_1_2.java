class sort012 {
	public static void main (String[] args) {
	
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    
		    int high=n-1;
		    int low=0;
		    int mid=0;
		    while(mid<=high)
		    {
		        if(a[mid]==0)
		        {
		            swap(a,mid,low);
		            mid++;
		            low++;
		        }
		        else if(a[mid]==1)	//We don't do anything to the vale 1 because if we move 0 and 2 to the end of the array 1 will automatically be in the middle
		        mid++;
		        else
		        {
		            swap(a,mid,high);
		            high--;	//we don't increase mid because the value of a[high] when we swap can be 0 sometimes. In this way we can swap the 0 to the first half of the array when we loop again.
		        }
		    }
		    
		    for(int i:a)
		    System.out.print(i+" ");
		    System.out.println();
		    
		
	}
	static void swap(int a[],int val1,int val2)
	{
	    int temp=a[val1];
	    a[val1]=a[val2];
	    a[val2]=temp;
	}
}