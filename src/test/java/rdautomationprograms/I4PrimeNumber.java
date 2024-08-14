package rdautomationprograms;

public class I4PrimeNumber {
	  public static void checkPrimeNumber(int num){
	        int count=0;
	        for(int i=2;i<num;i++){
	            if(num%i==0){
	              count++;  
	            }
	        }
	        if(count>0){
	            System.out.println("Given number"+ num +" is NOT prime");
	        }else
	        System.out.println("Given number "+ num +" is prime");
	    }

	public static void main(String[] args) {
		checkPrimeNumber(11);
	}

}
