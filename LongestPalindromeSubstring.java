package LongestPalString;
class Solution
{
	String checkPal(String s)
	{
		if(s==null || s.length()<1) return "";
		int start=0;
		int end=0;
		
		for(int i=0;i<s.length();i++)
		{
			int len1=middleExpand(s,i,i);	//We are checking if the middle character is also same "racecar" odd length
			int len2=middleExpand(s,i,i+1);
			
			int len=Math.max(len1, len2);
			
			if(len >end-start)
			{
				start=i-((len-1)/2);
				
				end=i+(len/2);
				
			}
		}
		
		return s.substring(start,end+1);	//end+1 because the end index in substring in exclusive
	}
	int middleExpand(String s,int left,int right)
	{
		if(s==null||left>right)
			return 0;
		
		while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
		{
			
			right++;
			left--;
			
		}
		
		return right-left-1;	//-1 because right++ and left-- will run before exiting  the loop
	}
}
public class LongestPalindromeSubstring {
public static void main(String args[])
{
	String s="ssaabbaaasdd";
	Solution sn=new Solution();
	System.out.print(sn.checkPal(s));
}
}
