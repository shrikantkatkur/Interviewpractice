package arrayprograms;

import java.util.Arrays;

public class MaxAndMinOfArray {

	
	public static void main(String[] args) {
		int x[]= {1,2,3,4,-5,123};
		//1.approach using inbuilt method
		/*Arrays.sort(x);
		int min=x[0];
		int max=x[x.length-1];

		System.out.println("Max element is: "+ max +" and Minimum element is: "+min);
		*/
		//2.approach Without using inbuilt method
		int min=x[0];
		int max=x[0];
		for (int i = 0; i < x.length; i++) {
			if(x[i]<min) {
				min=x[i];
			}if(x[i]>max) {
				max=x[i];
			}
			
		}
		System.out.println("Max element is: "+ max +" and Minimum element is: "+min);
		
	}

}
