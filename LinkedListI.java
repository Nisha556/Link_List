package Link_List;
import java.util.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListI {
public static void main(String args[])
{
	LinkedList<String> list = new LinkedList<String>();
	list.add("Steve");
	list.add("Car1");
	list.add("Raj");
	list.addFirst("Negan");
	list.addLast("Rick");
	list.add(2, "Glenn");
	System.out.println("print the value of list" +list);
	
	
}
}
