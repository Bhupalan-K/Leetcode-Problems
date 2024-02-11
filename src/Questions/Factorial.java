package Questions;

public class Factorial {

	public static void main(String[] args) {
		
		int n = 5;
		int ans = 1;
		for(int i=n; i>=1; i--) {
			
			ans *= i;
		}
         System.out.println(ans);
	}

}
