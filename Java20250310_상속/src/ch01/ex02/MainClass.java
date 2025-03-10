package ch01.ex02;

class GrandParent{
	String grandPapa;
	GrandParent(String grandPapa){
		this.grandPapa= grandPapa;
		
	}
}
class Parent extends GrandParent{
	int age;
	Parent(String grandPapa, int age){
		super(grandPapa);
		this.age = age;
	}
	
}
	

class Child extends Parent{
	String hobby;

	Child(String grandPapa,int age,String hobby){
		super(grandPapa,age);
		this.hobby = hobby; 
	}
	void displayInfo() {
		System.out.println("할아버지 성함 : " + grandPapa);
		System.out.println("아버지 연세: " + age);
		System.out.println("나의 취미ㄴ : " + hobby);
    }
}

public class MainClass {

	public static void main(String[] args) {
		Child child = new Child("김철수",50,"야구");
		child.displayInfo();
		
				
				

	}

}
