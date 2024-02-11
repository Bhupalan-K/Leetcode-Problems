package Questions;

public class StringToInteger {

	public static void main(String[] args) {
		
		String s = " -42";
		int value = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) != ' ') {
				 value = Integer.parseInt(s);
			}
		}
		
		
		
		System.out.println(value);

	}

}
