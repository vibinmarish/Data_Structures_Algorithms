class GFG {
    
	public static void main (String[] args) throws IOException 
	{
	int n=sc.nextInt();
        int p=sc.nextInt();
        int a[]= new int[n];
        
        for(int z=0;z<n;z++)
        {
        a[z]=sc.nextInt();
        }
        
        int i=0;
        int start=0,end=0;
        while(i<n)
        {
            start=i;
            end=Math.min(i+p-1,n-1);		//we choose min value because the index will go beyond the length of the array
            
            while(start<=end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;end--;
        }
            i=i+p;
            
        }

        for(int j:a)
        System.out.print(j+" ");
        System.out.println();
}
	}
}