package ch01.ex03;

import java.util.Scanner;

public class ScoreAnalysis {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        int studentCount = 0; // 학생 수 저장
        int[] scores = null;  // 점수 배열 (초기값 null)

        while (true) {
            // 메뉴 출력 (네가 원하는 스타일 적용!)
            System.out.println("------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------");
            System.out.print("선택>> ");

            int choice = scanner.nextInt();

            if (choice == 1) { // 학생 수 입력
                System.out.print("학생 수를 입력하세요: ");
                studentCount = scanner.nextInt();
                scores = new int[studentCount]; // 배열 생성
                System.out.println("✅ 학생 수가 " + studentCount + "명으로 설정되었습니다.");

            } else if (choice == 2) { // 점수 입력
                if (scores == null) { 
                    System.out.println("⚠️ 먼저 학생 수를 입력하세요! (1번 선택)");
                    continue;
                }
                for (int i = 0; i < studentCount; i++) {
                    System.out.print("학생 " + (i + 1) + "의 점수를 입력하세요: ");
                    scores[i] = scanner.nextInt();
                }
                System.out.println("✅ 점수 입력이 완료되었습니다.");

            } else if (choice == 3) { // 점수 리스트 출력
                if (scores == null) {
                    System.out.println("⚠️ 먼저 학생 수와 점수를 입력하세요! (1, 2번 선택)");
                    continue;
                }
                System.out.println("\n--- 점수 리스트 ---");
                for (int i = 0; i < studentCount; i++) {
                    System.out.println("학생 " + (i + 1) + ": " + scores[i]);
                }

            } else if (choice == 4) { // 분석 (최고점 & 평균)
                if (scores == null) {
                    System.out.println("⚠️ 먼저 학생 수와 점수를 입력하세요! (1, 2번 선택)");
                    continue;
                }
                int maxScore = scores[0];
                int sum = 0;

                for (int score : scores) {
                    if (score > maxScore) {
                        maxScore = score;
                    }
                    sum += score;
                }

                double average = (double) sum / studentCount;

                System.out.println("\n--- 분석 결과 ---");
                System.out.println("최고 점수: " + maxScore);
                System.out.printf("평균 점수: %.2f\n", average);

            } else if (choice == 5) { // 종료
                System.out.println("프로그램을 종료합니다.");
                break;

            } else { // 잘못된 입력 처리
                System.out.println("⚠️ 올바른 번호를 입력하세요 (1~5)");
            }
        }

        scanner.close();
    }
}
