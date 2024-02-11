package Questions;

public class AlphabetExcelSheetValue {

	public static void main(String[] args) {
		
		String exTil = "B";
		
		int res = 0;
		int i;
		for(i=0; i<exTil.length(); i++) {
			
			res = res*26;
			res +=(exTil.charAt(i)-65 /*or 'A'-ASCII value*/+1);
		}
		System.out.println(res);

	}

}
