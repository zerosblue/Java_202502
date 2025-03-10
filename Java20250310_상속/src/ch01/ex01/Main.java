package ch01.ex01;

class A {
    String name;  // 타입을 String으로 변경
    int age;

    A() {} // 기본 생성자 추가

    A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void run() {
        System.out.println("run()");
    }

    void eat() {
        System.out.println("eat()");
    }
}

class B extends A {
    String id;

    B() {
        super();  // 부모 클래스 기본 생성자 호출
    }

    B(String name, int age, String id) {
        super(name, age);  // 부모 생성자 호출
        this.id = id;
    }
}

class C extends B {
    String pw;

    C() {
        super();  // 부모 클래스 기본 생성자 호출
    }

    C(String name, int age, String id, String pw) {
        super(name, age, id);  // 부모 생성자 호출
        this.pw = pw;
    }

    void displayInfo() {
        System.out.println("A class (name): " + name);
        System.out.println("A class (age): " + age);
        System.out.println("B class (id): " + id);
        System.out.println("C class (pw): " + pw);
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C("홍길동", 20, "test", "1234");
        c.displayInfo();
    }
}
// 자바는 다중 상속을 허용하지 않는다

