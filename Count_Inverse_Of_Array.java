class Inverse_Count
{   
static int count=0;
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[]={2 ,4, 1, 3, 5};
		int n=a.length;
		int low=0;
		int high=n-1;
		
		mergeSort(a,low,high);
		
		System.out.print(count);
		
	}
	static void mergeSort(int a[],int low,int high)
	{   
	    if(low<high)
	    {
	        int mid=low+(high-low)/2;
	        mergeSort(a,low,mid);
	        mergeSort(a,mid+1,high);
	        merge(a,low,mid,high);
	    }
	}
	static void merge(int a[],int low,int mid,int high)
	{
	    
	    int m=mid-low+1;
	    int n=high-mid;
	    int left[]=new int[m];
	    int right[]=new int[n];
	    
	    for(int i=0;i<m;i++)
	    left[i]=a[i+low];
	    
	    for(int i=0;i<n;i++)
	    right[i]=a[mid+i+1];
	    int i=0,j=0,k=low;
	    while(i<m && j<n)
	    {
	        if(left[i]<=right[j])
	        a[k++]=left[i++];
	        else
	        {
	            a[k++]=right[j++];
	            count=count+(m-i);  //We check if the left[i]>right[j].
	           //Since both the arrays are sorted, rest of the left[i] is always greater than the right[j].
	           //So we add the rest of the number if elements as inverse count.
	            
	        }
	    }
	    
	    while(i<m)
	    {
	        a[k++]=left[i++];
	    }
	    
	    while(j<n)
	    a[k++]=right[j++];
	    
	}
}
