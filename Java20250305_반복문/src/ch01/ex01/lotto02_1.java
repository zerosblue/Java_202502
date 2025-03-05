package ch01.ex01;

import java.util.Random;

public class lotto02_1 {

	public static void main(String[] args) {

		/*
		 * 로또 프로그램
		 * 배열 : 6짜리 int 배열
		 * 로또는 1~45 랜덤하게 저장*
		 * 단 중복 불가
		 */
		
		int [] lotto = new int [45];
		
		for(int i =0; i< lotto.length;i++); {
			lotto[i]= i+1;
		}
			
			for(i=0; i<500; i++) {
				int index = (int)(Math.random()*45);
				
				
			}
			
		}
		

		
	}


