package Graph_BFS;
import java.util.*;
class Graph
{
	int vertex;
	LinkedList<Integer> adj[];
	Graph(int V)
	{
	vertex=V;
	adj=new LinkedList[vertex];	//we are creating an array of objects.
	
	for(int i=0;i<vertex;i++)
		adj[i]=(new LinkedList<Integer>()); 
	}
	void addEdge(int u,int v)
	{
		adj[u].add(v);
	}
	void bfs(int s)
	{
		Queue<Integer>queue=new LinkedList<Integer>();
		
		boolean visited[]=new boolean[vertex];
		visited[s]=true;
		queue.add(s);
		while(queue.size()!=0)
		{
			int val=queue.poll();
			System.out.print(val+" ");
			Iterator<Integer> itr=adj[val].iterator();	//iterator is used to traverse the queue depending on index or 'val' of the list.
			
			while(itr.hasNext())
			{
				int n=(int) itr.next();
				if(!visited[n])		//adding the value to queue only if it is not visited
				{
					visited[n]=true;
					queue.add(n);
				}
			}
		}
		
	}

	
}
public class Graph_BFS {
	public static void main(String args[])
	{
	int v=6;
	Graph g= new Graph(6);
	g.addEdge(0, 1); 
    g.addEdge(0, 2); 
    g.addEdge(1, 2); 
    g.addEdge(2, 0); 
    g.addEdge(2, 3); 
    g.addEdge(3, 3); 
    g.addEdge(1,4);
    g.addEdge(3,4);
    g.addEdge(4,5);
	g.bfs(1);
	}
}

