package ex02;


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

class Box{
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}

public class 제네릭이해02 {

	public static void main(String[] args) {
		

		Box aBox = new Box();
		Box oBox = new Box();
		
		aBox.setObj(new Apple());
		aBox.setObj(new Orange());
		
		Apple ap = (Apple)aBox.getObj();
		Orange op = (Orange)oBox.getObj();
		
		System.out.println(ap);
		System.out.println(op);

	}

}
