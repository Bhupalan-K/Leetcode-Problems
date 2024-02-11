package Questions;
import java.util.*;
import java.util.Arrays;

public class Anagram {
                                                                          
	public static void main(String[] args) {
		
		String  s = "anagram", t = "nagaram";
		
		char [] sA = s.toCharArray();
		char [] tA = t.toCharArray();
		
		Arrays.sort(sA);
		Arrays.sort(tA);
		String sort1 = new String(sA);
		String sort2 = new String(tA);
		
			System.out.println(sort1.equals(sort2));
		}
	}


