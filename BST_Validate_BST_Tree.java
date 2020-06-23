
public class Tree
{
    // return true if the given tree is a BST, else return false
    boolean isBST(Node root)
        {   
            return validate(root,null,null);
        }
        public boolean validate(Node root,Integer min,Integer max)
        {
            if(root==null)
            return true;
            
            if((min!=null &&root.data<=min) || (max!=null&&root.data>max))	//condition to check if it is BST.
            return false;
            
            return validate(root.left,min,root.data) && validate(root.right,root.data,max);	//In root.left we have to keep min as min and max as root.data so that left side does not cross the upper bound since the left of BST is always smaller that the root
        }
}