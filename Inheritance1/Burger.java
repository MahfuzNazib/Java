import java.lang.*;

public class Burger extends FoodItem
{
	int numberOfPatties;

	public Burger()
	{
		System.out.println("Burger Empty");
	}

	public Burger(int numberOfPatties, double price, String name )
	{
		super(price,name);
		
		System.out.println("Pera Burger");
		this.numberOfPatties = numberOfPatties;
	}

	public void setNumberOfPatties(int numberOfPatties)
	{
		this.numberOfPatties = numberOfPatties;
	}

	public int getNumberOfPatties()
	{
		return numberOfPatties;
	}

	public void showDetails()
	{
		System.out.println("Name    : "+name);
		System.out.println("price   : "+price);
		System.out.println("Patties : "+numberOfPatties);

	}
}