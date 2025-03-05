package ch01.ex03;

public class BREAKeX01 {

	public static void main(String[] args) {
		//1~100까지 누적하다 Sum값이 2000이상일때 
		int sum=0;
		int i=0;
		for(; i<=100;i++) {
			sum += i;
			if(sum >=20)break;
			
		}
		System.out.println(i);
		System.out.println(sum);

	}

}
