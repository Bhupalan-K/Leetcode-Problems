package Questions;
import java.util.Map;
import java.util.TreeMap;

public class ShuffelString {

	public static void main(String[] args) {
		
		String s = "codeleet";
		int indices[] = {4,5,6,7,0,2,1,3};
		StringBuilder ans = new StringBuilder();
		
		
		TreeMap<Integer, String> map = new TreeMap<>();
		
		for(int i=0; i<indices.length && i<s.length(); i++) {
			map.put(indices[i],Character.toString(s.charAt(i)));		
		}
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			ans.append(entry.getValue());
		
		}
		
		System.out.println(ans.toString());

	}

}
