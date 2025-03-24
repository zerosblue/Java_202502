package ex05;

class Person{}

class DBox<L,R>{
	private L left;
	private R right;
	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return left +"&"+right;
		
	}
}



public class MultiTypeParam {

	public static void main(String[] args) {
		
		DBox<String, Integer> iBox = new DBox<String,Integer>();
		iBox.set("홍길동",20);
		System.out.println(iBox);
		
		DBox<Person,String> pBox = new DBox<>();
		Person p = new Person();
		pBox.set(p, "AAA");
		System.out.println(pBox);

	}

}
