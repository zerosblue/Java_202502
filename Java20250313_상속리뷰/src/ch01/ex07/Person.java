package ch01.ex07;

public class Person {
	
	private String name;
	
	Person(){}
	Person(String name){
		this.name = name;

}

	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}