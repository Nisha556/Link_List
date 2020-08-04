package Link_List;
import java.util.*;

public class AddAllEnd {
 public static void main(String rags[])
 {
	 LinkedList<String> list =  new LinkedList<String>
();
	 list.add("Welcome");
	 list.add("to");
	 list.add("Edureka");
	 Collection<String> collect = new ArrayList<String>();
	 collect.add("An");
	 collect.add("Online");
	 collect.add("Techonology");
	 collect.add("center");
	 System.out.println("The LinkList before appending collection is :" +list);
	 list.addAll(collect);
	 System.out.println("The LinkedList after appending collection" +list);
	 
	 
	 
	 }
}
