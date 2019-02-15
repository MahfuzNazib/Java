import java.lang.*;

public class Circle 
{
	private double radius;

	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public double getRadius()
	{
		return radius;
	}

	public double getArea()
	{
		return (3.1416*(radius*radius));
	}
}