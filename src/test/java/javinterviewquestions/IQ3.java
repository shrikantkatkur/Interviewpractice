package javinterviewquestions;

public class IQ3 {
//is this program will run or which error it will show on line no 11?
	//Answer is Unreachable code
	public static void main(String[] args) {
		int i = 1;
		for (; true;) {
			System.out.println("Hi");
		}
		//System.out.println("world");
	}

}
