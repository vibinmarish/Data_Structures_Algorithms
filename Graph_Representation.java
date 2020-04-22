package Graph_Representation;

import java.util.*;

public class Graph_Representation {
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
	{
		adj.get(u).add(v);		//get() will get the initial list add() will append values in the nested arraylist 
		adj.get(v).add(u);
	}

	static void printGraph(ArrayList<ArrayList<Integer>> adj)
	{
		for (int i = 0; i < adj.size(); i++)
		{
			System.out.println("\nAdjacency Vertex "+i);
			for (int j=0; j < adj.get(i).size(); j++)		//adj.get(i).size() this will get the size of the nested arraylist
			{
				System.out.print(adj.get(i).get(j)+" ");
			}
		}
	}
	static void removeEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
	{
		adj.get(u).remove(new Integer(v));		//we use new Integer() because, to delete by value in arraylist we need object.
		adj.get(v).remove(new Integer(u));
	}

public static void main(String args[])
{
	int vertex=5;
ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(vertex);	//We use arraylist within an arraylist for maintaining adjacency list
for(int i=0;i<vertex;i++)
{
	adj.add(new ArrayList<Integer>());		//we did not create object for the nested arraylist above
}

addEdge(adj, 0, 1); 
addEdge(adj, 0, 4); 
addEdge(adj, 1, 2); 
addEdge(adj, 1, 3); 
addEdge(adj, 1, 4); 
addEdge(adj, 2, 3); 
addEdge(adj, 3, 4); 
printGraph(adj);
removeEdge(adj,1,3);
System.out.println("\n\nNew Graph");
printGraph(adj);
}
}

