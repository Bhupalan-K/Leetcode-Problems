package Questions;

import java.util.TreeSet;

public class SortColors {

	public static void main(String[] args) {
		
		int nums[] = {2,0,2,1,1,0};
		
		for(int i=0; i<nums.length-1; i++) {
			int min = i;
			for(int j=i+1; j<nums.length; j++) {
				if(nums[min] > nums[j]) {
					min = j;
				}
			}
			int temp = nums[min];
			nums[min] = nums[i];
			nums[i] = temp;
		}
		for(int k : nums) {
			System.out.println(k);
		}
	}

}
