package Link_List;
import java.util.*;

public class Remove {
public static void main(String args[])
{
	LinkedList<String> list = new LinkedList<String>();
	list.add("Apple");
	list.add("Banana")
;
	list.add("Kiwi");
	list.add("Grape");
	System.out.println(list);
	list.remove();
	System.out.println("After removing the list item" + list);
	}
}
