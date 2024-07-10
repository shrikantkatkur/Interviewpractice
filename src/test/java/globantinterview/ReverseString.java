package globantinterview;

public class ReverseString{

public static void reverseString(String str){
String rev="";
for(int i=str.length()-1;i>=0;i--){
rev=rev+str.charAt(i);
}
System.out.println(rev);
}
public static void main(String[]args){
	ReverseString.reverseString("nitin123");
}

}