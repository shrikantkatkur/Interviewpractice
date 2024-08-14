package javaBasicMathCoding;

public class ArmstrongNumber1 {

    public static void main(String[] args) {
        int number = 153; // Replace with the number you want to check
        int originalNumber = number; // Store the original number

        // Calculate the number of digits
        int temp1 = number;
        int length = 0;
        while (temp1 > 0) {
            temp1= temp1/ 10;
            length++;
        }
        

        // Calculate sum of power of digits
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, length);
            //Math.pow Returns the value of the first argument raised to the power of the second argument
            temp = temp / 10;
        }

        // Check if the number is Armstrong
        if (sum == originalNumber) {
            System.out.println("Given number is an Armstrong Number");
        } else {
            System.out.println("Given number is NOT an Armstrong Number");
        }
    }
}
