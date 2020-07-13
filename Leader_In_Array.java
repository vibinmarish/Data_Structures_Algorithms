class Leader_In_Array {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    
		    int a[]=new int[n];
		    
		    for(int j=0;j<n;j++)
		    a[j]=sc.nextInt();
		    
		    int max=a[n-1];
		    ArrayList<Integer> list=new ArrayList<>();
		    for(int i=n-1;i>=0;i--)	//we are traversing from last since the question asked to check if current element is greater or = to all elements in the right.
		    {
		        if(a[i]>=max)		//we store the maximum element and compare it with each iteration. if we find a new max we print and replace max.
		        {
		        list.add(a[i]);
		        max=a[i];
		        }
		    
		}
		Collections.reverse(list);
		for(int q:list)
		System.out.print(q+" ");
		    System.out.println();
		}
	
}