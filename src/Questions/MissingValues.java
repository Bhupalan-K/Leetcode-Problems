package Questions;

public class MissingValues {

	public static void main(String[] args) {
		int nums[] = {0,0,1,1,1,2,2,3,3,4};
		 //int sol =1;
		for(int i=1; i<nums.length; i++){
         	
          if(nums[i] != nums[i-1] ){
        	 // sol =nums[i];
              System.out.println(nums[i]);
              //sol++;
          }

          
      }
	}
}
