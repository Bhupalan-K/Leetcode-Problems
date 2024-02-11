package Questions;

public class DoublyLL {
	
	
	private Node head;
	
	
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		if(head != null) {
			head.prev = null;
		}
		head = node;
	}
	
	public void display() {
		Node node = head;
		while(node != null) {
			System.out.println(node.val);
			node = node.next;
		}
		
	}
	
	public void displayRev() {
		Node node = head;
		Node last = null;
		while(node != null) {
			System.out.println(node.val);
			last = node;
			node = node.next;
		}
		
		while(last != null) {
			System.out.println(last.val);
		}
	}
	
	

	
	private class Node{
		int val;
		Node next;
		Node prev;
		
		public Node(int val) {
			super();
			this.val = val;
		}

		
		public Node(int val, Node next, Node prev) {
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
		
		
		
	}
}
