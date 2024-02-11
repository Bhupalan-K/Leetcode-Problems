package Questions;

public class Stringreverse {
	
	public static void main(String[] str){
		String str1="bhupalan";
		int L =  str1.length();
		
		String result="";
		
		for(int i=str1.length()-1;i>=0;i--) {
			result+=str1.charAt(i);
		}
		
System.out.println(result);
System.out.println("***************************************************");
System.out.println(L);
	}

}
