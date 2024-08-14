package rdautomationprograms;

import java.util.Arrays;

public class I36ArraySort {
	public static void usingForLoop() {
		int [] x= {11,4,77,48,5,78,70};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]>x[j]) {//< descending order
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		for(int j:x) {
			System.out.print(j+",");
		}
	}
	
	public static void usingArrays(){
		int [] x= {11,4,77,48,5,78,70};
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}

	public static void main(String[] args) {
			usingForLoop();
			usingArrays();
	}

}
