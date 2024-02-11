package Questions;

public class JewelsAndStones {

	public static void main(String[] args) {
		
		String jewels = "aA", stones = "aAAbbbb";
		
		/*int b = stones.length();
		int count = 0;
		
		for(int i=0; i<jewels.length(); i++) {
			char jewel = jewels.charAt(i);
			if(stones.contains()) {
				count = count+1;
			
			}
		}
       
		System.out.println(count);*/
		int count = 0;
		for(int i=0; i<jewels.length(); i++) {
			
			for(int j=0; j<stones.length(); j++) {
				
				if(jewels.charAt(i) == stones.charAt(j)) {
					  count ++;
					  
					
				}
			}
		}
		System.out.println(count);
	}

}
