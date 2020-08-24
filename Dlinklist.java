package Link_List;
import java.util.*;
import java.io.*;
import Link_List.DLL.Node;
public class Dlinklist {
public static void main(String args[])
{
	// Node node = null;
	Node nodeA= new Node(6);
	//Node nodeA = new Node(6);
	Node nodeB= new Node(3);
	Node nodeC = new Node(4);
	//Node nodeC= new Node(4);
	Node nodeD =new Node(2);
	Node nodeE = new Node(1);
	
	//node.next= nodeA;
	nodeA.next = nodeB;
	nodeB.next = nodeC;
	nodeC.next = nodeD;
	nodeD.next = nodeE;
	System.out.println("This linked list's lenght is :(should print 5)");
	System.out.println(countNodes(nodeA));
	
	
}
static int countNodes(Node head)
{
	int count = 1;
	Node node = head;
	while(node.next != null)
	{
		node = node.next;
		count +=1;
		
	}
	return count;
	
}
class Node {
	int data;
	Node next;
	Node(int data)
	{
		this.data= data;
	}
}
}
