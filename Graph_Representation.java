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
		adj[i]=(new LinkedList()); 
	}
	void addEdge(int u,int v)
	{
		adj[u].add(v);		//assigning in both because it is undirected
		adj[v].add(u);
	}
	void printGraph()
	{
		for (int i = 0; i < vertex; i++)
		{
			System.out.println("\nAdjacency Vertex: "+i);
			for (int j=0; j < adj[i].size(); j++)		
			{
				System.out.print(adj[i].get(j)+" ");
			}
		}
	}
	void removeEdge(int u,int v)
	{
		adj[u].remove(new Integer(v));		//we use new Integer() because, to delete by value we need object.
		adj[v].remove(new Integer(u));
	}
	
}
public class Graph_Representation {
	public static void main(String args[])
	{
	int v=5;
	Graph g= new Graph(v);
	g.addEdge(0, 1); 
	g.addEdge(0, 4); 
	g.addEdge(1, 2); 
	g.addEdge(1, 3); 
	g.addEdge(1, 4); 
	g.addEdge(2, 3); 
	g.addEdge(3, 4); 
	g.printGraph();
	g.removeEdge(1,3);
	System.out.println("\n\nNew Graph");
	g.printGraph();
	}
}

