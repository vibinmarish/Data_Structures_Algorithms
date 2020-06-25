package graph;
import java.util.*;

class Graph
{
	int vertex;
	LinkedList<Integer>[] adj;
	Graph(int v)
	{
		vertex=v;
	adj=new LinkedList[vertex];
	for(int i=0;i<adj.length;i++)
	{
		adj[i]=new LinkedList<Integer>();
	}
	}
	void addEdge(int u,int v)
	{
		adj[u].add(v);
	}
	void dfs(int s)
	{
		Stack<Integer> stack=new Stack<>();
		Vector<Boolean> visited = new Vector<Boolean>(vertex);
		for(int i=0;i<vertex;i++)
			visited.add(false);
		stack.push(s);
		while(stack.empty()==false)
		{
			s=stack.peek();
			stack.pop();
			if(visited.get(s)==false)
			{
				System.out.print(s+" ");
				visited.set(s, true);
			}
			
			Iterator<Integer> itr=adj[s].iterator();
			while(itr.hasNext())
			{
				s =itr.next();
				if(!visited.get(s))
				stack.push(s);
			}
			
		}
	}
}
public class Graph_DFS {
	public static void main(String args[])
	{
	int v=4;
	Graph g= new Graph(v);
	g.addEdge(0, 1); 
    g.addEdge(0, 2); 
    g.addEdge(1, 2); 
    g.addEdge(2, 0); 
    g.addEdge(2, 3); 
    g.addEdge(3, 3); 
	g.dfs(2);
	}
}
//Recursive method

class Traversal
{   
    static void dfs(ArrayList<ArrayList<Integer>> g,int start,boolean visited[])
    {
        visited[start]=true;
        System.out.print(start+" ");
        for(Integer i:g.get(start))
        {
            if(!visited[i])
            dfs(g,i,visited,list);
        }
    }
    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> g, int N)
    {
         boolean visited[]=new boolean[N];
    	dfs(g,0,visited);	//starting from 0 node
     	return list;
    }
    
}
