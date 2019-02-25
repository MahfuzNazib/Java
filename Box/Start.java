import java.lang.*;

public class Start 
{
	public static void main(String[] args) {
		Box b = new Box();
		b.setLenght(1.2);
		b.setWidth(1.3);
		b.setHeight(1.4);

		System.out.println("Lenght : "+b.getLenght());
		System.out.println("Width  : "+b.getWidth());
		System.out.println("Height : "+b.getHeight());
	}
}