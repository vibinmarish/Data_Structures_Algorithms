class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums)		//sum of all values
            sum=sum+i;
        if(sum%2!=0)		//if the sum is odd we can't equally divide
            return false;
        
        sum=sum/2;
        int n=nums.length-1;			//Rest of the code is same as subset sum
        boolean matrix[][]=new boolean[n+1][sum+1];
        for(int i=0;i<n;i++)
            matrix[i][0]=true;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(nums[i-1]<=j)
                {
                    matrix[i][j]=matrix[i-1][j] || matrix[i-1][j-nums[i-1]];
                }
                else
                    matrix[i][j]=matrix[i-1][j];
            }
        }
        return matrix[n][sum];
    }
}