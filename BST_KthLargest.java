class Tree
{   int i=0,kLarge=0;
    public void inorder(Node root,int K)
    {
        if(root==null)
        return;
        
        inorder(root.right,K);
        if(++i==K)
        {
            kLarge=root.data;
            return;
        }
        inorder(root.left,K);
    }
    public int kthLargest(Node root,int K)
    {
        
        inorder(root,K);
        
        return kLarge;
    }
}