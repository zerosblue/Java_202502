package ex09;

class Box<T>{
	private T obj;
	
	public Box() {}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	

}
class BoxFactory{
	public static <T> Box<T> makeBox(T o){
		Box<T>box = new Box<>();
		box.setObj(o);
		return box;
	}
}

public class 제네릭의이해 {

	public static void main(String[] args) {
		
		Box<String> sbox = BoxFactory.makeBox("Sweet");
		System.out.println(sbox.getObj());
		Box<Double> dbox = BoxFactory.makeBox(7.58);
		System.out.println(dbox.getObj());

	}

}
