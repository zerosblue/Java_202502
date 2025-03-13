package ch01.ex07;

public class ProductTest {

	public static void main(String[] args) {
		
		Product[]products = new Product[5];
		
		products[0] = new Product();
		products[1] = new Product("새우깡", 5,500);
		products[2] = new Product("신라면",5,100);
		products[3] = new Product("아무거나",6,7000);
		products[4] = new Product("차",6,70000000);
		
		for(int i=0; i<products.length; i++)
			System.out.println(products[i]);

	}

}
