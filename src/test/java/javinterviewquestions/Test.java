package javinterviewquestions;

public class Test {
	int a=10;
	static int b=20;

	public static void main(String[] args) {
		Test t1=new Test();
		t1.a=100;
		t1.b=200;
		
		Test t2=new Test();//once b value got updated then for rmining all object b value will be updated beacuse it is static,
		//beacuse b is static ,it will create single of b in memory and all will pointed toards it 
		System.out.println("t1.a =" +t1.a+ " t1.b =" +t1.b);
		System.out.println("t2.a =" +t2.a+ " t2.b =" +t2.b);//what is output of program

	}

}
