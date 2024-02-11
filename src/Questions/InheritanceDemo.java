package Questions;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		classB obj1 = new classB();
		obj1.exp1();
		obj1.exp();
		
		
		classC obj2 = new classC();
		
		
		
		
		
		
	}

}

class classA{
	String g = "fsd";
	
	public void exp() {
		System.out.println("This is class A");
	}
}
 class classB extends classA{
	String g1 = "fasnkajn";
	
	void exp1() {
		System.out.println("This is class B");
	}
}


class classC extends classB{
	public static void exp3() {
		System.out.println("This is class C");
	}
}







