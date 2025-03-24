package ex07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member{
	
	String name;
	int age;
	
	public Member(String name, int age) {
		super();
		this.name=name;
		this.age=age;
		
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		System.out.println("-------HAshCode---------");
		return name.hashCode()+age;
	}
	public boolean equal(Object obj) {
		System.out.println("-------equal---------");
		Member m = (Member)obj;
		retrun this.name.equals(m.name) && this.age ==m.age;
	}

}
public class SetExam01{
	public static void main(String[]args) {
		Set<Member> set = new HashSet();
		
		set.add(new Member("홍길동",20));
		set.add(new Member("홍길동",20));
		set.add(new Member("홍길동",20));
		for(Member m : set )
			System.out.println(m);
		
	}
}
