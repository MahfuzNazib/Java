import java.lang.*;

public class ProductLT
{
	private String productId;
	private String productName;
	private double price;
	private int quantity;


	//Set Methods
	public void setProductId(String productId)
	{
		this.productId=productId;
	}

	public void setProductName(String productName)
	{
		this.productName=productName;
	}

	public void setPrice(double price)
	{
		this.price=price;
	}

	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}


	//Get Methods

	public String getProductId(){return productId;}
	public String getProductName(){return productName;}
	public double getPrice(){return price;}
	public int getQuantity(){return quantity;}

	//Empty Constructor

	public ProductLT()
	{
		System.out.println("Empty Constructor called");
		System.out.println("		      ^         ");
		System.out.println("		      ^         ");
	}

	//Perametariazed Constructor

	public ProductLT(String productId , String productName , double price , int quantity)
	{
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	//Show Details Method

	public void showDetails()
	{
		System.out.println("Product ID    : "+productId);
		System.out.println("Product Name  : "+productName);
		System.out.println("Product Price : "+price);
		System.out.println("Quantity      : "+quantity);
	}

}