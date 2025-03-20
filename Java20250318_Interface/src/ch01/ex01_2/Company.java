package ch01.ex01_2;

public class Company {

	public static void main(String[] args) {
		/*
		Employee[] employees = new Employee[5];
		employees[0] = new Secretary("Duke", 1, "secretary", 800);
		employees[1] = new Sales("Tuxi", 2, "sales", 1200);

		int[] arr = new int[5];
		arr[0] =10;
		arr[1] =20;
		int[] arr2 = new int[] {10,20,30};
		int[] arr3 = {10,20,30,40};
		*/
		Employee[] employees = {
				new Secretary("Duke", 1, "secretary", 800),
				new Sales("Tuxi", 2, "sales", 1200)
		};
		
		System.out.println("name\t\tdepartment\t\tsalary\t\textra pay");
		System.out.println("-----------------------------------------------------------------");
		Company.printEmployee(employees, false);
		
		
	}
	
	public static void printEmployee(Employee[] emp, boolean isTax) {
		// 객체의 정보를 출력한다.(실행 결과를 참조)
		 // isTax 의 참/거짓 여부에 따라서 텍스 출력 여부를 결정하여 처리한다
		for(int i=0; i<emp.length; i++) {
			System.out.println(
			emp[i].getName() + "\t\t" +  emp[i].getDepartment() + "\t\t" + 
			emp[i].getSalary() 
					);
		}
		for(Employee e : emp) {
			System.out.printf("%-17s%-10s%18d\n", 
					e.getName(),e.getDepartment(),e.getSalary() );
			
			if( e instanceof Sales) {
				Sales s = (Sales)e;
				System.out.printf("%18.1f",s.getExtraPay());
			}
			System.out.println();
		}
	}

}
