package stringprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupWordsFromString {

	public static void main(String[]args){
        String input="Hi I am Shrikant I am from pune ";
        String[] words=input.split(" ");
        String output="";
        Set<String> hSet=new LinkedHashSet<>();
        for(String w:words){
            hSet.add(w);
        }
        for(String h:hSet){
            output=output+h+" ";
        }
        System.out.println(output);
      
    }

	

}
