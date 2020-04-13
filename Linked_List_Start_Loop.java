
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
	void startLoop(Node fastHead)		//We traverse from head and fast pointer. The place where both meet is the start node of loop
	{
		Node temp=head;
		while(true)
		{
			temp=temp.next;
			fastHead=fastHead.next;
			
			if(temp==fastHead)
			{
				System.out.println("Start of loop is: "+ temp.data);
				break;
			}
			
		}
	}
	void loop()			//We use fast and slow pointer. If both the pointer meet at the same node, loop exists.
	{
		Node slow=head;
		Node fast=head;
		
		
		while(true)
		{
			fast=fast.next.next;
			slow=slow.next;
			if(slow==fast)
			{
				System.out.println("YES "+"Both fast and slow meet at "+slow.data+" "+fast.data);
				break;
			}
		}
		startLoop(fast);		//Pass anyone of the pointer as pointerhead for traversal.
	}
}
	
public class Linked_List_Start_Loop {
	public static void main(String args[])
	{
		LinkedList list=new LinkedList();
		list.insert(0);
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.head.next.next.next.next.next.next=list.head.next.next; //creating a loop, 5 to 3.
		list.loop();
		
}

}
