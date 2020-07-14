Sample input:   100 180 260 310 40 535 695
Sample output: (0 3) (4 6)

class Stock {
	public static void main (String[] args) {
			ArrayList<Integer> buy=new ArrayList<>();
			int i=0;
			int count=0;
			while(i<n-1)		//There maybe many time we can buy and sell a stock, si we have to iterate the whole array
			{
			    while(i<n-1 && a[i+1]<=a[i])		//We are checking if the adjacent element is smaller than the current element. If it is we can use that index as the local minima.
			    {
			        i++;
			    }
			    
			    if(i==n-1)	//if all the elements are smaller than adjacent elements index will reach last. There will be no profit.
			    break;
			    
			    buy.add(i);
			    ++i;		//we want to move the index to next element to check.
			    
			    while(i<n && a[i]>=a[i-1])
			    {
			        i++;
			    }
			    
			    buy.add(i-1);	//i-1 because the index will be moved to the next location before the loop stops.
			    count++;
			}
			
			if(count==0)
			System.out.print("No Profit");