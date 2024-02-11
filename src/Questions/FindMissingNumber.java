package Questions;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		int nums[] = {3,0,1};
		int allXOR = 0;
		
		for(int i=0; i<=nums.length; i++) {
			allXOR = allXOR ^ i;
		}
		System.out.println(allXOR);
		for(int num : nums) {
			allXOR = allXOR ^ num;
		}
      System.out.println(allXOR);
	}

}
