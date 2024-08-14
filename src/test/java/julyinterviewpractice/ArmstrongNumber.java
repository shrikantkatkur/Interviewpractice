package julyinterviewpractice;

public class ArmstrongNumber {   public static void main(String[] args) {
	//Armsstrong number 1*3+5*3+3*3=153. 370,371,407 and 1634 armstrong number examples
    int number = 1634; // Replace with the number you want to check
    int originalNumber = number; // Store the original number

    // Calculate the number of digits
    int temp1 = number;
    int length = 0;
    while (temp1 > 0) {
        temp1= temp1/10;
        length++;
    }

    // Calculate sum of power of digits
    int temp2= number;
    int sum = 0;
    while (temp2 > 0) {
        int rem = temp2 % 10;
        sum+= Math.pow(rem, length);
        //Math.pow Returns the value of the first argument raised to the power of thesecond argument
        temp2= temp2 / 10;
    }

    // Check if the number is Armstrong
    if (sum == originalNumber) {
        System.out.println("Given number "+number+" is an Armstrong Number");
    } else {
        System.out.println("Given number "+number+" is NOT an Armstrong Number");
    }
}

}
