package julyinterviewpractice;

public class FindSumOfArray {

	public static void main(String[] args) {
		int[] x= {1,2,5,4,3,0,3,7,-1};
		int sum=6;
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]+x[j]==sum) {
					System.out.println(x[i]+" & "+x[j]);
				}
				else {
					
				}
			}
		}
	}

}
