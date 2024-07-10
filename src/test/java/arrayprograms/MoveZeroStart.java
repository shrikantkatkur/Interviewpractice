package arrayprograms;

public class MoveZeroStart {

	public static void moveZeroFirst(int x[]) {
		int x1[]=new int[x.length];
		int count=x.length-1;
		for(int i=count;i>=0;i--) {
			if(x[i]!=0) {
			x1[count]=x[i];
			count--;
			}
		}
		for(int i=0;i<x1.length;i++) {
			System.out.print(x1[i]+",");
		}
		
	}
	
	public static void main(String[] args) {
		int x[] = { 1, 0, 5, 0, 3,12,33,0,15,0,7 };
		MoveZeroStart.moveZeroFirst(x);
	}

}
