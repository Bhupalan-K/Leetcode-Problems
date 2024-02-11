package AlgorithmPractice;

public class SelectionSorting {

	public static void main(String[] args) {
		
		int n[] = {13,46,24,13,20,9};
		
		int i,j;
		 
		for(i=0; i<n.length-1; i++) {
			int mini = i;
			
			for(j=i; j<n.length; j++) {
				if(n[mini] > n[j]) {
					mini = j;
				}
			}
			
			int temp = n[mini];
			n[mini] = n[i];
			n[i] = temp;
		}
		for(i=0; i<n.length; i++) {
			System.out.print(n[i]+" ");
		}
		

	}

}
