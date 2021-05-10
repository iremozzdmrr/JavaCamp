package day3;

public class StudentManager {
	
	public void Add(Student student) {
		System.out.println(student.getFirstName()+ " "+ student.getLastName()+" eklendi");
	}
	
	public void Delete(Student student) {
		System.out.println(student.getFirstName()+ student.getLastName()+" silindi");
	}
	
	public void AttendanceCheck(Student student) {
		System.out.println("Derse katılımız sağlanmıştır");
	}
}
