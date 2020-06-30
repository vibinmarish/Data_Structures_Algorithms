class Solution {
    public int lengthOfLIS(int[] nums) {
                
       int maxLength[] = new int[nums.length];
       Arrays.fill(maxLength,1);
       int max_so_far=1;			// Atleast one digit is also a increasing subsequence. So first index subsequence will be 1.
        
        for(int i=1;i<nums.length;i++)	//Starting from index 1 because we have already found out first index subsequence is 1.
        {
            for(int j=0;j<i;j++)			//j will start from 0 to position of i.
            {
                if(nums[i]>nums[j])
                {
                maxLength[i]=Math.max(maxLength[i],maxLength[j]+1);	//If element at index i is >jth element we update the value of maxLength array.
                 }   
            }
            max_so_far=Math.max(max_so_far,maxLength[i]);
        }
        return max_so_far;
    }
}