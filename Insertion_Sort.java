
public class Insertion_Sort {
	public static void main(String args[])
	{
		int n=5,temp=0,j;
		int a[] = {34,67,23,657,4};
		for(int i=1;i<n;i++)	// i starts from 1 because the array should start from the second position
		{
			temp=a[i];			
			j=i-1;				// j is assigned with the array index before i'th index 
			while(j>=0 && a[j]>temp)  //checking if j > 0 and a[j] element is greater than the element in i'th position.
			{
				a[j+1]=a[j];		//swap the elements
				j--;				//we need to traverse in reverse on the sorted part of array
			}
			a[j+1]=temp;			// j+1 because j-- will take place before the while loop is terminated
		}
		for(int i:a)
		System.out.print(i+" ");
	}

}
