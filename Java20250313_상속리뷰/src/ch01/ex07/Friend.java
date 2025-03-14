package ch01.ex07;

public class Friend extends Person {
	
	private String phonenumber;
	private String email;
	
	Friend(){}
	Friend(String name, String Phonenumber, String email){
		super(name);
		this.phonenumber=phonenumber;
		this.email =email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return super.toString() + "Friend [phonenumber=" + phonenumber + ", email=" + email + "]";
	}
	

}
