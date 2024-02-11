package Questions;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> nums = new LinkedList<>();
		nums.add(5);
		nums.add(4);
		nums.add(3);
		nums.add(2);
		nums.add(1);
		nums.add(11);
		
		//Collections.reverse(nums);
		
		for(int num : nums) {
			System.out.println(num);
		}
		
		

	}

}
