package ch01.ex01_2;

public class Sales extends Employee implements Bonus{
	
	public Sales() {
	}

	public Sales(String name, int number,  String department, int salary) {
		super(name, number, department, salary);
	}
	
	@Override
	public double tax() {
		return getSalary() * 0.13; //salary에 13% 징수
	}
	
	public double getExtraPay() {
		/*
		 * 영업직원에게만 제공되는 추가수당을 리턴한다. 
		 * salary의 3%금액 리턴
		 */
		return getSalary() * 0.03;
	}

	@Override              //100
	public void incentive(int pay) {
		/*
		 * salary에 계산된 인센티브를 가산한다. 
		 * 인센티브는 pay의 120%이다. (pay가100이면 120을 가산)
		 */
		int salary = getSalary();
		salary += pay*1.2;
		setSalary(salary);
	}
 

}
