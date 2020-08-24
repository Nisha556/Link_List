package Link_List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
public class Linkedlistremove {
 public static void main
 (String args[])
 {
	 LinkedList<String> list = new LinkedList<String>();
	 list.add("Welcome");
	 list.add("to");
	 list.add("World");
	 list.add("programming");
	 System.out.println("The  value of list present in the list" +list);
	 list.remove(2);
	 System.out.println("After removing  the data" +list);
 }
}
