import java.lang.*;

public class Phone
{
	private String serialNumber;
	private String imei;
	private String brandName;
	private String model;
	private String type; //Touch screen or Button
	private double price;

	public Phone(){}
	public Phone(String serialNumber,String imei,String brandName,String model,String type,double price)
	{
		this.serialNumber = serialNumber;
		this.imei = imei;
		this.brandName = brandName;
		this.model = model;
		this.type = type;
		this.price = price;
	}

	public void setSerialNumber(String serialNumber)
	{
		this.serialNumber = serialNumber;
	}

	public void setImei(String imei)
	{
		this.imei = imei;

	}

	public void setBrandName(String brandName)
	{
		this.brandName = brandName;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public void setType(String type)
	{
		this.type = type;
	}
	public void setPrice(String price)
	{
		this.price = price;
	}

	public String getSerialNumber(){return serialNumber;}
	public String getImei(){return imei;}
	public String getBrandName(){return brandName;}
	public String getModel(){return model;}
	public String getType(){return type;}
	public double getPrice(){return price;}
}