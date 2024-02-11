package AlgorithmPractice;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int [] nums = {10,5,15,3,7,6,18};
		int find = 10;
		
		Arrays.sort(nums);
	//	sorted = 3,5,6,7,10,15,18
		
		int low = 0,high =  nums.length-1, mid = 0;
		
		while(low <= high) {
			mid = (low + high)/2;
			
			if(find == nums[mid]) {
				System.out.println("Index number = "+mid);
				break;
			}
			else if(find < nums[mid]) 
			{   high = mid-1;
				
			}
			else if(find > nums[mid])
			{   low = mid+1;
			   	
			}
			
		}
		
		if(low > high) {
			System.out.println("Not Found");
		}

	}

}
