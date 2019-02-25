import java.lang.*;

public class ArrayDemo
{
	Box boxes[] = new Box[3];

	public static void main(String[] args) {

		ArrayDemo ad = new ArrayDemo();

		Box b1 = new Box(1.1,1.2,1.3);
		Box b2 = new Box(2.1,2.2,2.3);
		Box b3 = new Box(3.1,3.2,3.3);

		ad.boxes[0] = b1;
		ad.boxes[1] = b2;
		ad.boxes[2] = b3;

		/*
		System.out.println("Value for Box1");
		System.out.println(ad.boxes[0].getLenght());
		System.out.println(ad.boxes[0].getWidth());
		System.out.println(ad.boxes[0].getHeight());

		System.out.println("Value for Box2");
		System.out.println(ad.boxes[0].getLenght());		
		System.out.println(ad.boxes[2].getWidth());
		System.out.println(ad.boxes[2].getHeight());
		*/

		System.out.println("Foreach loop ");
		for(Box b : ad.boxes)
		{
			if(b != null)
			{
				System.out.println("--------------");
				System.out.println(b.getLenght());
				System.out.println(b.getWidth());
				System.out.println(b.getHeight());
			}
		}


	}
}