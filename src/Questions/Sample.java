package Questions;
import java.util.Arrays;

public class Sample {

	public static void main(String[] args) {
		 int nums[] = {4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3,1};
//			-8-8-8-8-4-4-3-2-1002244555667
	        Arrays.sort(nums);
	        int times = 1;
	        int longestSequence1  = 1;
	        int longestSequence2  = 1;
	        
	        for(int i = 0; i < nums.length - 1; i++) {
	            if (nums[i] == nums[i + 1]) {
	                // Duplicate element, do nothing
	            } else if (nums[i] + 1 == nums[i + 1]) {
	                times++;
	                longestSequence1 = Math.max(longestSequence1, times);
	            } else {
	                times = 1;
	            }
	        }
	        
	        System.out.println(longestSequence1);
	}

}
