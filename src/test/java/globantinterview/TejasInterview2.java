package globantinterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.list.TreeList;

public class TejasInterview2 {

	public static void main(String[] args) {
		int [] ar= {0,12,0,34,0,45,0,6,0,13};
		Arrays.sort(ar);
		for (int i=ar.length-1; i >=0; i--) {
			System.out.print(ar[i]+",");
			
		}
	}

}
