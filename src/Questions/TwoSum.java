package Questions;

public class TwoSum {

	public static void main(String[] args) {
		
		int nums[] = {2,11,7,15};
		int target = 13;
		
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				int val1 = nums[i];
				int val2 = nums[j];
				
				if(val1 + val2 == target) {
					int [] values = {val1,val2};
					System.out.println(values[0] +" "+ values[1]);
					
				}
				
			}
		}
		
	}

}
