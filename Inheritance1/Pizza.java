import java.lang.*;

public class Pizza extends FoodItem
{
	String size;

	public Pizza()
	{
		System.out.println("Pizza Empty ");
	}

	public Pizza(String size, double price, String name)
	{
		super(price,name);
		System.out.println("Pera Pizza");
		this.size = size;
	}

	public void setSize(String size)
	{
		this.size = size;
	}

	public String getSize(){return size;}

	public void showDetails()
	{
		System.out.println("Name  : "+name);
		System.out.println("price : "+price);
		System.out.println("Size  : "+size);

	}
}