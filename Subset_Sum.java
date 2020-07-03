static boolean isSubsetSum(int set[], 
							int n, int sum) 
	{ 
		
      boolean matrix[][]=new boolean[n+1][sum+1];	//we are creating boolean matrix
      
      for(int i=0;i<n;i++)
        matrix[i][0]=true;		//we can make sum 0 with an empty set so we assign 0 to 0th column
      
      for(int i=1;i<=n;i++)
        for(int j=1;j<=sum;j++)
          if(set[i-1]<=j)			//checking if the value in the set is less than or equal to sum aka j
          	matrix[i][j]=matrix[i-1][j] || matrix[i-1][j-set[i-1]];		//compare previous row value or matrix position of previous row - set value
      	  else
        	matrix[i][j]=matrix[i-1][j];		//use the previous row value
      
      
      
      return matrix[n][sum];  
      
	} 
