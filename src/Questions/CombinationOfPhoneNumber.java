package Questions;
import java.util.Scanner;

public class CombinationOfPhoneNumber {
	
	static String []keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		possiblewords(s, "");	
		
	}

 static void possiblewords(String s, String ans){
	
	  if(s.length() == 0) {
		  System.out.println(ans);
		  return;
	  }
	  
	  String key = keypad[s.charAt(0) - '0'];
	  for(int i=0; i<s.length(); i++) {
		  possiblewords(s.substring(1), ans + key.charAt(i));
	  }
  }

}