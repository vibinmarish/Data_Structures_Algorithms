
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
	void merge(Node l1, Node l2)
	{
		Node dummy = new Node();		//New dummy node to link sorted nodes
		Node curr=dummy;				// current pointer to point dummy nodes
		
		while(true)
		{
			if(l1==null)			//if one list is smaller than the other we link the curr to the other list
			{
				curr.next=l2;
				break;
			}
			if(l2==null)
			{
				curr.next=l1;
				break;
			}
			
			if(l1.data<=l2.data)		//checking which list has the smallest value
			{
				curr.next=l1;		//we store list with the lowest value to the current pointer's next and then move to list to next node
				l1=l1.next;
			}
			else
			{
				curr.next=l2;
				l2=l2.next;
			}
			curr=curr.next;		//moving curr node to the next node
		}
		head=dummy.next;		//we store dummy.next because the data of the first node will be null. So we start from the next.
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
public class Merge_Two_Linked_List {
	public static void main(String args[])
	{
		LinkedList list=new LinkedList();
		LinkedList list2=new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(60);
		list.insert(90);
		list.insert(100);
		list.show();
		list2.insert(30);
		list2.insert(50);
		list2.insert(70);
		list2.show();
		list.merge(list.head,list2.head);
		list.show();
}
}
