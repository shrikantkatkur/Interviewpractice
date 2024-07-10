package javinterviewquestions;

public class IQ6 {

	public static void main(String[] args) {
			String s="shrikant vishwanath katkur";
			String [] words=s.split(" ");
			String revString="";
			for(String w:words){
			  String revWord="";
			    for(int j=w.length()-1;j>=0;j--){
			        revWord=revWord+w.charAt(j);
			    }
			    revString=revString+revWord+" ";
			}
			System.out.println(revString);
		}
		

}
