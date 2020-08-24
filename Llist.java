package Link_List;
import java.util.*;

import Link_List.Dlinklist.Node;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Llist {
public static void main(String args[])
{
	//Node nodeA = new Node();
	Node head = new Node();
	Node nodeA = new Node(6);
	Node nodeB = new Node(2);
	Node nodeC = new Node(3);
	Node nodeD= new Node(1);
	head.next= nodeA;
	nodeA.next = nodeB;
	nodeB.next = nodeC;
	nodeC.next = nodeD;
	System.out.println("This linked list's lenght is :(should print 5)");
	System.out.println(countNodes(nodeA));
	
	
}
static int countNodes(Node node)
{
	int count = 1;
	Node current = node;
	while(current.next != null)
	{
		current = current.next;
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
