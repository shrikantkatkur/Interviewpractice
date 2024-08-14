package javinterviewquestions;

public class LTIMINDTREEIQ {
	
	static {
		System.out.println("Shrikant");
	}
	
	public static void method() {
		System.out.println("Katkur");
	}

	public static void main(String[] args) {
		
		method();//first static block, then line by line ,which method or line comes first, it will print that
		System.out.println("Solapur");
	}

}
