package Questions;

public class Arrays {

	public static void main(String[] args) {
	
		int[] ary1= {1,2,3,4,5,7,6,3,5,1};
		int[] ary2= {6,7,8,1,2};
		
		
		/*for(int i=0;i<ary1.length;i++) {
			for(int j=0;j<ary2.length;j++) {
				if(ary1[i]==ary2[j]){
					System.out.println(ary1[i]);
				}
			}
			
		}*/
		int i=0,j=ary1.length-1;
		
		while(i<j)
		{
			
			int temp=ary1[i];
			ary1[i]=ary1[j];
			ary1[j]=temp;
			i=i+1;
			j=j-1;
		}
		
		for(int r=0;r<ary1.length;r++) {
			System.out.println(ary1[r]);
		}
		

	}

}
