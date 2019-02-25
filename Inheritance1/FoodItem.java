import java.lang.*;

public class FoodItem
{
	double price;
	String name;

	public FoodItem()
	{
		System.out.println("Empty FoodItem");
	}

	public FoodItem(double price, String name)
	{
		this.price = price;
		this.name = name;
		System.out.println("FoodItem Pera");
		
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getPrice(){return price;}
	public String getName(){return name;}

	public void showDetails()
	{
		System.out.println("Name  : "+"000");
		System.out.println("price : "+000.00);
	}
}