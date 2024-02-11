package Questions;

public class ReverseString2 {

	public static void main(String[] args) {
		
		String s = "abcdefg";
		int k = 2;
		
		int a = 0;
		int b = a+1;
		
		for(int i=0; i<s.length(); i++) {
			int var = i;
			int var1 = i+1;
			int temp = s.charAt(var);
			var = s.charAt(var1);
			var1 = temp;	
		}
		
		for(int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}

	}

}
