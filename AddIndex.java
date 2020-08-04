package Link_List;

import java.util.LinkedList;

public class AddIndex {
public static void main(String args[])
{

	LinkedList<String> list = new LinkedList<String>();
	list.add("How ");
	list.add("are");
	list.add("?");
	list.add("to");
	list.add("Chocalate");
	System.out.println("The prevoius is :" +list);
	list.add(2,"you");
	list.add(4, "Welcome ");
	System.out.println("The current List is " + list);
	
	
	
	
}
}
/*The prevoius is :[How , are, ?, to, Chocalate]
The current List is [How , are, you, ?, Welcome , to, Chocalate]*/