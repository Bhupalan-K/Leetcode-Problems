package Questions;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		
		
		try {
			
			char [] ar = {'h','e','l','l','o'};
			for(int i=ar.length; i>=0; i--) {
				System.out.print(ar[i]+" ");
				
//			we cannot give try block without catch or finally block	
			}
		}catch(Exception e) {
			System.out.println("catch block will not be excuted if there is no exception");
			e.printStackTrace();//It is not necessary to give stacktrace but it is given for
			//the type of exception in the code 
		}finally {
			System.out.println(" No matter what finally block will be executed");
			//It is not compulsory to give finally block
		}

	}

}
