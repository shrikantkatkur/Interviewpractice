package staticdemo;

public class StaticDemo {
	//Static can be for applied for Variables,Blocks,Methods
	//Static NOT for Class,Interface and Constructor
	//int x=10; instance variable, no of object no of copies
	static int x=10;// //will create single copy of x,no need to create object
	
	static {
		System.out.println("I am static block");//always  excecutes first before main method
	}
	//Static Method-We cant override static method
	public static void main(String[] args) {
		StaticDemo d1=new StaticDemo();
		StaticDemo d2=new StaticDemo();
		d1.x=d1.x+5;
		System.out.println(d2.x);//10 not 15 beacuse 15 is for d1 of x,if static int x=15

	}

}
