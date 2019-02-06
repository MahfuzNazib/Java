import java.lang.*;

public class Student
{
	private int id;
	private String name;
	private double cgpa;


	public void setId(int id)
	{
		this.id=id;
	}

	public void setName(String name)
	{
		this.name=name;
	}

	public void setCgpa(double cgpa)
	{
		this.cgpa=cgpa;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public double getCgpa()
	{
		return cgpa;
	}

	
}