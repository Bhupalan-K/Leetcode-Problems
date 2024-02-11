package Questions;
import java.util.*;

public class StackPractice {

	public static void main(String[] args) {
	
		Stack<Integer> s = new Stack<>();
          s.push(3);
          s.push(2);
          s.push(1);
          s.push(4);
          s.push(5);
          s.push(6);
          s.pop();
          s.push(10);
          s.push(10);
          
          System.out.println(s);
         // s.forEach(k->{
        	//  System.out.println(k);
          //});
         /* System.out.println("***********************************************************");
          for(int i=0; i<s.size()-1;i--) {
        	  System.out.println(s.pop());
          }*/
          
        /*  System.out.println();
          System.out.println("***********************************************************");
          
          s.forEach(System.out::println);
          
          for(int k : s) {
        	  System.out.println(k);
          }*/
          
          
		
	}

}
