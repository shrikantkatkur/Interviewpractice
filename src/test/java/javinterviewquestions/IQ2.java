package javinterviewquestions;

public class IQ2 {
//output-100,10,1,0,0000000000000000 infite loop
	public static void main(String[] args) {
		for(int i=100;i>=0;i=i/10) {
			System.out.println(i);
		}
	}

}
