import java.lang.*;

public class Book
{
	int bookId;
	String bookTitle;
	String authorName;
	int numberOfCopies;

	public Book(){}
	public Book(int bookId,String bookTitle,String authorName,int numberOfCopies)
	{
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.numberOfCopies = numberOfCopies;
	}

	public void setBookId(int bookid)
	{
		this.bookId = bookId;
	}
	public void setBookTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;
	}

	public void setAuthorName(String authorName)
	{
		this.authorName = authorName;
	}
	public void setNumberOfCopies(int numberOfCopies)
	{
		this.numberOfCopies = numberOfCopies;
	}

	public int getBookId(){return bookId;}
	public String getBookTitle(){return bookTitle;}
	public String getAuthorName(){return authorName;}
	public int getNumberOfCopies(){return numberOfCopies;}
}