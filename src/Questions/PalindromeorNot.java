package Questions;
import java.util.ArrayList;

public class PalindromeorNot {

	public static void main(String[] args) {
		
		String S = "A man, a plan, a canal: Panama";
		ArrayList<Character> list = new ArrayList<>();
		
		
			boolean ans = true;
			int first = 0;
			int last = S.length()-1;
			while(first <= last) {
			char curval1 = S.charAt(first);
			char curval2 = S.charAt(last);
			if(curval1 == curval2) {
			if(Character.isLetterOrDigit(curval1) && Character.isLetterOrDigit(curval1)){
			   if( Character.toLowerCase(curval1) ==Character.toLowerCase(curval2)) {
				first++;
				last--;
				
			}else {
				ans = false;
				break;
			}
			}else {
				if (!Character.isLetterOrDigit(curval1)) {
                    first++;
			}
				if(!Character.isLetterOrDigit(curval2)) {
					last--;
				   }
			}
		}
	}	
			System.out.println(ans);
		
		
 }
}	
	
