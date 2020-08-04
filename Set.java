package Link_List;
import java.util.*;

public class Set {
public static void main(String args[])
{
	LinkedList<String> list = new LinkedList<String>();
	list.add("Apple");
	list.add("Banana");
	list.add("Grape")
;
	list.add("Kiwi");
	System.out.println(list);
	System.out.println("The object the replace from the list" + list.set(2, "PineApple"));
	System.out.println("The object that repalce from the list "  +list.set(3, "Orange"));
	System.out.println(list);
	
	}
}
