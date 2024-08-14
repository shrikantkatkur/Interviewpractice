package javaBasicMathCoding;

import java.util.ArrayList;
import java.util.List;

public class AllMissingNumberInArray {

	public static void main(String[] args) {
		
		int[] x= {5,15,23,27};
		int min=x[0];
		int max=x[x.length-1];
		List<Integer> ax=new ArrayList<Integer>();
		List<Integer> ay=new ArrayList<Integer>();
		for(int i=min;i<max;i++) {
			ax.add(i);
		}
		for(int x1:x) {
			ay.add(x1);
		}
		ax.removeAll(ay);//removes common element
		System.out.println(ax);

	}

}
