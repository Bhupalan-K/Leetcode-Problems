package Questions;
import java.util.*;

public class ValidPharanthesis {
	String s="()";
	public  boolean isValid(String input) {
		
		
		Stack<Character> stack = new Stack<>();
		
		for(char c:input.toCharArray()) {
			if(c == '(')
			 stack.push(')');
			else if(c == '{')
			 stack.push('}');
			else if(c == '[')
			 stack.push(']');
			else if(stack.isEmpty() || stack.pop() !=c)
				
				return false;		
		}
		return stack.isEmpty();
	}

}
