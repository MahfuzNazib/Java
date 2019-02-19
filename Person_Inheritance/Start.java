import java.lang.*;

public class Start 
{
	public static void main(String args[])
	{
		Student s = new Student("Student", "Nazib", "Male","Programmer", 3.74, 7);
		s.showInfo();

		Faculty f = new Faculty("Faculty", "Noor", "Male", "CS" ,50000, 2.5);
		f.showInfo();
	}
}