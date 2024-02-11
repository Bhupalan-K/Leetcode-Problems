package Questions;
import java.util.Arrays;
import java.util.TreeSet;

public class MajorityElement {

	public static void main(String[] args) {
		
	/*	int [] nums = {2,2,1,1,1,2,2,3,3};
		             //1,1,1,2,2,2,2,3,3 
		Arrays.sort(nums);
		int count = 1;
		TreeSet<Integer> set = new TreeSet<>();
		
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i] == nums[i+1]) {
				count = count+1;
			}else {
				set.add(count);
				count = 1;
			}
		}
		set.add(count);
		System.out.println(set.last());*/

		int [] nums = {2,2,1,1,1,2,2,3,3};
		//             1,1,1,2,2,2,2,3,3   
		Arrays.sort(nums);
		
		int count = 1, maxcount = 1;
		int majorelement = nums[0];
		
		for(int i=1; i<nums.length; i++) {
			if(nums[i] == nums[i-1]) {
				count = count+1;
			}else {
				count = 1;
			}
			
			if(count > maxcount) {
				maxcount = count;
				majorelement = nums[i];
			}	
		}
		System.out.println("Major element = "+majorelement);
	}

}
