import java.lang.*;

public class Start 
{
	public static void main(String[] args) {
		Library l1 = new Library("AIUB Library",5);

		Book b1 = new Book(1011,"C","xxx",25);
		Book b2 = new Book(1012,"C++","yyy",20);
		Book b3 = new Book(1013,"C#","zzz",30);
		Book b4 = new Book(1014,"php","ppp",21);
		//Book b5 = new Book(1011,"ASP.NET","aaa",28);

		

		l1.addBook(b1);
		l1.addBook(b2);
		l1.addBook(b3);
		l1.showDetails();
		l1.removeBook(b1);
		System.out.println("After Remove b1");
		l1.showDetails();
		l1.addBook(b4);
		System.out.println("After Add b4");
		l1.showDetails();


	}
}