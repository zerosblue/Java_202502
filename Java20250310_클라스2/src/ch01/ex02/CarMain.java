package ch01.ex02;

import java.util.Random;

public class CarMain {

	public static void main(String[] args) {
		
		//정적 메소드를 객체 생성하지 않고 
		//클래스명 정적매소드명 실행 가능
		//클래스명 정적 변수명 실행가능
		
		Car.runState();
		System.out.println(Car.companyState);
		
		  Car car1 =new Car(); 
		  car1.displayInfo(); 
		  car1.runState();
		  System.out.println();
		  
		  Car car2 =new Car("기아","k5","흰색",200); 
		  car2.displayInfo();
		  car2.runState();
		  System.out.println();
		  
		  Car car3 =new Car("BMW","The 5","블루",220); 
		  car3.displayInfo();
		  car3.runState();
		  System.out.println();
		  
		  Car car4 =new Car("Benz","G-Class","흰색",200); 
		  car4.displayInfo();
		  car4.runState();
		  System.out.println();
		  
		  Car car5 =new Car("Volvo","XC60","검정",200); 
		  car5.displayInfo();
		  car5.runState();
		  System.out.println();
		  
		
		
		
		
		
	}

}
