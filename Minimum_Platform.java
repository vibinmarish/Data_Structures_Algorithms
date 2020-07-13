
class MP {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int a[]=new int [n];
		    int b[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    for(int j=0;j<n;j++)
		    {
		        b[j]=sc.nextInt();
		    }
		    
		    Arrays.sort(a);
		    Arrays.sort(b);
		    
		    int  dept=0,arr=1;		//we check from the start of departure time and second of arrival time
		    int max=1;			//there will always be 1 train so we need 1 platform
		    int platforms=1;
		    while(dept<n&& arr<n)	//we use similar approach to merging two array.
		    {
		        if(a[arr]<b[dept])	//if the arrival time is greater than departure time. We can say that a new train has arrived so it need a platform
		        {
		            platforms++;
		            arr++;
		            max=Math.max(platforms,max);
		        }
		        else				//if the departure time is greater than arrival. we can say that a train left. so a platform is free.
		        {
		        platforms--;
		        dept++;
		        max=Math.max(platforms,max);
		        }
		    }
		 System.out.println(max);   
		
		
	}
}