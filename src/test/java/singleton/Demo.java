package singleton;

public class Demo  {
	

	public static void main(String[] args) {
	Bank sbi=Bank.instanceMethod();
	Bank boi=Bank.instanceMethod();
	if(sbi==boi) {
		System.out.println("Objet are equal");
	}else
		System.out.println("Objet are NOT equal");
	}
                                                                                                                                                                                                                                                 
}
