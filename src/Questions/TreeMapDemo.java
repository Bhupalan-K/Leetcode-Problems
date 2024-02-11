package Questions;
import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> map = new TreeMap<>(Comparator.reverseOrder());
		map.put("d",1);
		map.put("c",1);
		map.put("a",3);
		map.put("b",4);
		
		System.out.println(map);
		
		/*for(String key: map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
		
		map.forEach((a,b)-> System.out.println(a+" "+b));*/
		
	}

}
