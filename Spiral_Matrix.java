class spiral_Matrix {
	public static void main (String[] args) {
			int a[][]=new int[m][n];
			int l=0,k=0;
			int last_row=m-1;
			int last_col=n-1;
			
			while(k<=last_row && l<=last_col)
			{
			    for(int i=l;i<=last_col;i++)
			    {
			        System.out.print(a[k][i]+" ");
			    }
			    k++;
			    
			    for(int i=k;i<=last_row;i++)
			    {
			        System.out.print(a[i][last_col]+" ");
			    }
			    last_col--;
			    if(k<=last_row)
			    {
			        for(int i=last_col;i>=l;i--)
			        {
			            System.out.print(a[last_row][i]+" ");
			        }
			        last_row--;
			    }
			    if(l<=last_col)
			    {
			        for(int i=last_row;i>=k;i--)
			        {
			            System.out.print(a[i][l]+" ");
			        }
			        l++;
			    }
			}
			System.out.println();
			}
	}
}