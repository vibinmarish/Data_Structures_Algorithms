class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int matrix[][]=new int[n+1][m+1];
        
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0||j==0)      //Index 0 is kept as 0
                    matrix[i][j]=0;
                
                else if(text1.charAt(i-1)==text2.charAt(j-1))   //if the character is same
                    matrix[i][j]=matrix[i-1][j-1]+1;       //We choose the element that is the previous diagonal element.
                
                else
                    matrix[i][j]=Math.max(matrix[i-1][j],matrix[i][j-1]);   //If it is not equal we choose the maximum of the previous row element and the previous column element.
            }
        }
        return matrix[n][m];    //We return the last element of the matrix.
    }
}
//https://www.youtube.com/watch?v=43P0xZp3FU4