package day3;

public class InstructorManager {
	
	public void Add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " " +instructor.getLastName()+" eðitmen olarak eklendi");
	}
	
	public void AddCertificate(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " " +instructor.getLastName()+","+instructor.getCertificate()+" sertifikasýný ekledi");
	}

}
