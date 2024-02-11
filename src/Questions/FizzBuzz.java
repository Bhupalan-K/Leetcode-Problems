package Questions;
import java.util.*;
import java.util.Arrays;
import java.io.*;


public class FizzBuzz {

	public static void main(String[] args) {
	
	    
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("enter value= "+n);*/
		List<String> OutArr = new ArrayList<>();
		int n = 6;
		for(int i=1; i<=n; i++) {
		
			int fb = i ;
			String ch  = "FIZZBUZZ";
			String ch1 = "FIZZ";
			String ch2 = "BUZZ";
		   	if(fb % 3 == 0 && fb % 5 == 0) {
		   		OutArr.add(ch);
		   	}else if(fb % 3 == 0) {
		   		OutArr.add(ch1);
		   	}else if(fb % 5 == 0) {
		   		OutArr.add(ch1);	
		   	}else {
		   		OutArr.add(Integer.toString(fb));
		   	} 	
		}
		System.out.println(OutArr);
	}

}
