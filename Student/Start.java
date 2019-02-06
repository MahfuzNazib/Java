import java.lang.*;

public class Start 
{
	public static void main(String[] args) {
		Student s = new Student();

		s.setId(222);
		s.setName("Nazib");
		s.setCgpa(3.74);

		System.out.println("Student ID   : "+s.getId());
		System.out.println("Student Name : "+s.getName());
		System.out.println("Student CGPA : "+s.getCgpa());
	}
}