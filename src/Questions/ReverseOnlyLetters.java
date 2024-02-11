package Questions;
import java.util.Stack;

public class ReverseOnlyLetters {

	public static void main(String[] args) {
		
		//String s= "ab-cd";
		 String s= "j-Ih-gfE-dCba";
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			if(Character.isLetter(s.charAt(i))) {
				stack.push(s.charAt(i));
			}
		}
		
		StringBuilder letters = new StringBuilder();
		
		for(int j=0; j<s.length(); j++) {
			if(Character.isLetter(s.charAt(j))) {
				letters.append(stack.pop());
			}else {
				letters.append(s.charAt(j));
			}
		}
		
		System.out.println(letters.toString());
		

	}

}
