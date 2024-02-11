package Questions;

public class AlternatingBinaryString {

	public static void main(String[] args) {
		String s = "0100";
		
		for(int i = 0; i<s.length(); i++) {
			
			int cur1 = s.indexOf(i);
			int cur2 = s.indexOf(i+1);
			
			if(cur1 != cur2) {
				System.out.println(i);
			}else if(cur1 == cur2) {
				if(cur1 == 0 && cur2 == 0) {
					cur1 = 1;
				}else if(cur1 == 1 && cur2 == 1) {
					cur1 = 0;
				}i++;
			}
			System.out.println(s.charAt(i));
		}
		
		

	}
	
	/* public static void main(String[] args) {
	        String s = "0100";

	        for (int i = 0; i < s.length(); i++) {
	            // Issue 1: indexOf method is used incorrectly. It should be s.charAt(i) instead of i.
	            int cur1 = s.indexOf(s.charAt(i));
	            // Issue 2: Index should be i+1 instead of i+1. Also, check if cur1 is found (-1 indicates not found).
	            int cur2 = (i + 1 < s.length()) ? s.indexOf(s.charAt(i + 1)) : -1;

	            if (cur1 != cur2) {
	                i++; // Issue 3: Incrementing i again after checking for alternating characters.
	            } else if (cur1 == cur2) {
	                // Issue 4: This part seems to be attempting to flip the current bit, but it's incorrect.
	                // It should be s.charAt(i) instead of cur1, and you can simplify it using XOR.
	                char flippedBit = (s.charAt(i) == '0') ? '1' : '0';
	                // Issue 5: Update the string with the flipped bit at index i.
	                s = s.substring(0, i) + flippedBit + s.substring(i + 1);
	            }
	            // Issue 6: Move the println outside the loop to see the final result.
	        }

	        System.out.println(s);
	    }*/

}
