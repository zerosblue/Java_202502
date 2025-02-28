package ch01.ex01;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수 : ");
        
        int score = sc.nextInt();
        String result;

        if (score >= 90) {
            result = "우수한 성적으로 합격하셨습니다! 🎉";
        } else if (score >= 80) {
            result = "좋은 성적으로 합격하셨습니다! 😊";
        } else if (score >= 70) {
            result = "축하드립니다, 합격하셨습니다! 🎊";
        } else if (score >= 50) {
            result = "아쉽네요, 조금만 더 노력하면 합격할 수 있어요! 📖";
        } else {
            result = "불합격입니다. 일 년 더 고생하시기 바랍니다. 💪";
        }

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println(result);
        System.out.println("----------------------------------------");
		
	}

}
