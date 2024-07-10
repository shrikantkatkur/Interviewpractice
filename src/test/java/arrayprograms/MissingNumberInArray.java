package arrayprograms;

public class MissingNumberInArray {

	public static void main(String[] args) {
		//Array should not have duplicates
		//no need to be sorted
		//arrays should in proper range
		int[] x= {1,2,3,4,5,7};
		int lastElement=x[x.length-1];
		//1+2+4+5=12 sum1
		//1+2+3+4+5=15 sum2
		//sum2-sum1=missing number
		int sum1=0;
		int sum2=0;
		for (int i = 0; i < x.length; i++) {
			sum1=sum1+x[i];
		}
		for (int i = 1; i <=lastElement; i++) {
			sum2=sum2+i;
		}
		int missingNumber;
		missingNumber=sum2-sum1;
		System.out.println("Missing element is:"+missingNumber);

	}

}
