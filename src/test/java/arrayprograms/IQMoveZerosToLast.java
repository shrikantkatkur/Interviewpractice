package arrayprograms;

public class IQMoveZerosToLast {

	public static void main(String[] args) {
//Without using Second/New Array and without using Sort
		int x[] = { 2, 4, 0, 5, 0, 3, 11, 0, -4, 0, 0};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==0) {
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
			
		}
		
		for(int z:x) {
			System.out.print(z+",");
		}
		
		

	}

}
