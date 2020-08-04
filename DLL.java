package Link_List;

public class DLL {
Node head;
class Node {
	int data;
	Node prev;
	Node next;
	Node(int d)
	{
		data =d;
		
	}
}
public void push(int new_data) {
	Node new_Node = head;
	new_Node.prev =null;
	if(head !=null)
		new_Node.prev = new_Node;
	head = new_Node;
	
	
	
}
public void InsertAfter(Node prev_Node, int new_data)
{
	if(prev_Node == null)
	{
		System.out.println("The given previous node cannot");
	return;
	
	}
	Node new_node = new Node(new_data);
	new_node.next = prev_Node.next;
	prev_Node.next = new_node;
	new_node.prev = prev_Node;
	
	if(new_node.next !=null)
	
		new_node.next.prev = new_node;
}
	void append(int new_data)
	{
		Node new_node = new Node(new_data);
		Node last =head;
		new_node.next = null;
		if(head == null)
		{
			new_node.prev = null;
			head = new_node;
			return;
			
	}
		while(last.next !=null)
			last = last.next;
		last.next = new_node;
		new_node.prev = last;
		
}
	public void printlist(Node node) 
    { 
        Node last = null; 
        System.out.println("Traversal in forward Direction"); 
        while (node != null) { 
            System.out.print(node.data + " "); 
            last = node; 
            node = node.next; 
        } 
        System.out.println(); 
        System.out.println("Traversal in reverse direction"); 
        while (last != null) { 
            System.out.print(last.data + " "); 
            last = last.prev; 
        } 
    } 
  
    /* Driver program to test above functions*/
    public static void main(String[] args) 
    { 
        /* Start with the empty list */
        DLL dll = new DLL(); 
  
        // Insert 6. So linked list becomes 6->NULL 
        dll.append(6); 
  
        // Insert 7 at the beginning. So linked list becomes 7->6->NULL 
        dll.push(7); 
  
        // Insert 1 at the beginning. So linked list becomes 1->7->6->NULL 
        dll.push(1); 
  
        // Insert 4 at the end. So linked list becomes 1->7->6->4->NULL 
        dll.append(4); 
  
        // Insert 8, after 7. So linked list becomes 1->7->8->6->4->NULL 
        dll.InsertAfter(dll.head.next, 8); 
  
        System.out.println("Created DLL is: "); 
        dll.printlist(dll.head); 
    } 
} 
 
