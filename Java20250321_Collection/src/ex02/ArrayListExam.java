package ex02;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExam {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
		
		list.add(0,"Robot");
		
		for(int i = 0; i<list.size();i++) 
			System.out.println(list.get(i));
		System.out.println();
		
		for(String str : list)
			System.out.println(str);
		System.out.println("============================");
		
		Iterator<String> itr =list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
		System.out.println();
			list.remove(0);
			System.out.println(list.get(0));
			System.out.println(list.get(1));
			//System.out.println(list.get(2));
		list.clear();
//		System.out.println(list.get(0));

	}

}
