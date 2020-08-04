package Link_List;
import java.util.*;

public class AddAllHead {
 public static void main(String args[])
 {
	 LinkedList<String> list = new LinkedList<String>();
	 list.add("Welcome");
	 list.add("edreka");
	 Collection<String> collect =  new ArrayList<String>();
	 collect.add("to");
	 collect.add("The");
	 collect.add("post");
	 collect.add("popular");
	 collect.add("Online");
	 collect.add("Technology");
	 collect.add("center");
	 System.out.println("the LinkList is " +list);
	 list.addAll(1,collect);
	 System.out.println("The new linked list is : " +list);
	 
	 
 }
}
