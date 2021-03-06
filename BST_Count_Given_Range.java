public static int getCountOfNode(Node root,int l, int h)
{
    if(root==null)
    return 0;
    
    if(root.data>=l && root.data<=h)
    return 1+ getCountOfNode(root.left,l,h)+getCountOfNode(root.right,l,h);
    
    if(root.data<l)     
        return getCountOfNode(root.right,l,h);  //Going to the right side because the all the node in left is less than the given range in BST.
    else
    return getCountOfNode(root.left,l,h);
}
