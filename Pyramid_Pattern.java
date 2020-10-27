class Pyramid
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=25;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=(2*n)-1;j++){
		        if(j>=n-(i-1) && j<=n+(i-1)){
		            System.out.print("*");
		        }
		        else
		        System.out.print(" ");
		    }
		     System.out.println();
		}
	}
}

// Explaination https://www.youtube.com/watch?v=KdM6OrvcjPI