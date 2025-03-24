package ex01;


class Apple{
	public String tostring() {
		return"I am an apple";
	}
}
class Orange{
	public String tostring() {
		return"I am an orange.";
	}
}

class appleBox{
	private Apple ap;

	public Apple getAp() {
		return ap;
	}

	public void setAp(Apple ap) {
		this.ap = ap;
	}
}
class orangeBox{
	private Orange op;

	public Orange getOp() {
		return op;
	}

	public void setOp(Orange op) {
		this.op = op;
	}

}
public class 제네릭이해 {

	public static void main(String[] args) {
		
		appleBox aBox = new appleBox();
		orangeBox oBox = new orangeBox();
		aBox.setAp(new Apple());
		oBox.setOp(new Orange());
		
		Apple ap = aBox.getAp();
		System.out.println(ap.tostring());
		
		Orange op = oBox.getOp();
		System.out.println(op.tostring());
		
		
		
		
		
		

	}

}
