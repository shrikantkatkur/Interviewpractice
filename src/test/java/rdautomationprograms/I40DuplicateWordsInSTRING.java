package rdautomationprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class I40DuplicateWordsInSTRING {
	
	public static void usingCollection(){
		String input = "Hi I am Shrikant from pune ";
		String[] words = input.split(" ");  //{"Hi","I","am"}
		int count = 0;

		Set<String> hSet = new LinkedHashSet<>();
		for (String w : words) {
			if (hSet.add(w) == false) {
				count++;
				System.out.print(w+",");
			}
		}
		if (count == 0) {
			System.out.println("NO Duplicate words:");
		}
	}
	
	public static void usingForLoop(){
		String s="Hi I am  i Shrikant ";
        String [] s1=s.split(" ");
         int count =0;
         for(int i=0;i<s1.length;i++){
             for(int j=i+1;j<s1.length;j++){
                 if(s1[i].equalsIgnoreCase(s1[j])){
                     count++;
                     System.out.print(s1[i]+",");
                 }
             }
         }
         if(count==0){
           System.out.print("No Duplicate Elements") ; 
         }
	}

	public static void main(String[] args) {
		//usingCollection();
		usingForLoop();
	}

}
