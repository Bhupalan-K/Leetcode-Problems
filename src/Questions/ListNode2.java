package Questions;

public class ListNode2 {
	
	private Node head;
	private Node tail;
	private int size = 0;
	
	public ListNode2() {
		this.size = size;
	}
	
	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
		
		if(tail == null) {
			tail = head;
		}
		size +=1;
	}
	
	public void insertLast(int val) {
		if(tail == null) {
			insertFirst(val);
			return;
		}
		
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size++;
	}
	
	public int deleteFirst() {
		int val = head.value;
		head = head.next;
		if(head == null) {
			tail = null;
		}
		size--;
		return val;
	}
	
	public int deleteLast() {
		if(size == 1) {
			deleteFirst();
		}
		
		Node secondLast = get(size-2);
		int value = tail.value;
		tail = secondLast;
		tail.next = null;
		
		 return value;
	}
	  
	
	public Node get(int index) {
		Node node = head;
		for(int i=0; i<index; i++) {
			node = node.next;
		}
		return node;
	}
	
	public int deleteCI(int index){
		if(index == 0) {
			deleteFirst();
		}
		
		if(index == size-1) {
			deleteLast();
		}
		
		Node prev = get(index -1);
		int val1 = prev.next.value;
		prev.next = prev.next.next;
		return val1;
	}
	
	public Node getNodeValue(int value) {
		Node node = null;
		while(node != null) {
			if(node.value == value) {
				return node;
			}
			
			node = node.next;
		}
		
		return null;
	}
	
	
	
	
	
	
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	
 
	
	private class Node{
	
		private int value;
		private Node next;
		
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
		
		public Node(int value) {
			this.value = value;
		}
	}
}
