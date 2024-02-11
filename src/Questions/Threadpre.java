package Questions;

public class Threadpre {

	public static void main(String[] args) {
		
		threadexp thex=new threadexp();
		thex.start();
		
		threadexp th1=new threadexp();
		th1.start();
	}

}


class threadexp extends Thread{
	int res;
	synchronized public void run() {
	for(int i=1; i<=10;i++) {
		 res=i;
		 System.out.println(res);
	
	try {
     Thread.sleep(3000);
	}catch(Exception obj){
		obj.printStackTrace();
	}  
   }
	
 }
}