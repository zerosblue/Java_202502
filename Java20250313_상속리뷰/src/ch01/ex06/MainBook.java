package ch01.ex06;

public class MainBook {

	public static void main(String[] args) {
		
		Book[] books = new Book[5];
		
		books[0] = new Book();
		books[1] = new Book("니멋대로","모르는 아져씨",40000);
		books[2] = new Book("아프니까 환자다","말잘하는 아져씨",20000);
		books[3] = new Book("풀소유","혜민스님",50000000);
		books[4] = new Book("넌 늙어봣니? 난젊어봤지롱","늙은아져씨",5000);
		
		for(int i=0; i<books.length;i++)
		System.out.println(books[i].getBookInfo());

	}

}
