package javinterviewquestions;

public class IncrementOperatorQuestions {

	public static void question1() {
		int i=5;
		int x=i++ + ++i;
		System.out.println("Answer of Question1 is :" +x);
		System.out.println("Answer of Question1 is :" +i);
	}
	
	public static void question2() {
		int i=5;
		int x=++i + ++i;
		System.out.println("Answer of Question1 is :" +x);
		System.out.println("Answer of Question1 is :" +i);
	}
	
	public static void question3() {
		int a=11;
		int b=22;
		
		int c=a +b + a++ + b++ + ++a + ++b;
		System.out.println("Answer of Question3 is c value :" +c);
		System.out.println("Answer of Question3 is a value:" +a);
		System.out.println("Answer of Question3 is b value :" +b);
	}
	
	public static void question4() {
		int i=0;
		int k= i++ - --i + ++i - i--;
		
		System.out.println("Answer of Question4 is value of k:" +k);
		System.out.println("Answer of Question4 is value of i:" +i);
	}
	public static void question5() {
		int i=19, j=29,k=39;
		int m= i-- - j-- - --k;
		
		System.out.println("Answer of Question4 is value of k:" +m);
		System.out.println("Answer of Question4 is value of i:" +i);
		System.out.println("Answer of Question4 is value of i:" +j);
		System.out.println("Answer of Question4 is value of i:" +k);
	}
	
	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4();
		question5();
	}

}
