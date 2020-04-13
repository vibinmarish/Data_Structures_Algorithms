
class Node
{
	char data;
	Node next;
}
class LinkedList
{
	Node head;
	void insert(char data)
	{
		Node newNode=new Node();
		newNode.data=data;
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	Node reverse(Node rhead)
	{
		Node prev=null;
		Node curr=rhead;
		Node nextptr=rhead;
		
		while(nextptr!=null)
		{
			nextptr=nextptr.next;
			curr.next=prev;
			prev=curr;
			curr=nextptr;
		}
		return prev;
	}
	void palindrome()
	{
		Node slow=head;
		Node fast=head;
		Node mid;
		while(true)
		{
			fast=fast.next.next;
			if(fast==null)			//This condition is true if the list is even
			{
				mid=slow.next;		
				break;
			}
			else if(fast.next==null) 
			{
				mid=slow.next.next;		//If it is odd list. we don't have to check the middle node, so we skip it.
				break;
			}
			slow=slow.next;
		}
		slow.next=null;				//we basically divide the list into two. We assign null to end the first list.
		Node leftSide= head;
		Node rightSide=reverse(mid);
		
		boolean flag=true;
			
		while(rightSide!=null && leftSide!=null)
		{
			if(rightSide.data!=leftSide.data)
			{
				flag=false;
				break;
			}

			rightSide=rightSide.next;
			leftSide=leftSide.next;
			
		}
		if(flag==true)
			System.out.println("It Is A Palindrome");
		else
			System.out.println("It Is Not A Palindrome");
		
	}
	void show()
	{
		Node temp=head;
	
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		
	}
}
public class Linked_List_Palindrome {
	public static void main(String args[])
	{
	LinkedList list=new LinkedList();
	LinkedList list2=new LinkedList();
	list.insert('a');
	list.insert('b');
	list.insert('b');
	list.insert('a');
	//list.insert('x');

	list.show();
	list.palindrome();
}
}
