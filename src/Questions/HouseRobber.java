package Questions;

public class HouseRobber {

	public static void main(String[] args) {
		
		int nums [] = {2,7,9,3,1};
	//	output 2+9+1 = 12;
		
		if(nums.length < 2) {
			System.out.println(nums[0]);
		}
		
		int dp[] = new int[nums.length];
		
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		
		for(int i=2; i<nums.length; i++) {
			
			dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
		}

		System.out.println("Answer "+dp[dp.length-1]);
	}

}
