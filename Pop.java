package Link_List;
import java.util.*;

public class Pop {

	public static void main(String args[])
	{
		LinkedList<String> stack = new LinkedList<>();
		stack.push("A");
		stack.push("B");
		String s = stack.pop();
		System.out.println(s);
		stack.push("C");
		System.out.println(stack);
	}
}
