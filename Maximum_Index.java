class GFG {
	public static void main (String[] args)
	{
	int leftMin[]=new int[n];
	int rightMax[]=new int[n];
			
	leftMin[0]=a[0];
	rightMax[n-1]=a[n-1];
			
	for(int i=1;i<n;i++)
	leftMin[i] = Math.min(leftMin[i-1],a[i]);	//Keep left Min array
	
            for(int i=n-2;i>=0;i--)
            rightMax[i]=Math.max(rightMax[i+1],a[i]);	//Keep right Max array
            
            int max=0;
            int i=0;
            int j=0;
            
            while(i<n && j<n)		//Use both the arrays and apply the condition
            {
                if(leftMin[i]<=rightMax[j])
                {
                    max=Math.max(max,j-i);		//Store the maximum j-i value
                    j++;
                }
                else
                i++;
            }
            System.out.println(max);
	}
}