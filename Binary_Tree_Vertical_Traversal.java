class BinaryTree
{   //  IMP:  SIMILAR TO BOTTOM VIEW OF A TREE.
    //Difference is here we print every element of a hd(level) instead of printing only the bottom node.
    //So we use ArrayList to store all the nodes at a hd.
    static class pair{
        int hd;
        Node node;
        
        pair(int hd , Node node)
        {
            this.hd=hd;
            this.node=node;
        }
    }
    static void verticalOrder(Node root)
    {
        TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(0,root));
        
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                pair p = q.remove();
                int hd = p.hd;
                Node temp = p.node;
                
                if(!map.containsKey(hd)) //If map doesnt key ,create a new arraylist.
                {
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(temp.data); //put data in arraylist.
                    map.put(hd,al); //Put the arraylist in map.
                }
                
                else //map contains key,so simply get existing arraylist and add the data to it.
                 map.get(hd).add(temp.data);
                 
                 
                 if(temp.left!=null) 
                    q.add(new pair(hd-1,temp.left));
                    
                 if(temp.right!=null)
                    q.add(new pair(hd+1,temp.right));
                    
            }
        }
        
        for(Map.Entry e : map.entrySet())
        { //Each value is an arraylist.
          ArrayList li = (ArrayList)e.getValue();  //save it into an arraylist.
          for(int i =0;i<li.size();i++)
            System.out.print(li.get(i)+" ");
        }
    }
}