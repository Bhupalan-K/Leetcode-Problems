package Questions;

public class valueAdding {

	public static void main(String[] args) {
		
		ListNode2 l1 = new ListNode2();
        l1.insertFirst(2);
        l1.insertFirst(4);
        l1.insertFirst(5);
        l1.insertFirst(9);
        l1.insertFirst(7);
        l1.insertFirst(10);
        l1.insertLast(8);
        l1.insertFirst(11);
        
         l1.display();
        System.out.println("Deleting first element " +l1.deleteFirst());
        System.out.println("Get value " + l1.get(5));
        System.out.println("Delete Last "+ l1.deleteLast());
        System.out.println("Getting center index " +l1.deleteCI(2));
        
        
        
	}

}
