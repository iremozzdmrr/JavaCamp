package day3;

public class Instructor extends User{
	String certificate;
	
	public Instructor(int id, String firstName, String lastName, String email, String password, String certificate) {
		super(id, firstName, lastName, email,password);
		this.certificate = certificate;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	
	
	

}
