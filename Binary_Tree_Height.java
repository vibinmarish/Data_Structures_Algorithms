
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
	void inorder()
	{
		
		inorderRec(root);
	}
	void inorderRec(Node root)
	{	if(root!=null)
	{
		inorderRec(root.left);
		System.out.print(root.data+" ");
		inorderRec(root.right);
	}
	}
	int getHeight()		//height of empty tree is 0. 
	{
		return getHeightRec(root);
	}
	int getHeightRec(Node root)
	{
		if(root==null)
			return 0;
		int l=getHeightRec(root.left);
		int r=getHeightRec(root.right);
		
		if(l>r)
			return l+1;
		else
			return r+1;
	}
}
public class Binary_Tree_Height {
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
		
		bst.inorder();
		System.out.print("\n"+bst.getHeight());
	}
}
