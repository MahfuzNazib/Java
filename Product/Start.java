import java.lang.*;

public class Start 
{
	public static void main(String[] args) {
		Product p = new Product();

		p.setProductId(122);
		p.setProductName("Shirt");
		p.setQuantity(25);

		System.out.println("Product All Information");
		System.out.println("=======================");
		System.out.println("Product ID   : "+p.getProductId());
		System.out.println("Product Name : "+p.getProductName());
		System.out.println("Quantity     : "+p.getQuantity());
	}
	

}