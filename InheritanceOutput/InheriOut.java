import java.lang.*;

class First
{
	public First()
	{
		System.out.println("Empty First");
	}
	public First(int a)
	{
		this();
		System.out.println("1-First");
	}
	public First(int a,int b)
	{
		this(b);
		System.out.println("2-First");
	}
}

class Second extends First
{
	public Second()
	{
		this(10);
		System.out.println("Empty Second");
	}
	public Second(int a)
	{
		super(a,10);
		System.out.println("1-Second");
	}

	public Second(int a, int b){
		System.out.println("2-Second");
	}


}

class Third extends First
{
	public Third( ){
		super(10);
		System.out.println("Empty Third");
	}
	public Third(int a){
		System.out.println("1-Third");1
	}
	public Third(int a, int b){
		this( );
		System.out.println("2-Third");
	}
}
class BonusTask{
	public static void main(String args[ ]){
		Third th = new Third(10,20);
		Second sc = new Second( );
		First f = new First( );
		Third thr = new Third(10);*
	}
}
