package javinterviewquestions;

public class JavaSplit {
	public static void main(String[] args) {
	
		String s="AtishxXJavaxXSELENIUMxXBatchxX";//"A","t"
		String[] s1=s.split("X");
		System.out.println(s1[0]+" "+s1[0].length());//
		System.out.println(s1[1]+" "+s1[1].length());
		System.out.println(s1[2]+" "+s1[2].length());
		System.out.println(s1[3]+" "+s1[3].length());
		
	}
}
