package objectoriebtedprogramming;

import singleton.Bank;

public class BankDemo {

	public static void main(String[] args) {
		Bank c = Bank.instanceMethod();
		Bank d = Bank.instanceMethod();
		if (c == d) {
			System.out.println("Equal");
		} else
			System.out.println("NOT Equal");
	}
}
