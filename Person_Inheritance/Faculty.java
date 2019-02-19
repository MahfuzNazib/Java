import java.lang.*;

public class Faculty extends Person 
{
	String dept;
	double salary;
	double experiance;

	public Faculty()
	{
		System.out.println("Empty for Faculty");
	}

	public Faculty(String type, String name, String gander, String dept, double salary, double experiance)
	{
		super(type, name, gander);
		this.dept = dept;
		this.salary = salary;
		this.experiance = experiance;

		System.out.println("Pera for Faculty class");
	}

	public void setDept(String dept){this.dept = dept;}
	public void setSalary(double salary){this.salary = salary;}
	public void setExperiance(double experiance){this.experiance = experiance;}

	public String getDept(){return dept;}
	public double getSalary(){return salary;}
	public double getExperiance(){return experiance;}

	public void showInfo()
	{
		System.out.println(); //For a blank Line
		System.out.println("Type        : "+type);
		System.out.println("Name        : "+name);
		System.out.println("Gander      : "+gander);
		System.out.println("Department  : "+dept);
		System.out.println("Salary      : "+salary);
		System.out.println("Experiance  : "+experiance);
	}
}