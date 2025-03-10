package ch01.ex01;

public class CarMain {

	public static void main(String[] args) {
		
		Car car1 =new Car();
		car1.displayInfo();
		System.out.println();

		Car car2 =new Car("기아","k5","흰색",200);
		car2.displayInfo();
		System.out.println();
		
		Car car3 =new Car("현대","소나타");
		car3.setColor("흰색");
		car3.getCompany();
		System.out.println(car3.getCompany());
		
		car3.displayInfo();
		System.out.println();
		
		
		
		
	}

}
