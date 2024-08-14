package rdautomationprograms;

public class I8PalindromeNumber {
	
	public static void isPalindrome(int number){
        int temp=number;
        int rem;
        int rev=0;
        while(temp>0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(rev==number){
            System.out.println("Given number is Palindrome");
        }else
        System.out.println("Given number is NOT Palindrome");
       
    }
    
    public static void main(String[] args) {
        isPalindrome(123);
    }

}
