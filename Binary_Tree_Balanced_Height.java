
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
class Height		// A wrapper class used to modify height across recursive calls
{
	int height=0;
}
class BST
{
	Node root;

	
	boolean isBalancedTree()
	{
		Height heightobj=new Height();
		return isBalanced(root,heightobj);
	}
	boolean isBalanced(Node root,Height h)
	{
		if(root==null)		//If tree is empty then return true. Because an empty tree is balanced.
		{
			h.height=0;
			return true;
		}
		Height lheight=new Height();	//creating objects for left height and right height
		Height rheight=new Height();
		
		boolean l=isBalanced(root.left,lheight);
		boolean r=isBalanced(root.right,rheight);
		
		int lh=lheight.height;
		int rh=rheight.height;
		
		if(lh>rh)					//finding height
			h.height=lh+1;
		else
			h.height=rh+1;
		
		if((lh-rh>=2) || (rh-lh>=2))	//If difference between heights of left and right subtrees is more than 2 then this node is not balanced 
			return false;
		else
			return l && r;		
	}

}

public class Binary_Tree_Balanced_Height {
	public static void main(String args[])
	{
			BST tree= new BST();
			tree.root = new Node(1); 
	        tree.root.left = new Node(2); 
	        tree.root.right = new Node(3); 
	        tree.root.left.left = new Node(4); 
	        tree.root.left.right = new Node(5); 
	      //tree.root.right.right = new Node(6); 
	        tree.root.left.left.left = new Node(7); 
	  
	        if (tree.isBalancedTree()) 
	            System.out.println("Tree is balanced"); 
	        else
	            System.out.println("Tree is not balanced");
	}

}
