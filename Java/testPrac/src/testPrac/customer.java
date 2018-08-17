package testPrac;

public class customer 
{
	String name;
	String id;
	int balance;
	
	public customer() 
	{
		
	}
	
	public customer(String theName, String theId, int theBalance) 
	{
		name = theName;
		id = theId;
		balance = theBalance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String toString ()

	{
		String myString;
		
		myString = "";
		myString += "\n Name : " + name;
		myString += "\n Customer Id  : " + id;
		myString += "\n Balance  : " + balance;
		
		
		return myString;
	}

}
