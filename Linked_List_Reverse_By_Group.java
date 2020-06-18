public static Node reverse(Node node, int k)
    {
        int len=0;
        Node prev=null;
        Node curr=node;
        Node nxt=node;
        while(nxt!=null&&len<k)
        {
            len++;
            nxt=nxt.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        if(nxt!=null)
        {
            node.next=reverse(nxt,k);
        }
        
        return prev;
