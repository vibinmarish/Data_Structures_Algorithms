public class Merge_Sort
{
    void merge(int[]a,int low,int mid,int high)
	{
		int n= mid-low+1;
		int m=high-mid;
		
		int[] left= new int[n];
		int[] right=new int[m];
		
		for(int i=0;i<n;i++)
			left[i]=a[low+i];
			
		for(int i=0;i<m;i++)
			right[i]=a[mid+1+i];
		
		int i=0,j=0,k=low;
		
		while(i<n &&j<m)
		{
			if(left[i]<=right[j])
				a[k++]=left[i++];
			
			else
				a[k++]=right[j++];
		}
		while(i<n)
			a[k++]=left[i++];
		
		while(j<m)
			a[k++]=right[j++];
	}
    void mergesort(int[]a,int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			mergesort(a,low,mid);
			mergesort(a,mid+1,high);
			merge(a,low,mid,high);
			
		}
	}
    public static void main(String args[])
    {
    	Merge_Sort s= new Merge_Sort();
    	
    	int n=5;
    	int a[]= {345,23,67,87,35};
    	int low=0,high=n-1;
    	
    	s.mergesort(a,low,high);
    	
    	for (int i :a)
    		System.out.print(i+" ");
    	
    }
}