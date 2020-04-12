class Node
{
	int data;
	Node next;
}
class LinkedListClass
{
	Node head;
	
	void insert(int data)
	{
		Node newnode = new Node();
		newnode.data=data;
		
	if(head==null)
	{
		head=newnode;
	}
	else
	{
		Node temp = head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newnode;
	}
	}
	
	void insertAt(int pos,int data)
	{
		Node newnode = new Node();
		newnode.data=data;
		Node temp=head;
		int i=1;
		
		while(i<pos-1)
		{
			temp=temp.next;
			i++;
		}
		newnode.next=temp.next;
		temp.next=newnode;
		
	}
	void insertAtEnd(int data)
	{
		Node newnode= new Node();
		newnode.data=data;
		Node temp;
		temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newnode;
	}
	void insertAtStart(int data)
	{
		Node newnode = new Node();
		newnode.data=data;
		newnode.next=head;
		head=newnode;
	}
	void deleteEnd()
	{
		Node temp=head;
		Node temp1=null;
		while(temp.next!=null)
		{
			temp1=temp;			//previous node
			temp=temp.next;
		}
		temp1.next=null; 
	}
	void deleteData(int element)
	{
		Node temp=head;
		int i=1;
		if(head.data==element)
		{
		head=head.next;
		return;
		}
		while(temp.next.data!=element && temp.next!=null)
		{	i++;
			temp=temp.next;
		}
		
		if(temp==null || temp.next==null)
		{
			return;
		}

		Node temp1;
		temp1=temp.next;
		temp.next=temp1.next;
		
	}
	void deleteAt(int pos)
	{
		if(pos==1)
		{
			head=head.next;
			return;
		}
		if(head==null)
			return;
		
		Node temp=head;
		int i=1;
		while(i<pos-1 && temp.next!=null) //traversal till the previous node
		{
			i++;
			temp=temp.next;
		}
		if(temp==null || temp.next==null)
			return;
		
		Node temp1;
		temp1=temp.next;
		temp.next=temp1.next;
		
	}
	void search(int element)
	{
		Node temp=head;
		int i=1;
		boolean flag=false;
		while(temp!=null)
		{
			
			if(temp.data==element)
			{
				flag=true;
				System.out.println("Found at node:"+i);
				break;
			}
			i++;
			temp=temp.next;
		}
		if(flag==false)
		{
			System.out.println("Element Doesn't Exist !");
		}
	}
	void length()
	{
		Node temp=head;
		int i=0;
		while(temp!=null)
		{
			i++;
			temp=temp.next;
		}
		System.out.println("Length:"+i);
	}
	void swapNode(int x,int y)
	{
		if(x==y)
			return;
		
		Node currX=head;
		Node prevX=null;
		int i=1;
		
		while(currX!=null && i!=x)
		{
			prevX=currX;
			currX=currX.next;
			i++;
		}
		
		Node currY=head;
		Node prevY=null;
		int j=1;
		
		while(currY!=null && j!=y)
		{
			prevY=currY;
			currY=currY.next;
			j++;
		}
		
		if(currX==null || currY==null)
		{
			return;
		}
							//first deal with previous node then move to the next_current node
		
		if(prevX!=null)		//checking if it not a starting node
		{
			prevX.next=currY;
		}
		else				//it is a head node
			head=currY;
		
		if(prevY!=null)
		{
			prevY.next=currX;
		}
		else
			head=currX;
		
		Node temp=currY.next;
		currY.next=currX.next;
		currX.next=temp;
	}
	
	void show()
	{
		Node temp=head;
		System.out.println();
		while(temp!=null)
		{
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println();
	}
}

public class Linked_List {
	public static void main(String args[])
	{
		LinkedListClass list=new LinkedListClass();
		list.insert(10);
		list.insert(50);
		list.insert(20);
		list.insert(80);
		list.insert(120);
		list.insertAt(3,400);
		list.insertAtEnd(69);
		list.insertAtStart(99);
		System.out.println("Linked List");
		list.show();
		list.deleteEnd();
		list.deleteData(400);
		list.show();
		list.deleteAt(1);
		list.show();
		list.search(20);
		list.length();
		list.swapNode(1,5);
		list.show();
		
	}
}

