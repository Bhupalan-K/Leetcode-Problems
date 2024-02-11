package Questions;
import java.util.Arrays;

public class TopKFrequentElement {

	public static void main(String[] args) {
		
		int nums[] = {1,1,1,1,2,2,4,4,3};
		int k = 2;
        Arrays.sort(nums);
        int times = 1;
        for(int i=0; i<nums.length-1; i++) {
        	int cur = nums[i];
        	if(cur == nums[i+1]) {
        		times = times+1;
        	}else {
        		System.out.println("Number of times "+times);
        		times = 1;
        	}
        }
        System.out.println("Number of times "+times);
    
	}

}
