package julyinterviewpractice;

import java.util.TreeSet;

public class SecondMaxArray {

	public static void main(String[] args) {
		int[] x = { 10, 1, 0, 45, 0, 12, 0, 23, 45 };
		TreeSet<Integer> ts=new TreeSet<Integer>();
		for(int x1:x) {
			ts.add(x1);
		}
		System.out.println(ts);
		//first method using headset and last
		//ts.headset(num) will give all values less then num,num=ts.last()
		System.out.println("Using headset method "+ts.headSet(ts.last()).last());
		//Second Method using
		ts.pollLast();//returns and remove highest array element
		System.out.println("Using pollast method "+ts.last());

	}

}
