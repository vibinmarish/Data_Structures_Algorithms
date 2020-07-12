class Solution {
    public int pivotIndex(int[] a) {
        int n=a.length;
            
            if(n==2 ||n==0)
		    return(-1);
            if(n==1)
		    return(1);
		    else{
			    int sum[]=new int[n];
			    int s=0;
			    for(int k=0;k<n;k++)
			    {
			        s=s+a[k];
			        sum[k]=s;		//prefix_sum
			    }
			    int total=sum[a.length-1];
			    
			    for(int i=0;i<n;i++)
			    {
			        int l_sum=sum[i]-a[i];		//we get the left side sum
			        int r_sum=total-sum[i];	//we get the right side sum
			        if(l_sum==r_sum)
			        {
			            return(i);
			        }
			    }
               
            }  return(-1);
}
    }