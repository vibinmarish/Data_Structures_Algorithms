package Sample;

class Node
{
	int data;
	Node next;
}
class LinkedList
{
	Node head;
	void insert(int data)
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
	void reverse()
	{
		Node prevPtr=null;
		Node currPtr=head,nextPtr=head;
		while(nextPtr!=null)
		{
			nextPtr=nextPtr.next;		//Move the next pointer
			
			currPtr.next=prevPtr;		//Assign previous pointer to current pointer's next
			
			prevPtr=currPtr;			//Assign current pointer to previous pointer
			
			currPtr=nextPtr;			//Assign next pointer to current pointer
			
		}
		head=prevPtr;
			
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
public class Reverse_Linked_List {
	public static void main(String args[])
	{
		LinkedList list=new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.show();
		list.reverse();
		list.show();

}
}
