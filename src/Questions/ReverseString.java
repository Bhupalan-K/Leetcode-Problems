package Questions;
import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		
		String s[] = {"h","e","l","l","o"};
		
		/*for(int i = s.length-1 ; i>=0; i--) {
			char cs = s[i].charAt(0);
			System.out.println(cs);
		}*/
		
		Stack<String> s2 = new Stack<>();
		
		for(String s1 : s) {
			//System.out.println(s1);
			
			s2.push(s1);
			
		}
		for(String s3 : s2) {
			System.out.println();
		}
		
	
	}

}
