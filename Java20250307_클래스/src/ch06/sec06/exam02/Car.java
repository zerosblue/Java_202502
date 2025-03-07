package ch06.sec06.exam02;

public class Car {
	
	private String company;
	private String model;
	private String year;
	
	
	Car(String company,String model,String year) {
		this.company = company;
		this.model = model;
		this.year = year;
	}

		void startEngine() {
	        System.out.println("["+company + "] [" + model + "]의 엔진이 시작되었습니다.");
		}

		void displayInfo() {
			System.out.println("["+year+"]년식 ["+ company+"] [" + model +"]");
		}
		
}
	



