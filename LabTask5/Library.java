import java.lang.*;

public class Library
{
	String libraryName;
	Book books[] = new Book[5];

	public Library(){}
	public Library(String libraryName,int sizeOfArray)
	{
		this.libraryName = libraryName;
		//sizeOfArray = 5;
	}

	public void setLibraryName(String libraryName)
	{
		this.libraryName = libraryName;
	}
	public String getLibraryName(){return libraryName;}

	public void addBook(Book b)
	{
		for(int i=0;i<books.length;i++)
		{
			if(books[i] == null)
			{
				books[i] = b;
				break;
			}
		}
	}

	public void removeBook(Book b)
	{
		for(int i=0;i<books.length;i++)
		{
			if(books[i] == b)
			{
				books[i] = null;
				break;
			}
		}
	}

	public void showDetails()
	{
		for(Book b : books)
		{
			if(b != null)
			{
				System.out.println("Book ID : "+b.getBookId());
				System.out.println("Title   : "+b.getBookTitle());
				System.out.println("Author  : "+b.getAuthorName());
				System.out.println("Copies  : "+b.getNumberOfCopies());
				System.out.println("-------------------------------");
			}
		}
	}
}