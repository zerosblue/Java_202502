package ex05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayListExam {

	public static void main(String[] args) {
		
		Set<String> list = new HashSet<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
		
		
		
		for(String str : list)
			System.out.println(str);
		System.out.println("============================");
		
		Iterator<String> itr =list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next()+"\t");
		}

	}

}
