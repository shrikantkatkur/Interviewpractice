package javacollectionsprgorams;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("java");
		ar1.add("python");
		ar1.add("c");
		ar1.add("c++");
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("c#");
		ar2.add("React");
		/*//addAll-joins to arraylist like union or append
		ar1.addAll(ar2);
		ar2.addAll(ar1);
		//ar2.addAll(1, ar1);
		System.out.println(ar1);
		System.out.println(ar2);*/
		//clone-Returns a shallow copy of this ArrayList instance. (Theelements themselves are not copied.)
		ArrayList<String> cloneList=(ArrayList<String>)ar1.clone();
		System.out.println(cloneList);
	}

}
