package Interview;

public class RemoveCharWithNumber{
    
    public static void removeCharWithNumber(String s,char charToReplace){
    int count=1;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==charToReplace){
            s=s.replaceFirst(String.valueOf(charToReplace),String.valueOf(count));
            count++;
        }
           
        }
        System.out.println(s);
    }
    

public static void main(String[]args){
    RemoveCharWithNumber.removeCharWithNumber("momossssss",'s');
}
}

