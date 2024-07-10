package stringprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupFromString {
	public static void removeDuplicates(String str) {
		String output="";
        for(int i=0;i<str.length();i++){
            boolean flag=true;
            for(int j=0;j<i;j++){
                if(str.charAt(i)==str.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag){
               output=output+str.charAt(i); 
            }
        }
        System.out.println(output);
	}

	public static void usingSet(String name) {
		name=name.toLowerCase();
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < name.length(); i++) {
			set.add(name.charAt(i));
		}
		for (Character c : set) {
			System.out.print(c);
		}
		
	}

	public static void main(String[] args) {
		 removeDuplicates("sssshrikantttss");
		//usingSet("testingGG");
	}

}
