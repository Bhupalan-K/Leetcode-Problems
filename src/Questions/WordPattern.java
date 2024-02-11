package Questions;
import java.util.HashMap;

public class WordPattern {

	public static void main(String[] args) {
		
		String pattern = "abba", s = "dog cat cat fish";
		answer ans1 = new answer();
		System.out.println(ans1.ans(pattern, s));	
		System.out.println();
	}
}

class answer{
	public static boolean ans(String pattern, String s) {
		
		String[] arr = s.split(" ");
		if(pattern.length() != arr.length) {
			return false;
		}
		//String pattern = "abba", s = "dog cat cat dog";
		HashMap<Character,String> map = new HashMap<>();
		for(int i=0; i<pattern.length(); i++) {
			char c = pattern.charAt(i);
			boolean containsKey = map.containsKey(c);
			if(map.containsValue(arr[i]) && !containsKey) {
				return false;
			}
			if(containsKey && map.get(c).equals(arr[i])) {
				return false;
			}else {
				map.put(c, arr[i]);
			}
		}
		
		return true;
	}
}