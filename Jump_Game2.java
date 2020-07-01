class Solution {
    public int jump(int[] nums) {
    
        int minJumps[]=new int[nums.length];
        
        Arrays.fill(minJumps,Integer.MAX_VALUE);		//Since we want to find the minimum jumps we store with infinite value
        minJumps[0]=0;							//First position does not have any minimum number of jumps
        
        int min=Integer.MAX_VALUE;
        
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j+nums[j]>=i )
                minJumps[i]=Math.min(minJumps[j]+1,minJumps[i]);
            }
          
        }
    return minJumps[n-1];
    }
}