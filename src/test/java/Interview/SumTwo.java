package Interview;

public class SumTwo {

	public static void main(String[] args) {
		int x = 5;
        int y = 15;
        
        // Subtract y from x repeatedly until x < y
        while (y >= x) {
            y -= x;
        }
        
        // At this point, y is the remainder of y / x
        System.out.println("Remainder (without % or /): " + y); // Output: 3
		

	}

}
