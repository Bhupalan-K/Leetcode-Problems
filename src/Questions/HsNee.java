package Questions;

public class HsNee {

	public static void main(String[] args) {
		
		String haystack="sadbutsad", needle="sad";
		
		for(int i=0; i<haystack.length(); i++) {
		  if(needle.charAt(0) == haystack.indexOf(i)) {
			
			 int j=0;
			 int k=i;
			 
			while(j<needle.length() && k<haystack.length() && needle.charAt(j) == haystack.charAt(k) ) {
				j++;
				k++;
				
				if(j==needle.length()) {
					System.out.println(haystack.indexOf(i));
				}
				  
			}
		  }
		  
		}

		// System.out.println(-1);
	}

}
