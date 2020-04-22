package tree6;
import java.util.LinkedList;
import java.util.Queue;


class Node
{
	Node right;
	Node left;
	int data;
	Node(int item)
	{
		right=null;
		left=null;
		data=item;
	}
}
class BST
{
	Node root;
	void insert(int item)
	{
		
		root=insertRec(root,item);
	}
	Node insertRec(Node root,int item)
	{
		if(root==null)
		{
			root=new Node(item);
			return root;
		}
		if(item<root.data)
		{
			root.left=insertRec(root.left,item);
		}
		else if(item>root.data)
		{
			root.right=insertRec(root.right,item);
		}
		return root;
	}
	void right_view()
	{
		right_viewRec(root);
	}
	void right_viewRec(Node root)		//using levelorder traversal and pringing the first node of each level
	{
		Node temp=root;
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(temp);

		while(!queue.isEmpty())
		{
			int n=queue.size();  //find the size of queue
			int i=0;
			
			while(i<n)
			{
			i++;				//increment i
			
			temp=queue.poll();
			if(i==n)			//printing the first node of every level
			System.out.print(temp.data+" ");
			
			if(temp.left!=null) 
			{
			
				queue.add(temp.left);
				
		}
			if(temp.right!=null)
				queue.add(temp.right);
			}
		}
		
	}
}
public class Binary_Tree_Right_View {
	public static void main(String args[])
	{
		BST bst= new BST();
		bst.insert(100);
		bst.insert(20);
		bst.insert(200);
		bst.insert(10);
		bst.insert(30);
		bst.insert(150);
		bst.insert(300);
		bst.insert(15);
		bst.right_view();
	}
}
