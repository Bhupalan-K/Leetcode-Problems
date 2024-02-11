package Questions;
import java.util.*;
import java.util.Queue;

public class QueuePractice {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(4);
		
		System.out.println(q);
		
		PriorityQueue<Integer> q1 = new PriorityQueue<>();
		q1.add(4);
		q1.add(45);
		q1.add(44);
		q1.add(7);
		q1.add(6);
		
		System.out.println("PriorityQueue "+q1);
		
		for(int ans : q1) {
			System.out.println("PriorityQueue "+ans);//PriorityQueue does not implemented in sorted order but 
			                                        //it is sorted at the time of peek(), remove(), iterating
		}
		
		
	}

}
