package Questions;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MostCommonWord {

	public static void main(String[] args) {
		
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String banned[] = {"hit"};
		
		List<String> s = new ArrayList<>();
		
		String word = "";
		for(int i=0; i<paragraph.length(); i++) {
			if(Character.isLetterOrDigit(paragraph.charAt(i))) {
				 word = word.toLowerCase() + paragraph.charAt(i);
				 
				 i++;
			}else if(i == paragraph.length() - 1 || !Character.isLetterOrDigit(paragraph.charAt(i + 1))){
				s.add(word.toLowerCase());
				word = "";
			}
		}
		int max = 0, min = 0;
		String ans = "";
		 for(String w : s) {
		if(!Arrays.asList(banned).contains(w)) {
            if(s.indexOf(w) == s.lastIndexOf(w)) {
                int count = s.lastIndexOf(w) - s.indexOf(w) + 1;
                if(count > max) {
                    max = count;
                    ans = w;
                }
            }
        }
    }
		 System.out.println(ans);
		}
        
	}


