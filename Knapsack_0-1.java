class Knapsack { 

	static int knapSack(int W, int wt[], int val[], int n) 	//Given weight and profits(vals) We have to find the maximum profit within the given weight
	{ 
		
      	int matrix[][]=new int[n+1][W+1];
      	
      for(int i=0;i<=n;i++)
      {
        for(int j=0;j<=W;j++)
        {
          if(i==0||j==0)
            matrix[i][j]=0;
          
          else if(wt[i-1]<=j)	//If the current weight is less or equal to the given weight.
          {
            matrix[i][j]=Math.max(val[i-1] + matrix [i-1] [j - wt[i-1] ],  matrix[i-1][j]);	//We take the max of (current profit+ matrix element of(current weight-given weight))or the previous matrix value)
          }
          else
            matrix[i][j]=matrix[i-1][j];		//previous matrix value
        }
       
	} 
       return matrix[n][W];		//return last matrix value
	}
}
//https://www.youtube.com/watch?v=PfkBS9qIMRE