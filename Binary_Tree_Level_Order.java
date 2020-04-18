
import java.util.*;

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
	void levelorder()
	{
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(root);							//enqueue the root
		while(!queue.isEmpty())						//check if the queue is empty
		{
			Node temp=queue.poll();					//dequeue the queue and assign the value in a temp pointer
			System.out.print(temp.data+" ");		//print the data;
			
			if(temp.left!=null)						//if left is not null enqueue
				queue.add(temp.left);
			if(temp.right!=null)					//if right is not null enqueue
				queue.add(temp.right);
			
		}
		
		
	}
}
public class Binary_Tree_Level_Order {
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
		
		bst.levelorder();
	}
}
