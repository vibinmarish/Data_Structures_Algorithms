class Trap{
    
    static int trappingWater(int a[], int n) { 
        
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=a[0];
        right[n-1]=a[n-1];
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],a[i]);	//We store the maximum value from left to right
            
        }
        
            for(int i=n-2;i>=0;i--)
        {
            
            right[i]=Math.max(right[i+1],a[i]);	//We store the maximum value from right to left
            
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+(Math.min(right[i],left[i])-a[i]);	//We subtract the current element value with the min value of both left and right array
        }
        
        return sum;
    } 
}
