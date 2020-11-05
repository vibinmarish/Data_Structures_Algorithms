class GCD
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1=65, n2=10, min,gcd=0;
		
		if(n1>n2)
		min=n2;
		else
		min=n1;
		
		for(int i=1;i<=min;i++){
		    if(n1%i==0 && n2%i==0){
		        gcd=i;
		    }
		}
		System.out.print("GCD "+gcd+" LCM "+(n1*n2)/gcd);
		
	}
}
