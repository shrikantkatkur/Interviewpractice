package staticdemo;

public class Child extends Parent {
	
	@Override
	public void m1() {// as parent method is static we cant overide
		
		super.m1();
	}

	public static void main(String[] args) {

	}

}
