package stringprograms;

import java.util.Arrays;

public class SortingStringAlphbetically {

	public static void main(String[] args) {
		//1. without using SORT METHOD
		String str="shri1232";
		char temp;
		char arr[]=str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j =i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//System.out.println(new String(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		//2.using Arrays.sort method
		char arr1[]=str.toCharArray();
		Arrays.sort(arr1);
		System.out.println(new String(arr1));//without using for loop
		//String s1=Arrays.toString(arr1); not useful 
		//System.out.println(s1); it will return like this [1, 2, 2, 3, h, i, r, s]
				
	}

}
