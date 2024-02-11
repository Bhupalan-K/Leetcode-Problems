package Questions;
import java.util.ArrayList;
import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
		
		/*int arr[] = {10,8,7,2,5,6,11};
	
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("*************************************************************************");*/
		String [] arr1= {"flower","flow","flight"};
		char[] first=arr1[1].toCharArray();
		char[] last=arr1[arr1.length-1].toCharArray();
		
		Arrays.sort(arr1);
		for(int i=0; i<arr1.length; i++) {
		if(first[i]!=last[i]);
		
			
			System.out.println(first[i]);
		}
	}

	
	
}
