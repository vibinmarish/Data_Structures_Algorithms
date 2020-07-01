class Solution {
    public boolean canJump(int[] nums) {
    
        int position=nums.length-1;     //we store the last index since we are going to traverse from the last
        
        for(int i=nums.length-1;i>=0;i--)
        {
            if(i+nums[i]>=position)     //If the current index + the value of the current index >= the position of last index
                position=i;
        }
        return position ==0;	//checking boolean 
    }
}