package Link_List;
import java.util.*;

public class AllAllEnd1 {
	public static void main(String args[])
	{
		LinkedList<String> list = new LinkedList<String>();
		list.add("Welcome");
		list.add("to");
		list.add("edureka");
		Collection<String> collect =  new ArrayList<String>();
		collect.add("An");
		collect.add("Online");
		collect.add("Technology");
		collect.add("Training");
		collect.add("Center");
		System.out.println("The linList before appending collection is" +list);
		list.addAll(collect);
		System.out.println("The LinkedList ater colection is " +list);
		
		
		
	}

}
