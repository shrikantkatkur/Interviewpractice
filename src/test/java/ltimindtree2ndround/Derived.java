package ltimindtree2ndround;


public class Derived extends Test {

	public void myMethod() {
	
		System.out.println("ChildMethod");
	}
	
	public void printParentMethod(){
		super.myMethod();
	}
	
	public static void main(String[] args) {
		Derived d= new Derived();
		d.myMethod();
		
		
	}

}
