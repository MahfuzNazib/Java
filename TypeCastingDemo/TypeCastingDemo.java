import java.lang.*;

public class TypeCastingDemo
{
	public static void main(String []args)
	{
		char c1 = 'a', c2 = 'h';
		float f1 = 0.0F, f2 = 1.25F, f3 = 10.25F;
		int i = 5;



		System.out.println("Before Type casting-->Implicit casting/Small to Large Casating");
		System.out.println("c1 : "+c1+" & "+"f1 : "+f1);
		f1=c1;
		System.out.println("After Type casting-->");
		System.out.println("c1 : "+c1+" & "+"f1 : "+f1);
		System.out.println("---------------------------------");
		System.out.println("Before Type casting-->Implicit casting/Small to Large Casating");
		System.out.println("c2 : "+c2+" & "+"f2 : "+f2);
		//f2=c2;
		System.out.println("After Type casting-->");
		System.out.println("c2 : "+c2+" & "+"f2 : "+f2);

		System.out.println("Explicit type casting (Before)");
		System.out.println("f3 : "+f3+" & "+" i : "+i);
		i=(int)f3;//EXPLICIT TYPE CASTING
		System.out.println("After Type casting (Explicit / Large to Small)");
		System.out.println("f3 : "+f3+" & "+" i : "+i); //value .25 loss

	}
}