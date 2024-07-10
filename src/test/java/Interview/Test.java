package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Test{
    
   public static void mostOccuringChar(String s){
       char[] chr=s.toCharArray();
       Map<Character,Integer> hMap=new HashMap<Character,Integer>();
       for(char c:chr){
           if(hMap.containsKey(c)){
              hMap.put(c,hMap.get(c)+1); 
           }
           else{
               hMap.put(c,1);
           }
       }
       int occuerenceTime=0;
       char mostOccurChar='0';
     for(Map.Entry<Character,Integer> e:hMap.entrySet())
     {
      if(e.getValue()>occuerenceTime){
         occuerenceTime= e.getValue();
         mostOccurChar=e.getKey();
      }
         
     }
      System.out.println("Most occurered char from String is: "+mostOccurChar);
        
    }
    
    public static void main(String[]args){
    	Test.mostOccuringChar("Shrikant");
    }
}