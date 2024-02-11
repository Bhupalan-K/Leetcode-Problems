package Questions;
import java.util.Arrays;

public class MergingList {
	
	public static void main(String[] args) {
		
		int [] ar1 = {1,1,2,3,4};
		int [] ar2 = {1,2,2,3,3};
		
		int merged[] = joinArrays(ar1, ar2);
		
		Arrays.sort(merged);
		for(int num:merged) {
			System.out.println(num);
		}
		
	}

	private static int[] joinArrays(int[] ar1, int[] ar2) {
		
		int mer1 = ar1.length;
		int mer2 = ar2.length;
		 
		int[] merged = new int [mer1+mer2];
		
		for (int i = 0; i < mer1; i++) {
	        merged[i] = ar1[i];
	    }

	    // Copy elements of ar2 to merged
	    for (int i = 0; i < mer2; i++) {
	        merged[mer1 + i] = ar2[i];
	    }
		
		return merged;
	}

}
