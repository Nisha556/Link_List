package Link_List;

public class DllSearching {
class Node {
	int data;
	Node previous;
	Node next;
	public Node(int data) {
		this.data= data;
		
	}
}
Node head, tail = null;
public void addNode(int data)
{
	Node newNode = new Node(data);
	if(head==null)
	{
		head = tail=newNode;
		head.previous = null;
		tail.next=null;
	}
	else {
		tail.next = newNode;
		newNode.previous  = tail;
		tail = newNode;
		tail.next= null;
		
		
	}
}
public void searchNode(int value)
{
	int  i = 1;
	boolean flag = false;
	Node current = head;
	if(head==null)
	{
		System.out.println("List is empty");
		return;
		
	}
	while(current != null)
	{
		if(current.data==value)
		{
			flag = true;
			break;
			
		}
		current = current.next;
		i++;
		
	}
	if(flag)
		System.out.println("Node is present in the list");
	else
		System.out.println("Node is not present in the node");
	
}
public static void main(String args[])
{
	
	DllSearching dList = new DllSearching();
	
	
	dList.addNode(1);
	dList.addNode(5);
	dList.addNode(4);
	dList.addNode(2);
	dList.addNode(3);
	dList.searchNode(4);
	dList.searchNode(9);
	
}
}
