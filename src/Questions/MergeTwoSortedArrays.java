package Questions;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4,5,6,6};
		boolean ans = true;
		
		
		for(int i=0; i<nums.length-1; i++) {
			for(int j=nums.length-1; j>=0; j--) {
				if(nums[i] == nums[j]) {
					ans = ans;
				
				}
				else {
					ans = false;
					break;
				}
			}
		}
		
      System.out.println(ans);
	}

}
