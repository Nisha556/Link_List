package Link_List;
import java.util.*;

public class pop {
public static void main(String args[])
{
	LinkedList<Integer> stack = new LinkedList<>();
stack.push(300);
stack.push(400);
stack.push(500);
stack.push(800);
System.out.println(stack);
Integer i = stack.pop();
System.out.println(i);

}
}
