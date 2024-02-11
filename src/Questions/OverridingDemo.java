package Questions;

public class OverridingDemo {
	
	public static void main(String[] args) {
		
		overriding2 over3 = new overriding2();
		over3.over();
		over3.overr();
		
		
		
	}

}


class overriding1{
	
	public void over() {
		System.out.println("This is class 1");
	}
}

class overriding2 extends overriding1{
	
	public void over() {
		System.out.println("This is class 2");
	}
	
	
	public void overr() {
		super.over();
	}
	
	
	
	
}