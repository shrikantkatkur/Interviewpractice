package globantinterview;

public class Test2 {

	static int a = 20;
	 
	public static void main(String args[])
	{
		add();
		System.out.print(a);
	}

	private static void add(){
	a = a++ + 20;
	}
}
