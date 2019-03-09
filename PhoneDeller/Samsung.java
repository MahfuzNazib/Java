import java.lang.*;

public class Samsung extends Phone
{
	public Samsung(){}
	public Samsung(String serialNumber,String imei,String brandName,String model,String type,double price)
	{
		super(serialNumber,imei,brandName,model,type,price);
	}

	public void showDetails()
	{
		System.out.println("Samsung All Informations");
		System.out.println("Serial Number : "+serialNumber);
		System.out.println("Phone IMEI No : "+imei);
		System.out.println("Brand Name    : "+brandName);
		System.out.println("Model Name    : "+model);
		System.out.println("Phone Type    : "+type);
		System.out.println("Price in BDT  : "+price +" BDT");
	}
}