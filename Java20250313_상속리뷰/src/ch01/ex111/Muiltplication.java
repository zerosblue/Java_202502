package ch01.ex111;

public class Muiltplication {
	
	private int dan;
	private int number;
	
	public Muiltplication() {}

	public Muiltplication(int dan) {
		this.dan = dan;
	}
	
	public Muiltplication(int dan, int number) {
		this.dan = dan;
		this.number = number;		
	}
	
	void printPart() {
		if(number == 0) {
			System.out.print(dan +"단 : ");
			for(int n=1; n<=9; n++) { 
				System.out.print(dan + "*" + n + "=" + (dan*n) + "\t" );
			}
			System.out.println();
			
		}else {
			System.out.println(dan + "*" +  number + " = " +  dan * number);
		}
	}

}
