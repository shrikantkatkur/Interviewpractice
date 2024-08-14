package julyinterviewpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MahindraLogisticIQ {
	
	public static  void method1(String s) {
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				
				if(s.charAt(j)==c) {
					count++;
					System.out.println(s.charAt(i));
					break;
				}
			}
		}
		if(count==0) {
			System.out.println("No repeating element");
		}

	}
	
	public static  void method2(String str) {//testing
		char [] ch=str.toCharArray();// t,e,s,s,t,i,n,g
		Set<Character> hSet= new HashSet<Character>();
		for(char c:ch) {
			if(hSet.add(c)==false) {
				System.out.println(c);
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		method1("shrikantt");
		//method2("Ammi");
	}

}
