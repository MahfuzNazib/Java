import java.lang.*;

public class ArrayDemo
{	
	Box boxes[] = new Box [4];
	
	public void insertBox(Box b)
	{
		/*
		for(Box element : boxes)
		{
			if(element == null)
			{
				element = b;
				break;
			}
		}*/
		
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
		/*
		for(Box element : boxes)
		{
			if(element == b)
			{
				element = null;
				break;
			}
		}
		*/
		
		for(int i =0; i<boxes.length; i++)
		{
			if(boxes[i] == b)
			{
				boxes[i] = null;
				break;
			}
		}
	}
	
	public void showArrayDetails()
	{
		for(Box b : boxes)
		{
			if(b != null)
			{
				System.out.println(b.getLength());
				System.out.println(b.getWidth());
				System.out.println(b.getHeight());
			}
		}
	}
	public static void main(String args[])
	{
		ArrayDemo ad = new ArrayDemo();
		
		Box b1 = new Box(1.2,2.3,3.4);
		Box b2 = new Box(2.2,3.3,4.4);
		Box b3 = new Box(1.5,2.5,3.5);
		Box b4 = new Box(5.2,5.3,5.4);

		
		ad.showArrayDetails();
		ad.insertBox(b1);
		ad.insertBox(b2);
		ad.insertBox(b3);
		ad.showArrayDetails();
		System.out.println("______________");
		ad.removeBox(b2);
		ad.showArrayDetails();
	}
}