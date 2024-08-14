package rdautomationprograms;

import java.util.ArrayList;

public class I38ArrayMerge {
	public static void usingRegularMethod() {
		// Using Literals
				int[] x = { 1, 2, 3, 4, 5 };
				int [] y= {6,7,8,9,10};
				int z[] = new int[x.length + y.length];
				int a = 0;
				for (int i=0; i < x.length; i++) {
					z[a] = x[i];
					a++;
				}
				for (int j = 0; j < y.length; j++) {
					z[a] = y[j];// z[6]=y[0]
					a++;
					
				}
				for (int m:z) {
					System.out.print(m+",");
				}

	}
	
	public static void  usingAl() {
		int ar1[]= {1,2,3,4,5};
		int ar2[]= {6,7,8,9,10};
		ArrayList<Integer> al1=new ArrayList<Integer>();
		for (Integer i : ar1) {
			al1.add(i);
		}
		ArrayList<Integer> al2=new ArrayList<Integer>();
		for (Integer i : ar2) {
			al2.add(i);
		}
		al1.addAll(al2);
		System.out.println(al1);
	}
	
	

	public static void main(String[] args) {
		usingRegularMethod();
		usingAl();
	}
}
