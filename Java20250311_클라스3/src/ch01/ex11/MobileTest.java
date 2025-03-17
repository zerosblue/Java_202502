package ch01.ex11;

public class MobileTest {

	public static void main(String[] args) {
        // Mobile 객체 생성
        Mobile ltab = new Ltab("Ltab", 500, "ABC-01");
        Mobile otab = new Otab("Otab", 1000, "XYZ-20");

        // 초기 상태 출력
        printTitle();
        printMobile(ltab);
        printMobile(otab);

        // 10분 충전 후 출력
        System.out.println("\n[ 10분 충전 ]");
        ltab.charge(10);
        otab.charge(10);
        printTitle();
        printMobile(ltab);
        printMobile(otab);

        // 5분 통화 후 출력
        System.out.println("\n[ 5분 통화 ]");
        ltab.operate(5);
        otab.operate(5);
        printTitle();
        printMobile(ltab);
        printMobile(otab);
    }

    // 테이블 제목 출력
    public static void printTitle() {
        System.out.println("Mobile\t\tBattery\t\tOS");
        System.out.println("  ---------------------------------------- ");
    }

    // 객체 정보 출력
    public static void printMobile(Mobile mobile) {
        System.out.printf("    %-10s      %4d           %-10s \n",
                mobile.getMobileName(), mobile.getBatterySize(), mobile.getOsType());
    }

}
