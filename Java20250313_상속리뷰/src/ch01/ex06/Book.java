package ch01.ex06;

public class Book {
	
	private String title;
	private  String author;
	private int price;
	
	Book(){
		title = "자바의정석";
		author = "모르는사람";
		price = 35000;
	}
	
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author= author;
		this.price = price;
	}
	public String getBookInfo() {
		return "제목 :" +title + "  작가 :" + author + "  가격 :" + price;
	}


	void bookIntroduce() {
		System.out.println("제목 :" +title + "  작가 : " + author + "  가격 :" + price);
	}

	
	

}
