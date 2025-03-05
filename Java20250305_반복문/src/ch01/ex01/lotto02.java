package ch01.ex01;

import java.util.Random;

public class lotto02 {

	public static void main(String[] args) {

		/*
		 * 로또 프로그램
		 * 배열 : 6짜리 int 배열
		 * 로또는 1~45 랜덤하게 저장*
		 * 단 중복 불가
		 */
		int[] lotto = new int[45];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
		// 배열 섞기~
		for(int i=0; i<500;i++) {
			int index = (int)(Math.random()*45); //1~44
			
			int temp = lotto[0];
			lotto[0] = lotto[index];
			lotto[index] = temp;
		}
		
		System.out.println("=이번주 로또 예상번호=");
		for(int i=0; i<6;i++)
			System.out.print(lotto[i] + " ");


		
		
	}

}
