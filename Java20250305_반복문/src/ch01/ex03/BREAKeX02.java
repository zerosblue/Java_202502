package ch01.ex03;

public class BREAKeX02 {

	public static void main(String[] args) {
		
		for(int i=0; i<5;i++) {
			for(int j=0; j<5; j++) {
				
				System.out.print("* ");
				
				if(i==j) break;
			}
			System.out.println();
		}
		



	}

}
