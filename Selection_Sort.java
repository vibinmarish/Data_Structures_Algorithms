
public class Selection_Sort {
public static void main(String args[])
{
	int n=5,min=0;
	int a[]= {45,96,345,65,23};
	
	for(int i=0;i<n-1;i++) //Since the last element in the array will always be sorted we use n-1
	{
		
		min=i;
		for(int j=i+1;j<n;j++)
		{
			
			if(a[j]<a[min])
			{
				min=j;
			}
		}
		if(min!=i)		//if the min value is same as the i'th value no need to swap 
		{
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
	}
	for (int i:a)
	{
		System.out.print(i+" ");
	}
}
}
