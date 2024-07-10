package linkedHashsetapplications;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class RemoveDupsFromArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,44,44,3));
		//Using LinkedHashset
		LinkedHashSet<Integer> linkedHs=new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> noDupNumbers=new ArrayList<Integer>(linkedHs);
		System.out.println(noDupNumbers);
		//using java 8 streams,distinct,collect,Collectors
		List<Integer> dupWaithStream= numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(dupWaithStream);
	}

}
