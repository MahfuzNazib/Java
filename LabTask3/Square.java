import java.lang.*;

public class Square
{
	private double side;

	public void setSide(double side)
	{
		this.side = side;
	}

	public double getSide(){return side;}

	public double getArea(){return (side*side);}
}