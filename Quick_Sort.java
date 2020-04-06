public class Quick_Sort {
	static int partition(int[] a, int low, int high)
	{
		int pivot = a[low]; // we are choosing the pivot element as the first element.
		int start = low;
		int end = high;
		
		while(start<end) // we want to keep this until start becomes greater than end.
		{
			while(a[start]<=pivot  && start<a.length-1)
				start++;
			while(a[end]>pivot)
				end--;
			
			if(start<end)
			{
				int temp = a[start];
				a[start]=a[end];
				a[end]=temp;
			}
		}
		int temp=a[end]; // swapping the elements when start is greater than end.
		a[end]=a[low];
		a[low]=temp;
		
		return end; // end is returned because the pivot element is stored in that location.
	}
	static void quick_sort(int[] a, int low,int high)
	{
		if(low<high)
		{
			int mid=partition(a,low,high); 
			quick_sort(a,low,mid-1); 
			quick_sort(a,mid+1,high);
		}
	}
	public static void main(String args[])
	{
		int[] a= {324,234,3,54,65,345,3};
		int low=0;
		int high=a.length-1;
		quick_sort(a,low,high);
		for(int i:a)
			System.out.print(i+" ");
	}
}
