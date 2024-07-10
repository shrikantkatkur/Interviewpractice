package arrayprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		String s[] = { "Shrikant", "Jyoti", "Sanavi" };
		List<String> l1 = new ArrayList();
		for (int i = 0; i < s.length; i++) {
			l1.add(s[i]);
		}
		System.out.println("using add method "+l1);
		// 1.using Array.asList
		List<String> list = Arrays.asList(s);
		Object[] ar=list.toArray();// to convert AL to array
		System.out.println("using Array.asList method "+list);
		// 2.using Collection.addAll
		List<String> l = new ArrayList();
		Collections.addAll(l, s);
		System.out.println("using Collections.Addall method "+l);

	}

}
