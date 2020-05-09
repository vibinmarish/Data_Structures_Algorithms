

public class Kadane_Max_Subarray_Sum {
	public static void main(String args[])
	{
		int []a= {-2, -3, 4, -1, -2, 1, 5, -3};
		int max_so_far=a[0];
		int current_maxsum=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			current_maxsum=Math.max(a[i],current_maxsum+a[i]);	
			max_so_far=Math.max(max_so_far,current_maxsum);
		}
		System.out.print("Max Subarray Sum: "+max_so_far);
	}
}

//https://www.youtube.com/watch?v=2MmGzdiKR9Y