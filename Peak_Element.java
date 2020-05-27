public int peakElement(int[] a,int n)
    {
       int low=0;
       int high=n-1;
       while(low<high)
       {
           int mid=high-(high-low)/2;
           if (low==high)
           return low;
           
           if(a[mid-1]>a[mid])
           {
               high=mid-1;
           }
           else
           {
               low=mid;
           }
       }
       return low;