import java.lang.*;

public class VariableTest
{
	int age; //instance variavle
	String color; //instance variavle
	static int numberOfLegs = 4; //class variable.
	static String owner = "Nazib Mahfuz"; //class variable

	public VariableTest(int age, String color)
	{
		this.age = age;
		this.color = color;
	}

	public void showDetails()
	{
		int nextYear = age+1; //Local variable. No existance outside showDetails() functions.
		System.out.println("Dog age     : "+age);
		System.out.println("Dog Color   : "+color);
		System.out.println("Legs Number : "+numberOfLegs);
		System.out.println("Next Year Age : "+nextYear);
	}


	public static void main(String[] args) {
		VariableTest vt = new VariableTest(4,"Black");
		vt.showDetails();

		VariableTest vt2 = new VariableTest(5,"White");
		vt2.showDetails();
	}
}