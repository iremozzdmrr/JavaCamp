package day3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor(1,"Engin","Demirog","engin@gmail.com","1234","A");
		
		Student student = new Student(1,"İrem","ÖZDEMİR","irem@gmail.com","1234","İstanbul");
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.Add(student);
		studentManager.AttendanceCheck(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.Add(instructor);
		instructorManager.AddCertificate(instructor);
		
		UserManager userManager = new UserManager();
		User[] users= {instructor,student};
		userManager.LogInMultiple(users);
		

	}

}
