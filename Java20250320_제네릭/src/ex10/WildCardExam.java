package ex10;

class Box<T>{
	private T obj;
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return (String)obj;
	}
class A{}
class B extends A{}
class C extends B{}
class D{}

	
	
}
class Unboxer{
	public static <T> T openBox(Box<T> box) {
		return box.getObj();
	}
	public static void peerBox(Box<? extends B >box) {
	//	System.out.println(box);
		box.getObj();
	//	box.setObj();
	}
	public static void peerBox2(Box<? super C >box) {
		System.out.println(box);
	}
}

public class WildCardExam {

	public static void main(String[] args) {
		Box<B>box= new Box<>();
		box.setObj = new Box<>();
		
		Unboxer.peerBox(box);
		

	}

}
