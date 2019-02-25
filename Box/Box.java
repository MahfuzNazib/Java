import java.lang.*;

public class Box 
{
	private double length;
	private double width;
	private double height;

	public Box(){System.out.println();}

	public Box(double length, double width, double height)
	{
		this.length = length;
		this.width = width;
		this.height = height;
		
	}

	public void setLenght(double length)
	{
		this.length = length;
	}

	public void setWidth(double width)
	{
		this.width = width;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	public double getLength(){return length;}
	public double getWidth(){return width;}
	public double getHeight(){return height;}

}