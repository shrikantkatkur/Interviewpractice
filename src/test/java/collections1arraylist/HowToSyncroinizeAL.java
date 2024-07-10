package collections1arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class HowToSyncroinizeAL {
//1.USING Collection.s
	public static void main(String[] args) {
		List<String> namelist=Collections.synchronizedList(new ArrayList<String>());
		namelist.add("java");
		namelist.add("python");
		namelist.add("c");
		//to add / del we dont need explicit synchronization
		//to fetch/traverse we  need explicit synchronization
		synchronized (namelist) {
			Iterator<String> itr=namelist.iterator();
			while (itr.hasNext()) {
				String string = (String) itr.next();
				System.out.println(string);//this is synchronized arraylist
				
			}
		}
		
	CopyOnWriteArrayList<String> emplist=new CopyOnWriteArrayList<String>();
	emplist.add("shri");
	emplist.add("abc");
	emplist.add("svk");
	//We dont need any explicit syncronization for add/del/read
	Iterator<String> itr= emplist.iterator();
	while (itr.hasNext()) {
		System.out.print(itr.next()+",");//this is synchronized arraylist
	
	}

	}

}
