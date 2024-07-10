package javacollectionsprgorams;

import java.util.Stack;

public class StackDemo {
	//reading and deletion is slow, adding is fast because element gets added at top
		public static void main(String[] args) {
			Stack<Integer> st=new Stack<Integer>();
			st.add(10);
			st.add(20);
			st.add(1, 5555);
			System.out.println(st);
			st.push(100);//same like add ,push an element at the top
			System.out.println(st);
			System.out.println(st.pop());//Removes and returns the top object as the value of this function
			System.out.println(st);
			System.out.println(st.search(2000));//return the index of element which is passed,if not present -1
			System.out.println(st.peek());//peek returns the top elemt and pop returns and remove top element
			System.out.println(st);
			System.out.println(st.empty());

	}

}
