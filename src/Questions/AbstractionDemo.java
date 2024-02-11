package Questions;

public class AbstractionDemo {

	public static void main(String[] args) {
		
           abs2 ab = new abs2();
           ab.exp1("cbhjzbcsj");
           
           abs1 ab1 = new abs1() {
        	   public void exp1(String name) {
        		   System.out.println(name);
        	   }
           };
           
           ab1.exp1("kjndjskf");
	}

}

abstract class abs1{
	
	//*abstraction - function declaration in super class and function definition in sub class
	//*class name should be an abstract method
	
	abstract public void exp1(String name);
}

 class abs2 extends abs1 {
	
	 public void exp1(String name) {
		 System.out.println(name);
	 }
}