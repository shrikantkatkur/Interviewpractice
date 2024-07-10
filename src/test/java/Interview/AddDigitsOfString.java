package Interview;

public class AddDigitsOfString{
    public static void addDigitsOfString(String s){
        int result=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)>=0 &&s.charAt(i)<=9){
                result=result+ Integer.parseInt(s.charAt(i)+"");
            }
        }
        System.out.println(result);
        
    }
    public static void main(String[]args){
        AddDigitsOfString.addDigitsOfString("Shrika334hjjk12");
        
    }
}