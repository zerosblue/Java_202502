package ch05.ex07;

public class Account {
	
	private String name;
	private String location;
	private String phone;
	private String email;
	
	public Account(String name, String location,String phone, String email) {
		this.name = name;
		this.location = location;
		this.phone = phone;
		this.email= email;
		
 
		
		
	}
	
	void introduce() {
		System.out.println("name :" + name + "Location : "+ location + "Phone : "+phone+ "email :"+ email);
	}

}
