
public class Binary_Search {
public static void main(String args[])
{
	int n=8;
	int[] a= {15,25,33,49,52,64,77,9};
	int high=n;
	int low=0;
	int key=49;
	int mid =0;
	while(low<=high)
	{
		mid = (high+low)/2;
		if(a[mid]== key)
		{
			System.out.print("Found at index "+(mid+1));
			break;
		}
		else if(key>a[mid])
		{
			low=mid+1;
		}
		else
		{
			high=mid-1;
		}
	}
}
}
