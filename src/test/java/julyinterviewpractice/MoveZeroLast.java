package julyinterviewpractice;

public class MoveZeroLast {
	

	public static void main(String[] args) {
		
		int[] x= {10,1,0,25,0,33,0,1,12,14};
		for(int i=0;i<x.length;i++) {//for(int=x.length-1;i>=0;i--) for MoveZerofirst
			for (int j = i+1; j < x.length; j++) {//for(int j=i-1;j>=0;j--)
				if(x[i]==0) {
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		
		for(int a:x) {
			System.out.print(" "+a);
		}
		

	}

}
