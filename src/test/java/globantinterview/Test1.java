package globantinterview;

	public class Test1 {

		static int x = 10;
		int y = 15;

		public Test1() {
			x++;
			y++;
		}

	public static void main(String[] args)
	{
		Test1 d1= new Test1();
		Test1 d2= new Test1();
		Test1 d3= new Test1();
		System.out.println(d3.x + " , " +d3.y);
	}

}
