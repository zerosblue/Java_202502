package ch04.ex01;

public class ForExam01_1 {

	public static void main(String[] args) {

		//1~100까지 홀수 합
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2 == 1) {
			sum += i;
			}
		}
		
		System.out.println("sum="+sum); 
		
		

	}

}
