// First we do inorder to get a sorted list
//Second we construct a BST using divide and conquer (like Binary Search)

class BST
{   Node inorder(Node root,ArrayList <Integer> list)
    {
        if(root==null)
        {
            return null;
        }
        
        root.left=inorder(root.left,list);
        list.add(root.data);
        root.right=inorder(root.right,list);
        
        return root;
    }
    Node toBST(ArrayList<Integer> list,int left, int right)		//similar to binary search
    {
        if(left>right)
        return null;
        
        int mid=left+(right-left)/2;							//finding the middel element since in inorder traversal mid in the root
        Node root=new Node(list.get(mid));					//creating a new tree root node
        
        root.left=toBST(list,left,mid-1);						//recursively storing the left of the list to left of the tree
        root.right=toBST(list,mid+1,right);					//recursively storing the right of the list to right of the tree
        
        return root;
    }
    
    Node buildBalancedTree(Node root) 
    {
        if(root==null)
        {
            return null;
        }
        
        ArrayList<Integer> list=new ArrayList<Integer>();	//list to store the inorder traversal
        inorder(root,list);								
        return toBST(list,0,list.size()-1);					//caling method to create a BST from sorted array
        
    }
}