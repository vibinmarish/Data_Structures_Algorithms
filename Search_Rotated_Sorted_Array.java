class Solution 
{ 
    static int Search(int array[], int target)
	{
	    int left=0;
	    
	    int right=array.length-1;
	    int ans=-1;
	    while(left<right)
	    {
	        int mid=left+(right-left)/2;
	        
	        if(array[mid]>array[right])
	        {
	            left=mid+1;
	            
	        }
	        else
	        {
	            right=mid;
	        }
	        
	    }
	   
	    if(target >= array[left] && target<=array[array.length-1])
	    {
	        right=array.length-1;
	    }
	    else
	    {
	        left=0;
	    }
	    while(left<=right)
	    {
	        int mid= left+(right-left)/2;
	        if(array[mid]==target)
	        {
	            return mid;
	        }
	        if(array[mid]>target)
	        {
	            right=mid-1;
	        }
	        else
	        {
	            left=mid+1;
	        }
	    }
	    return -1;
	}
} 
