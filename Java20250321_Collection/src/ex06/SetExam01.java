package ex06;


import java.util.HashSet;
import java.util.Set;

class Num {
    private int num;

    public Num(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Num [num=" + num + "]";
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("-------equals() 호출---------");

        if (this == obj) return true; // 같은 객체면 true 반환
        if (obj == null || getClass() != obj.getClass()) return false; // null 체크 & 클래스 타입 체크

        Num number = (Num) obj;
        return this.num == number.num; // num 값이 같으면 true 반환
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(num); // num 값을 기반으로 해시코드 생성
    }
}

public class SetExam01 {
    public static void main(String[] args) {
        Set<Num> set = new HashSet<>();

        set.add(new Num(1234));
        set.add(new Num(1357));
        set.add(new Num(1395));
        set.add(new Num(1234)); // 중복 데이터 (저장 안 됨)
        set.add(new Num(1357)); // 중복 데이터 (저장 안 됨)

        for (Num n : set) {
            System.out.println(n);
        }
    }


}
