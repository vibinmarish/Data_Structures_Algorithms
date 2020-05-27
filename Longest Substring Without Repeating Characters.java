class Solution
{
    int SubsequenceLength(String s) 
    {
        HashSet<Character> hash= new HashSet<Character>();
        int pointer1=0;
        int pointer2=0;
        int max=0;
        while(pointer2<s.length())
        {
            if(!hash.contains(s.charAt(pointer2)))
            {
                hash.add(s.charAt(pointer2));
                pointer2++;
                max=Math.max(max,hash.size());
            }
            else
            {
                hash.remove(s.charAt(pointer1));
                pointer1++;
            }
        }
        return max;
    }
    
}