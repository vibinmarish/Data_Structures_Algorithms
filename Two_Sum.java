class Solution {
    public int[] twoSum(int[] a, int target) {
        
       HashMap<Integer,Integer> map= new HashMap<>();
        
        for(int i=0;i<a.length;i++)
        {
            int diff=target-a[i];
            
            if(map.containsKey(diff))
                return new int[]{map.get(diff),i};		
            else
                map.put(a[i],i);	//Storing the diffrence with its index

        }
         }
}