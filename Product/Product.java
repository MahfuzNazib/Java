import java.lang.*;

public class Product
{
	private int productId;
	private String productName;
	private int quantity;

	public void setProductId(int productId)
	{
		this.productId=productId;
	}

	public void setProductName(String productName)
	{
		this.productName=productName;
	}

	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}

	public int getProductId()
	{
		return productId;
	}
	public String getProductName()
	{
		return productName;
	}
	public int getQuantity()
	{
		return quantity;
	}

	

}