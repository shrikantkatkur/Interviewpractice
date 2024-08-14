package javinterviewquestions;

public class MethodOverloading {
//priority 1) int 2)long 3)Integer 4) int...
	public void print(Integer i) {
		System.out.println("Integer");
	}
	public void print(int i) {
		System.out.println("int");
	}
	public void print(int... i) {//behave like array parameter
		System.out.println("int...");
	}
	public void print(short i) {
		System.out.println("short");
	}
	public void print(long i) {
		System.out.println("long");
	}
	public void print(byte i) {
		System.out.println("byte");
	}

	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		obj.print((Integer)10);
//		mo.print((byte)10);
//		mo.print((Integer)10);
//		mo.print(10l);
	}

}
