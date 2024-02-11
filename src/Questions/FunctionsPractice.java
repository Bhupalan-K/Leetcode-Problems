package Questions;

public class FunctionsPractice {
	
	public static void main(String[] args) {
		
		//function1 obj = new function1();
		//obj.fun(2, 4);
		
		//obj.fun3("kdshks");
		function1.fun3("zcbas");
		
		System.out.println(function2.fun1(3, 3));

	}

}

class function1{
	
	public function1() {
		System.out.println("jvjgjgj");
	}
	
	static void fun3(String book) {
		System.out.println(book);
	}
	
	// functions with arguments without return type
	public void fun(int a, int b) {
		System.out.println(a+" " +b);
		
	}
}

 class FunctionsPractice1{
	public static void main(String[] args) {
		
		function2 obj2 = new function2();
		
		
		System.out.println(obj2.fun1(2, 3));
		
	}
}
 
  class function2{
 static	 int fun1(int x,  int y) {
		 int z = x+y;;
		 
		 return z;
	 }
	 
	 
 }
 
 
 
 
 
 
 
 
 
 