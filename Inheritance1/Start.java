import java.lang.*;

public class Start
{
	public static void main(String[] args) {
		
		Pizza p1 = new Pizza("6''", 220.20, "Pizza1");
		p1.showDetails();

		System.out.println();

		Pizza p2 = new Pizza("4''", 150.50, "Pizza-2");
		p2.showDetails();

		System.out.println("-------------------------");

		Burger b1 = new Burger(3, 150.25,"Burger1");
		b1.showDetails();

		System.out.println();

		Burger b2 = new Burger(6, 450.25,"Burger-2");
		b2.showDetails();

	}
}