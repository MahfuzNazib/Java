import java.lang.*;

public class Student
{
	private String name;
	private double cgpa;
	private int semesterNo;

	public Student(){} //empty constructor call

	public Student(String name,double cgpa,int semesterNo)
	{
		this.name = name;
		this.cgpa = cgpa;
		this.semesterNo = semesterNo;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setCgpa(double cgpa)
	{
		this.cgpa = cgpa;
	}

	public void setSemesterNo(int semesterNo)
	{
		this.semesterNo = semesterNo;
	}

	public String getName()
	{
		return name;
	}

	public double getCgpa()
	{
		return cgpa;
	}

	public int getSemesterNo()
	{
		return semesterNo;
	}


	

}