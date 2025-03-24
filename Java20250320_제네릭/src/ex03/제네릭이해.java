package ex03;


class Apple{
	@Override
	public String toString() {
		return"I am an apple";
	}
}
class Orange{
	@Override
	public String toString() {
		return"I am an orange.";
	}
}

class Box<T>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}

public class 제네릭이해 {

	public static void main(String[] args) {
		

		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		
		aBox.setObj(new Apple());
		oBox.setObj(new Orange());
		
		Apple ap = aBox.getObj();
		Orange op = oBox.getObj();
		
		System.out.println(ap);
		System.out.println(op);
		
	}

}
