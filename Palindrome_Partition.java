
class GFG {
    static int lcs(String s1,String s2)
    {
        int n= s1.length();
        int matrix[][]=new int[n+1][n+1];
        for(int i=0;i<n+1;i++)
        {
            matrix[i][0]=0;
        }
        for(int j=0;j<n+1;j++)
        {
            matrix[0][j]=0;
        }
        
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<n+1;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    matrix[i][j]=matrix[i-1][j-1]+1;
                }
                else
                matrix[i][j]=Math.max(matrix[i][j-1],matrix[i-1][j]);
            }
        }
        return matrix[n][n];
        
        
    }
	public static void main (String[] args) {
		    String s=sc.next();
		    StringBuilder str= new StringBuilder();
		    
			for(int i=s.length()-1;i>=0;i--)
			str.append(s.charAt(i));
			
			System.out.println(s.length()-(lcs(s,str.toString())));		//Bacically we do Longest common subsequence for the given string  and the reversed string
			}												// we subtract the total length with the length of LCS


	}
}