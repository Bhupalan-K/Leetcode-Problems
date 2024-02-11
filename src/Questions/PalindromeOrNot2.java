package Questions;

public class PalindromeOrNot2 {

	public static void main(String[] args) {
		
		String s ="0 man, a plan, a canal: Panam0";
		StringBuilder s1 = new StringBuilder();
		
		for(int i=0; i<s.length(); i++) {
			if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
				s1.append(s.charAt(i));		
			}
		}
          int left = 0;
          int right = s1.length()-1;
          boolean isPalindrome = true;
          
          while(left < right) {
        	  if(Character.toLowerCase(s1.charAt(left)) == Character.toLowerCase(s1.charAt(right))) {
        		  left++;
        		  right--; 
        	  }else  {
        		 isPalindrome = false;
        		 break;
        	  }
          }
          System.out.println("Answer = "+isPalindrome); 
	}

}
