package Questions;

public class LongestSubString {

	public static void main(String[] args) {
		
		String s = "abcabcbb";
       
		for(int i=0; i<s.length(); i++) {
			for(int j=i; j>s.length()-1; j--) {
				
				char c1 = s.charAt(0);
				char c2 = s.charAt(j);
				
				if(c1 == c2) {
					System.out.println(c1);
				}
				i++;
				j++;
				
			}
		
		}
		
	}

}
