package Questions;
import java.util.*;

public class StackLinkedlist {

	public static void main(String[] args) {
		
		LinkedList<Integer> L = new LinkedList<>();
		  L.add(1);
		  L.add(2);
		  L.add(2);
		  L.add(1);
		  L.pop();
		  //L.pop();
		  L.peek();
		  
		 for(int i=0; i<L.size(); i++) {
			 System.out.println(L.pop());
		 }
		  

	}

}
