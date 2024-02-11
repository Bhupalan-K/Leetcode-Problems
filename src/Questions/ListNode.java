package Questions;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;

public class ListNode {
	
	public static void printlist(Node head) {
		
		//ArrayList<Integer> merg = new ArrayList<>();
		Node cur = head;
		while(cur != null ) {
			//merg.addAll((Collection<? extends Integer>) cur);
			System.out.println(cur.val);
			cur = cur.next;
			
		}
	}

	public static void main(String[] args) {
		
		ListNode l1 = new ListNode();
		Node val1 = new Node(7);
		Node val2 = new Node(10);
		Node val3 = new Node(11);
		Node val4 = new Node(9);
		
		val1.next = val2;
		val2.next = val3;
		val3.next = val4;
		Node head = val1;
		 
		printlist(head);
		
		
		
		//Collections.addAll();

	}

}

class Node{
	int val;
	Node next;
	
	Node(int val){
		this.val = val;
	}
}
