import java.lang.*;

public class StringDemo
{
	public static void main(String args[])
	{
		String s4 = new String("Java");
		String s1 = "Java"; //. 
		String s2 = "Java"; //No new keyword is called.so s1 & s2 are same string.
		String s3 = new String("Java"); //new string ..

		System.out.println("String s1 is empty : "+s1.isEmpty());
		System.out.println("String s1 and s2 is equal :"+s1.equals(s2));
		System.out.println(s1 == s2);

		System.out.println("String s1 and s3 is equal :"+s1.equals(s3));
		System.out.println(s4 == s2);
		System.out.println(s4 == s3);

		System.out.println(s1.length());

		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		System.out.println(s1.concat(s3));
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s3.concat(s2));
		System.out.println(s3);
		System.out.println(s2);

		s1 = s1.concat(s4);
		System.out.println(s1);
		System.out.println(s4);
		System.out.println(s1);
		s1 = "I Love java";

		System.out.println(s1);
		System.out.println(s1.substring(4,9));
	}
}