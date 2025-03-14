package ch01.ex07;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("# of Data?");
		int count = sc.nextInt();
		
		int[] nArr = new int[count];
		
	        for (int i = 0; i < nArr.length; i++) {
	        	System.out.println("점수를 입력하세요:");
	            nArr[i] = sc.nextInt();
	        }
	        for(int i=0;i<nArr.length;i++){
	        	
	        	System.out.print(nArr[i]+",");
	        }
	        System.out.println();
		
	        GradeExpr expr = new GradeExpr(nArr);
		System.out.println("총점 : " + expr.getTotal() );
		System.out.println("평균 : " + expr.getAverage() );
		System.out.println("최고 : " + expr.getGoodScore() );
		System.out.println("최저 : " + expr.getBadScore() );

	}

}
