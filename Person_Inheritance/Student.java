import java.lang.*;

public class Student extends Person 
{
	String occupation;
	double cgpa;
	int semesterNo;
	

	public Student()
	{
		System.out.println("Empty for Student");

	}

	public Student(String type, String name, String gander, String occupation, double cgpa, int semesterNo)
	{
		super(type, name, gander);
		
		
		this.occupation = occupation;
		this.cgpa = cgpa;
		this.semesterNo = semesterNo;
		System.out.println("Pera for Student");
	}

	public void setOccupation(String occupation)
	{
		this.occupation = occupation;
	}

	public void setCgpa(double cgpa)
	{
		this.cgpa = cgpa;
	}

	public void setSemesterNo(int semesterNo)
	{
		this.semesterNo = semesterNo;
	}

	public String getOccupation ()
	{
		return occupation;
	}

	public double getCgpa()
	{
		return cgpa;
	}
	public int getSemesterNo()
	{
		return semesterNo;
	}

	public void showInfo()
	{
		System.out.println(); //For a blank Line
		System.out.println("Type        : "+type);
		System.out.println("Name        : "+name);
		System.out.println("Gander      : "+gander);
		System.out.println("Occupation  : "+occupation);
		System.out.println("CGPA        : "+cgpa);
		System.out.println("Semester No : "+semesterNo);
	}
}