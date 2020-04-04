
public class Heap_Sort {
	static void max_heapify(int[] a,int n,int i)
	{
		int largest=i;
		int l = i*2;  //multiplying index with 2 will give the leaf node
		int r = (i*2)+1; 
		
		if(l<=n && a[l]>a[largest])
			largest=l;
		if(r<=n && a[r]>a[largest])
			largest=r;
		if(largest!=i) // if the largest is changed, we swap and call max_heapify to check its child nodes
		{
			int temp=a[largest];
			a[largest]=a[i];
			a[i]=temp;
			max_heapify(a,n,largest);
		}
	}
	static void heap_sort(int[] a,int n)
	{
		for(int i=n/2;i>=1;i--)  // i=n/2 because we only want nodes with children. We don't check leaf node because it is max heap by itself.
			max_heapify(a,n,i);
		
		for(int i=n;i>=1;i--)
		{
			int temp=a[1];
			a[1]=a[i];
			a[i]=temp;
			
			max_heapify(a,i-1,1); //i-1 because we deleted the element, so we don't need the last index. 1 is there because we want to start from the root.
		}
	}
public static void main(String args[])
{
	int[] a = {0,234,35,46,56,65}; // array starts from index 1
	int n=a.length-1;
	heap_sort(a,n);
	for(int i=1;i<=n;i++)
		System.out.print(a[i]+" ");
}
}
