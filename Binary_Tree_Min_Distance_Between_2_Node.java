class GfG {
    Node LCA(Node root,int a,int b)	//First find the glowest common ancestor. Since we want the minimum distance between 2 node.
    {
        
        if(root == null)
        {
            return null;
        }
        if(root.data==a || root.data== b)
        return root;
        
        Node left=LCA(root.left,a,b);
        Node right=LCA(root.right,a,b);
        
        if(left==null)
        return right;
        
        if(right==null)
        return left;
        
        return root;
    }
    
    int findDistance(Node root,int val,int distance)	//find the distance for each given node from the common ancestor. and return the distance.
    {
        if(root==null)							
        {
            return -1;
        }
        
        if(root.data==val)
        {
            return distance;
        }
        int d1=findDistance(root.left,val,distance+1);
        int d2=findDistance(root.right,val,distance+1);
        
        return Math.max(d1,d2);
        
        
    }
    int findDist(Node root, int a, int b) {	//Given method
        
        if(root==null)
        {
            return -1;
        }
        
        Node lca=LCA(root,a,b);
        
        int d1=findDistance(lca,a,0);
        int d2=findDistance(lca,b,0);
        
        return d1+d2;
    }
}