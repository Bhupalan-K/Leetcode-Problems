package Questions;

public class PalindromeOrNot3 {
	
	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama";
		
		String s1 = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			s1 = s1+s.charAt(i);
		}
		
		boolean isPalindrome = true;
		for(int i=0; i<s.length(); i++) {
			
				if(s.charAt(i) != s1.charAt(i)) {
					isPalindrome = false;
					break;
				}
			}
		
		System.out.println(isPalindrome);
		
		
	}

}
