package Link_List;
import java.util.*;

public class ArrayList {
public static void amin(String ags[])
{
	String[] course = {"java" ,"php", "c","pyton"};
	List<String> courseList = new LinkedList<>();
	for(String s : course)
	{
		courseList.add(s);
		
	}
	System.out.println(courseList);
	
}
}
