package Link_List;

import java.util.LinkedList;

public class OfferLast {
public static void main(String args[])
{
	LinkedList<Comparable> list = new LinkedList<Comparable>();
	list.add("Welcome");
	list.add("to");
	list.add("Java");
	list.add("World");
	System.out.println("List before order of " + list);
	list.offerLast("Jaguar");
	System.out.println("List afet order of" + list);
}
}
