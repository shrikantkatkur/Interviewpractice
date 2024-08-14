package superandthiskeyword;

public class Dog extends Animal {
	private int number;
	public static String color = "Black";

	public Dog() {
		//super();
		System.out.println("Constructor of Child");
		}

	public void animalMethod() {
		System.out.println("tHIS IS METHOD OF child");
	}
	public void printColor() {
		System.out.println(color);//variable
		System.out.println(super.color);
		animalMethod();//this will take Current Class/Chiled Classs 
		super.animalMethod();//this will take parent class methoD as we are using super keyword

	}
	public void printNumber(int number) {
		this.number=number;
		//System.out.println(number);//10
		System.out.println(super.number);//500
	
	}

	public static void main(String[] args) {
		Dog dg=new Dog();
		dg.printColor();
		//dg.animalMethod();
		dg.printNumber(10);

	}

}

