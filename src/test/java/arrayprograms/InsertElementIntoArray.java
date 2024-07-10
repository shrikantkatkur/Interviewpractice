package arrayprograms;

public class InsertElementIntoArray {

	public static void main(String[] args) {
		int [] x= {10,20,30,40,50};
		int element=5;
		int pos=3;
		for(int i=x.length-1;i>pos-1;i--) {
			x[i]=x[i-1];
		}
		x[pos-1]=element;
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+",");
		}
	}

}
