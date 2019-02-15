import java.lang.*;

public class Start 
{
	public static void main(String[] args) {
		Rectangle r = new Rectangle(5.0,3.0);
		Triangle t = new Triangle(10.0,5.0);
		Circle c = new Circle();
		c.setRadius(2);
		Square s = new Square();
		s.setSide(5.0);
		
		
		System.out.println("Rectangle area is : "+r.getArea());
		System.out.println("Triangle area is  : "+t.getArea());
		System.out.println("Circle area is    : "+c.getArea());
		System.out.println("Square area is    : "+s.getArea());


	}
}