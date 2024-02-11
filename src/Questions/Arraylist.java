package Questions;
import java.util.*;
import java.util.Arrays;


public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1 = new ArrayList<>();
		 l1.add(1);
		 l1.add(2);
		 l1.add(3);
		 l1.add(3);
		 
		 int ans[] = l1.stream().mapToInt(Integer::intValue).toArray();
		 
		 for(int ans1 : ans) {
			 System.out.print(ans1);
		 }
		 
		 List<String> str = new ArrayList<>();
		 str.add("asAXA");
		 str.add("asAXA");
		 str.add("asAXA");
		 str.add("asAXA");
		 str.add("asAXA");
		 
		 String sta[] = str.toArray(new String[str.size()]);
		 
		 List<String> l = new ArrayList<>();
		 l.add("skjfnds");
		 
	   ArrayList<Integer> l2 = new ArrayList<>();
	     l2.add(1);
	     l2.add(5);
	     l2.add(4);
	     l2.add(4);
	     l2.remove(3);
	     l2.addFirst(1);
	     l2.addLast(6);
	     
	     for(int k : l2) {
	    	 System.out.println(k);
	     }
	     
	     System.out.println(l);
	     
	     /*
	    ArrayList<Integer> merged = new ArrayList<>();
		merged.addAll(l1); 
		merged.addAll(l2);
		System.out.println("Before sorting "+merged);
		
		Collections.sort(merged);
		System.out.println("After sorting "+merged);*/
	    
	}

}
