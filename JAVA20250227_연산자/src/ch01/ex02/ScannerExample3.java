package ch01.ex02;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("x값 입력");
		
		String x = Integer.parseInt(strX);
		
		System.out.println("y값 입력");
		String strY= scanner.next();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y :" + result);
		System.out.println();
				
		while (true) {
			System.out.println("입력문자열 : ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
			
			System.out.println("출력문자열 : " + data);
			System.out.println();
		}
		
		System.out.println("종료");
		
				
		

		

	}

}
