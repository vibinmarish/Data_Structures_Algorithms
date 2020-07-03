class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        
        Arrays.fill(dp,amount+1);   //We are filling higher values as a placeholder
        
        dp[0]=0;        //for sum 0 we store 0
        int n=coins.length-1;
        for(int i=0;i<=amount;i++)
        {
            for(int j=0;j<=n;j++)
            {   
                if(coins[j]<=i)     //if the coin value is <= than the sum
                dp[i]=Math.min(dp[i],1+dp[i-coins[j]]);        //we choose the min of current value or the 1+ coin value - sum
            }
        }
        if(dp[amount]!=amount+1)    //if the last value is not the placeholder value we got the answer
            return dp[amount];
        else
            return -1;
        
    }
}