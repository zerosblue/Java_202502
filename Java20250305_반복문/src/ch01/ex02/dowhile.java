package ch01.ex02;

public class dowhile {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1; i<=100; i++)
			sum +=i;
		System.out.println(sum);
		
		int sum2=0;
		int i=1;
		while(i<=100) {
			sum2 +=i;
			i++;
		}
		System.out.println(sum2);
		
		int sum3=0;
		int j=0;
		do {
			j++;
			sum3+=j;
		}while(j<100);
		System.out.println(sum3);

	}

}
