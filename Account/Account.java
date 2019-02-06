import java.lang.*;

public class Account
{
	private String id;
	private String userName;
	private String password;
	private double balance;

	public void setId(String id)
	{
		this.id=id;
	}

	public void setUserName(String userName)
	{
		this.userName=userName;
	}

	public void setPassword(String password)
	{
		this.password=password;
	}

	public void setBalance(double balance)
	{
		this.balance=balance;
	}

	public String getId()
	{
		return  id;
	}

	public String getUserName()
	{
		return userName;
	}

	public String getPassword()
	{
		return password;
	}

	public double getBalance()
	{
		return balance;
	}

	public static void main(String[] args) {
		Account a = new Account();

		a.setId("17-34418-1");
		a.setUserName("Nazib Mahfuz");
		a.setPassword("*******");
		a.setBalance(50000.00);

		System.out.println("Account All Information");
		System.out.println("-----------------------");
		System.out.println("Account ID : "+a.getId());
		System.out.println("User Name  : "+a.getUserName());
		System.out.println("Password   : "+a.getPassword());
		System.out.println("Balance    : "+a.getBalance());
	}
}