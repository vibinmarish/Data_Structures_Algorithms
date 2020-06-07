Node lca(Node root, int n1,int n2)
	{
		if(root==null)
		{
		    return null;
		}
		if(root.data==n1 || root.data==n2)	//if the root has any of the node we return the root, because it has the given node.
		return root;
		
		Node left=lca(root.left,n1,n2); 		//Searching the left of the tree to see if it has any of the given node
	
		Node right=lca(root.right,n1,n2);	//Searching the right of the tree to see if it has any of the given node
			
		if(left==null)					// If the left is null we return right to see if it has the nodes
		return right;
		if(right==null)					// If the right is null we return left to see if it has the nodes
		return left;
		
		return root;					//This will excecute when both left and right doesn't have null values.
	}