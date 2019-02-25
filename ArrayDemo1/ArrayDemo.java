import java.lang.*;

public class ArrayDemo
{
	private int a[] = new int [5];
	private int []b = new int [] {1,2,3,4,5,6};
	private double c[];
	private int d[] = {7,8,9,10};

	public static void main(String args[])
	{
		ArrayDemo ad = new ArrayDemo();

		ad.a[0] = 10;
		ad.a[1] = 20;
		ad.a[2] = 30; 
		ad.a[3] = 40;
		ad.a[4] = 50;

		System.out.println("Array value print for a[]--");

		for (int i = 0; i<ad.a.length; i++)
		{
			System.out.println("a["+i+"] : "+ad.a[i]);
		}

		System.out.println("Array value print for b[]--");

		for(int i=0; i<ad.b.length; i++)
		{
			System.out.println("b["+i+"] : "+ad.b[i]);
		}

		//value initialize for c[] array;

		ad.c = new double [5];

		ad.c[0] = 1.1;
		ad.c[1] = 1.2;
		ad.c[2] = 1.3;
		ad.c[3] = 1.4;
		ad.c[4] = 1.5;

		System.out.println("Value print for c[]--");

		for (int i=0; i<ad.c.length; i++)
		{
			System.out.println("c["+i+"] : "+ad.c[i]);
		}


		System.out.println("Value print for d[]--");

		for (int i=0; i<ad.d.length; i++)
		{
			System.out.println("d["+i+"] : "+ad.d[i]);
		}

		//String args array for loop;

		System.out.println("Value for Runtime input or Command line input");

		for (int i=0; i<args.length; i++)
		{
			System.out.println("word["+i+"] : "+args[i]);
		}

		System.out.println("");//Empty line

		System.out.println("---------------------------------------------");
		
		System.out.println("Foreach Loop Value ");

		System.out.println("Array value for a[]");

		for(int x : ad.a)
		{
			System.out.println(x);
		}

		System.out.println("Array value for []b");

		for(int y : ad.b)
		{
			System.out.println(y);
		}

		System.out.println("Array value for []c");

		for(double x : ad.c)
		{
			System.out.println(x);
		}

		System.out.println("Array value for d[]");

		for(int y : ad.d)
		{
			System.out.println(y);
		}

		System.out.println("Array value for []args");

		for(String s : args)
		{
			System.out.println(s);
		}

	}
}