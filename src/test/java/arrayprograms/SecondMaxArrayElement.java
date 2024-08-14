package arrayprograms;
import java.util.TreeSet;
public class SecondMaxArrayElement {
	
		    public static void secondMaxNum() {
	        int[] x = { 5, 48, 78, 96, 45, 78, 78, 62, 54 ,96};
	        System.out.println("Before sorting");
	        for(int i = 0; i < x.length; i++) {
	        	System.out.print(x[i]+",");	
	        }
	        TreeSet<Integer> ax = new TreeSet();
	        for (int i = 0; i < x.length; i++) {
	            ax.add(x[i]);
	        }
	       System.out.println();
	        
	        System.out.println("After sorting");
	        System.out.println(ax);
	        //method1 using polllast
	        ax.pollLast();//Retrieves and removes the last (highest) element,or returns null if this set is empty.
	        System.out.println("using polllast "+ax.last());
	      //method1 using headset
	       System.out.println("using Headset"+ax.headSet(ax.last()).last());
	    }
	    public static void main(String[] args) {
	        secondMaxNum();
	    }

	}
