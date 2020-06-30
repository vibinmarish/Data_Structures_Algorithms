class Vibin
{
	public static void main (String[] args) throws java.lang.Exception
	{int a[]={1, 2, 3, 7, 5,};
		int pointer=0;
		int sum=a[0];
		int k=12;
		int n=a.length;
		
		for(int i=1;i<n;i++)
		{
		    while(sum>k && pointer<i-1)
		    {
		        sum=sum-a[pointer];
		        pointer++;
		    }
		    if(sum==k)
		    {
		        System.out.print(i-1+" "+pointer);
		        break;
		    }
		    if(i<n)
		    {
		        sum=sum+a[i];
		    }
		}
		}
}