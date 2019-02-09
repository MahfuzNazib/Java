import java.lang.*;

public class CmdLineInput
{
	private int x;
	private double y;
	private String z;

	public CmdLineInput()
	{
		System.out.println("Empty Constructor called ");
	}

	public CmdLineInput(int x, double y, String z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}

	public static void main(String[] args) {
		int a;
		double b;
		String c;

		for (int i=0;i<3;i++)
		{
			System.out.println("args ["+ i +"] : "+args[i]);
		}

		a=Integer.parseInt(args[0]);
		b=Double.parseDouble(args[1]);
		c=args[2];

		
		CmdLineInput c0 = new CmdLineInput();

		CmdLineInput c1 = new CmdLineInput(a,b,c);

		System.out.print("Adding int and double : " );
		System.out.println(c1.x+c1.y);
		System.out.println("Put togather : "+args[0]+args[1]);

	}
}