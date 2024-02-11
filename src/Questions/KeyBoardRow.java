package Questions;
import java.util.HashMap;

public class KeyBoardRow {

	public static void main(String[] args) {
		
		String s1 = "qwertyuiop";
		String s2 = "asdfghjkl";
		String s3 = "zxcvbnm";
		//"Peace"
	    String words[] = {"Hello","Alaska","Dad","peace"};
	    String answord[] = new String[words.length];
	
		int count = 0;

        for (String word : words) {
            boolean row1 = true, row2 = true, row3 = true;
            for (char c : word.toCharArray()) {
                if (!s1.contains(Character.toString(Character.toLowerCase(c))))
                    row1 = false;
                if (!s2.contains(Character.toString(Character.toLowerCase(c))))
                    row2 = false;
                if (!s3.contains(Character.toString(Character.toLowerCase(c))))
                    row3 = false;
            }
            if (row1 || row2 || row3) {
                answord[count++] = word;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(answord[i]);
		
        }	
  }
}
