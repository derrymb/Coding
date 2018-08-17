package testPrac;

public class customerUse 
{

	public static void main(String[] args) 
	{
		final int noOfEle;
		noOfEle = 4;
		int index;
		customer currentCust;
		customer lowBal;
		lowBal = new customer();
		String currentName;
		String currentId;
		int currentBalance;
		customer[] custArray;
		
		custArray = new customer[noOfEle];

		for (index = 0; index < noOfEle; index++)
		{
			currentCust = new customer();
			System.out.print("Enter name ");
			currentName = EasyIn.getString();
			System.out.print("Enter Customer Id ");
			currentId = EasyIn.getString();
			System.out.print("Enter Customer Balance ");
			currentBalance = EasyIn.getInt();
			//currentCust = new customer(currentName,currentId,currentBalance);
			currentCust.setName(currentName);
			currentCust.setId(currentId);
			currentCust.setBalance(currentBalance);
			custArray[index] = currentCust;
		}
		
		lowBal = custArray[0];
		for (index = 1; index < noOfEle; index++)
		{
			if (custArray[index].getBalance() < lowBal.getBalance())
			{
				lowBal = custArray[index];
			}
		}
		
		System.out.println();
		System.out.println("The Customer with the lowest balance is :");
		System.out.println(lowBal.toString());
	}	

}
