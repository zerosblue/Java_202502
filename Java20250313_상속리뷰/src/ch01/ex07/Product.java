package ch01.ex07;

public class Product {
	
	private String name;
	private int balance;
	private int price;
	
	Product(){
		this("듀크인형",5,10000);
		
	}
	Product(String name, int balance, int price){
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", balance=" + balance + ", price=" + price + "]";
	}
	
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public int getPrice() {
		return price;
	}

}
