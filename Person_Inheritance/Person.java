import java.lang.*;

public class Person 
{
	protected String name;
	protected String gander;
	String type;
	

	public Person()
	{
		System.out.println("Empty Person");
	}

	public Person(String type, String name, String ganeder)
	{
		System.out.println("Pera Const. on Person");
		this.type = type;
		this.name = name;
		this.gander = gander; 
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setGander(String gander)
	{
		this.gander = gander;
	}

	public String getName()
	{
		return name;
	}
	public String getGander()
	{
		return gander;
	}

	public String getType()
	{
		return type;
	}

	public void showInfo()
	{
		System.out.println("Type    : "+"xxxx");
		System.out.println("Name    : "+"xxxx");
		System.out.println("Gander  : "+"xxxx");
	}

}