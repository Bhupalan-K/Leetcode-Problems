package Questions;

public class PolymorphismDemo {
	
	public static void main(String[] args) {
		
		
		poly2 obj = new poly2();
		obj.fun1("cr7");
		obj.fun1(7482);
		
	}

}

class poly1{
	public void fun1(String name) {
		System.out.println(name);
	}
}

class poly2 extends poly1{
	 public void fun1(int in) {
		System.out.println(in);
	}
}