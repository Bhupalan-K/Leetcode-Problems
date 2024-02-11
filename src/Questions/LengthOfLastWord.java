package Questions;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s = "Hello World ";
          int t = 0;
          boolean start = false;
		for(int i=s.length()-1; i>=0; i--) {
			 if(!Character.isWhitespace(s.charAt(i))) {
				 start = true;
				 t++; 
			 }else if(start) {
				break;
			 }	 
		  } 
			System.out.println(t);
		}
		
	}


