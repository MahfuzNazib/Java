import java.lang.*;

public class Triangle
{
	private double height;
	private double base;

	public Triangle(){}
	public Triangle(double height , double base)
	{
		this.height = height;
		this.base = base;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	public void setBase(double base)
	{
		this.base = base;
	}

	public double getHeight()
	{
		return height;
	}

	public double getBase()
	{
		return base;
	}

	public double getArea()
	{
		return (height*base)/2;
	}
}