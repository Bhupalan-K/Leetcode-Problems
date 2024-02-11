package Questions;

public class RelativeSortArray {

	public static void main(String[] args) {
		
		int ar1[] = {2,3,1,3,2,4,6,7,9,2,19};
		int ar2[] = {2,1,4,3,9,6};
		
		int resIndex = 0;
		int resArray[] = new int[ar1.length];
		int ans = 0;
		for(int i=0; i<ar2.length-1; i++) {
			for(int j=ar1.length-1; j>=0; j--) {
				if(ar2[i] == ar1[j]) {
					 ans = ar1[j];
					resArray[resIndex++] = ans;
					ar1[j] = -1;
				}
			}
		}
		
		for(int i=0; i<ar1.length-1; i++) {
			for(int j=0; j<ar1.length; j++) {
				if(ar1[i] != -1 && ar1[j] != -1 && ar1[i] > ar1[j]) {
					int temp = ar1[i];
		            ar1[i] = ar1[j];
		            ar1[j] = temp;
				}
			}
		}
		
		for(int i=0; i<ar1.length; i++) {
			if(ar1[i] != -1) {
				resArray[resIndex++] = ar1[i];
			}
		}
		for(int i=0; i<resArray.length; i++) {
			System.out.print(resArray[i]+" ");
		}
		
		

	}

}
