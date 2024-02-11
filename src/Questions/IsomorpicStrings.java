package Questions;

import java.util.HashMap;
import java.util.Map;

public class IsomorpicStrings {

	public static void main(String[] args) {
		
		String s = "egg", t = "adb";
		
		Map<Character,Character> map1 = new HashMap<>();
		Map<Character,Character> map2 = new HashMap<>();
		
		char a,b;
		
		for(int i=0; i<s.length(); i++) {
			
			 a = s.charAt(i);
			 b = t.charAt(i);
			 
			if(map1.containsKey(a) && map1.get(a) !=b || map2.containsKey(b) && map2.get(b) !=a) {
				System.out.println(false);
				return;
			}
			map1.put(a, b);
			map2.put(b, a);
		}

      System.out.println(true);
	}

}
