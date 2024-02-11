package Questions;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {
		
		HashMaps H1 = new HashMaps();
		
		
		System.out.println("In general set remove all duplicates");
		System.out.println(H1);

		Set<String> demo0 = new HashSet();
		
				
		
		Set<String> demo = new HashSet();
		demo.add("stu");
		demo.add("abc");
		demo.add("def");
		demo.add("ghi");
		demo.add("jkl");
		demo.add("mno");
		demo.add("pqr");
		
		System.out.println(demo);
		
		demo.remove("abc");
		
		System.out.println(demo);
		
		demo.remove("jkl");
		
		for(String e : demo) {
			System.out.println(e);
		}
		
		System.out.println("In hashset the order did not maintained");
		
		Set<Integer> demo1 = new LinkedHashSet();
		
		demo1.add(0);
		demo1.add(1);
		demo1.add(4);
		demo1.add(6);
		demo1.add(2);
		demo1.add(0);
		demo1.add(2);
		
     System.out.println(demo1);
     System.out.println("In linkedhashset insertion order is maintained");
     
     
     Set<Integer> demo2 = new TreeSet();
     demo2.add(6);
     demo2.add(10);
     demo2.add(3);
     demo2.add(2);
     demo2.add(1);
     demo2.add(5);
     demo2.add(8);
     
     System.out.println(demo2);
     
     System.out.println("In treeset all items are sorted");
     
     
     
     
	}

}
