package ch01.ex02;

public class Car {

		
		private String company;
		private String model;
		private String color;
		private int maxSpeed;
		
		static int count = 0;
		
		// 정적변수
		static String companyState = "GM";
		
		//정적 매소드
		static void runState() {
			//정적 매소드 안에서 사용할수 있는 변수 및 매소드는 
			//static 이 붙어잇는 정적 매소드 정적 변수마 사용가능
			System.out.println("static run()");
		}



		public Car(){
			//this나 super는 함수 맨 앞에 와야함
//			this.company = "현대";
//			this.model = "그랜져";
//			this.color = "껌정";
//			this.maxSpeed = 250;
			this("현대","그랜져","껌정",250);
		}
		
		public Car(String company, String model, String color, int maxSpeed) {
			this.company = company;
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
			
			count++;
			System.out.println(count + "번째 객체 생성");
		}
		
		public void run()
		{
			System.out.println(company + "달린다" );

	}
		public void displayInfo() {
			System.out.println(company);
			System.out.println(model);
			System.out.println(color);
			System.out.println(maxSpeed);
		}

}
