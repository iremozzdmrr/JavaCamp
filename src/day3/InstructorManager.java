package day3;

public class InstructorManager {
	
	public void Add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " " +instructor.getLastName()+" e�itmen olarak eklendi");
	}
	
	public void AddCertificate(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " " +instructor.getLastName()+","+instructor.getCertificate()+" sertifikas�n� ekledi");
	}

}
