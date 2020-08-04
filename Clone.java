package Link_List;
import java.util.*;

public class Clone {
public static void main(String args[])
{
	LinkedList<String> list = new LinkedList<String>();
	list.add("Example of");
	list.add("Clone");
	list.add("Method");
System.out.println("First element :" + list);
LinkedList<String> sec_list = new LinkedList<String>();
sec_list = (LinkedList<String>) list.clone();
System.out.println("Second link list " + sec_list);
	
}
}
