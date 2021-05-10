package day3;

public class Student extends User{
	String address;
	
	public Student(int id, String firstName, String lastName, String email, String password, String adress) {
		super(id, firstName, lastName, email, password);
		this.address = address;
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
