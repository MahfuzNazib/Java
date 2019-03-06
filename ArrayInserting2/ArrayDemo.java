import java.lang.*;

public class ArrayDemo
{
	Box boxes[] = new Box[4];

	public void insertBox(Box b)
	{
		for(int i=0; i<boxes.length; i++)
		{
			if(boxes[i] == null)
			{
				boxes[i] = b;
				break;
			}
		}
	}

	public void removeBox(Box b)
	{
		for(int i=0;i<boxes.length;i++)
		{
			if(boxes[i] == b)
			{
				boxes[i] = null;
				break;
			}
		}
	}

	/*public void showDetails()
	{
		for(int i=0;i<boxes.length;i++)
		{
			if(b != null)
			{
				System.out.println(b.getLength());
				System.out.println(b.getWidth()); 
				System.out.println(b.getHeight());
			}
		}
	}*/

	public void showArrayDetails()
	{
		for(Box b : boxes)
		{
			if(b != null)
			{
				System.out.println("Length : "+b.getLength());
				System.out.println("Width  : "+b.getWidth());
				System.out.println("Heigth : "+b.getHeight());
				System.out.println("--------------");
			}
		}
	}

	public static void main(String[] args) {
		ArrayDemo ad = new ArrayDemo();

		Box b1 = new Box(1.2,1.3,1.4);
		Box b2 = new Box(2.2,2.3,2.4);
		Box b3 = new Box(3.2,3.3,3.4);
		Box b4 = new Box(4.2,4.3,4.4);

		ad.showArrayDetails();
		ad.insertBox(b1);
		ad.insertBox(b2);
		ad.insertBox(b3);
		ad.showArrayDetails();
		System.out.println("______________");
		ad.removeBox(b2);
		//ad.showArrayDetails();
		ad.removeBox(b1);
		ad.showArrayDetails();
		
	}
}