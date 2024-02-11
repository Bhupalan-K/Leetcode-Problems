package Questions;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		
		int [] num1 = {1,2,2,1,3}, num2 = {2,2,3};
		HashSet<Integer> set = new HashSet<>();
		
		
		for(int i=0; i<num1.length; i++) {
			for(int j=0; j<num2.length; j++) {
				if(num1[i] == num2[j]) {
					set.add(num2[j]);
				}
		     }
		}
		int[] ans = new int[set.size()];
		int index = 0;
		for(int k : set)
		ans[index++] = k;
		System.out.println(Arrays.toString(ans));
	}

}
