package Questions;
import java.util.*;
import java.util.Hashtable;

public class HashMaps {

	public static void main(String[] args) {
		
		
		System.out.println("LinkedHashMap");
		Map<Integer, String> lh = new LinkedHashMap<>();
		lh.put(1, "str1");
		lh.put(2, "str2");
		lh.put(3, "str3");
		lh.put(4, "str4");
		
		
		for(int key : lh.keySet()) {
			int k = key;
			String k1 = lh.get(key);
			
			
			System.out.println(k+ " "+k1);
		}
		
        System.out.println("HashMap");
		HashMap<Integer, String> name = new HashMap<>();
		name.put(10, null);
		name.put(7, null);
		name.put(11, "Neymar");
		name.put(8, "kroos");
		System.out.println(name);
		String s="ronaldor9";
		
		System.out.println("HashTable");
		Hashtable<String, Integer> obj = new Hashtable<>();
		obj.put("a", 9);
		obj.put("b", 1);
		obj.put("c", 2);
		obj.put("d", 3);
		
		
		
		//obj.replace("b", 10);
		//System.out.println(obj.remove("d", 3));
		System.out.println(obj);
		
		
		
		
		
		
		
		for(String key : obj.keySet()) {
			System.out.println(obj.get(key));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println(name);
		System.out.println(name.get(10));
		System.out.println(name.containsKey(7));
		System.out.println(name.replace(8, "inesta"));
        System.out.println(name.get(8));
        System.out.println(name.put(11, "vini"));
        System.out.println(name.get(11));*/
		
		for(char c : s.toCharArray()) {
			System.out.print(c);
		}
        
       /* for(Integer key : name.keySet()) {
        	System.out.println(key+name.get(key));
        }*/
        
        //while()
       
		
		
	}

}
