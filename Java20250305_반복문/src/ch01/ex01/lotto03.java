package ch01.ex01;

import java.util.Random;

public class lotto03 {

	public static void main(String[] args) {

		/*
		 * 로또 프로그램
		 * 배열 : 6짜리 int 배열
		 * 로또는 1~45 랜덤하게 저장*
		 * 단 중복 불가
		 */
		int[] lotto = new int[6];
		boolean flag = false;
		System.out.println("=이번주 로또 예상번호=");
		
		for(int i=0; i<lotto.length; i++) {

			int temp = (int)(Math.random()*45)+1;
			
		for(int j=0;j<lotto.length;j++) {
			if(temp == lotto[j]) {
				flag = true;
				break;
			}
		}	
			if(flag != true) // 중복되지 않았을때 처리
				lotto[i]=temp;
			else // 중복된경우
				i--; // i값 하나 감소
				flag =false;
	}
		
	
			for(int i=0; i<lotto.length;i++)
				System.out.print(lotto[i] + " ");
	
			System.out.println();
	
			}
			
		}


