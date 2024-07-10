package arrayprograms;

public class LenearSearch {
//Linear search or secrential search
	public static void main(String[] args) {
		int[] x = { 1, 2, 4, 56, 80 };
		int searchElement = 80;
		boolean flag = false;
		for (int i = 0; i < x.length; i++) {
			if (searchElement == x[i]) {
				flag = true;
				System.out.println("Element found at " + x[i] + " at index "+i);
			}
		}
		if (flag == false)
			System.out.println("Element Not Found");

	}

}
