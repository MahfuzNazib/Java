import java.lang.*;

public class Start 
{
	public static void main(String[] args) {
		ProductLT p = new ProductLT();

		ProductLT p1 = new ProductLT("fff-22" , "Shirt" , 1250.65 , 10);

		p.setProductId("efvfd");
		p.setProductName("Prnts");
		p.setPrice(10.25);
		p.setQuantity(50);


		System.out.println("Product ID    : "+p.getProductId());
		System.out.println("Product Name  : "+p.getProductName());
		System.out.println("Product Price : "+p.getPrice());
		System.out.println("Quantity      : "+p.getQuantity());
		System.out.println("----------------------------------");

		p1.showDetails();
	}
}