package Questions;
import java.util.*;
import java.util.LinkedList;


public class MergingTwoLists {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new LinkedList<>();
		List<Integer> list2 = new LinkedList<>();
		  list1.add(1);
		  list1.add(2);
		  list1.add(4);
		  list2.add(1);
		  list2.add(3);
		  list2.add(4);
		
		List<Integer> linklist = new ArrayList<>();
		
		  linklist.addAll(list1);
		  linklist.addAll(list2);
		  
		  Collections.sort(linklist);
		  
		 Integer [] toarray = new Integer[linklist.size()];
		  
		  for(int i=0; i<linklist.size(); i++) {
			  
		  	toarray = linklist.toArray(toarray);
			 
			  
		  }
		  System.out.println(toarray);
	}

}
