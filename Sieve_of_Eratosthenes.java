class Prime
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=50;
		boolean prime[]=new boolean[n+1];
		
		for(int i=0;i<n+1;i++)
		prime[i]=true;
		
		prime[0]=false;
		prime[1]=false;
		
		for(int i=2;i<=Math.sqrt(n);i++)    //We go upto sqrt of n. Ex we strike off 15. its root is 3.5.It will get struck off before the value of its root. 
		{
		    if(prime[i]==true)
		    {
		        for(int j=2;j*i<=n;j++)     //we are multiplying i with all possible numbers. to strike off its multiples as they are not prime
		        prime[j*i]=false;
		    }
		}
		for(int k=0;k<n+1;k++)
		{
		   if(prime[k]==true)
		System.out.print(k+" ");
		}
	}

}