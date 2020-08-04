package Link_List;
import java.util.*;

public class ClearMethod {
public static void main(String args[])
{
	LinkedList<String> list = new LinkedList<String>();
	list.add("Edureka");
	list.add("Online");
	list.add("Training");
	list.add("Class");
	System.out.println("LinkedList before clearing" +list);
	list.clear();
	System.out.println("List After clearing");
	
	list.add("New");
	list.add("class");
	list.add("Start");
	list.add("from");
	list.add("14");
	System.out.println("After adding new element" +list);
	
}
}
