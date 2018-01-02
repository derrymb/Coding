class Jlabs2b2
// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				27/09/2017
// Purpose : 			Calculate credit card interest. Interest is charged at 12% for the first €500 and at 18% for any remaining amount over €500. 
{

  public static void main (String args[]) 
  {
		double amountSpent; 
		double rate1st ;
		double rate2nd ;
		double totalInt ;
		double remainder ;
		
		final double TWELVEP;
		final double EIGHTEENP;
		final int FIVEHUN;
		
		TWELVEP = 0.12;
		EIGHTEENP = 0.18;
		FIVEHUN = 500;

		System.out.println("Enter your amount spent on your credit card");
		amountSpent = EasyIn.getDouble() ;
		System.out.println("An interest rate of 12% is applied to the first 500 spent and a rate of 18% is applied to the rest");

		rate1st = amountSpent * TWELVEP;
		remainder = amountSpent - FIVEHUN;
		rate2nd = remainder * EIGHTEENP;
		totalInt = rate1st + rate2nd;

		if (amountSpent <= FIVEHUN)
			System.out.println("A interest rate of 12% was applied to your input of " + amountSpent + " which is an additional " + rate1st + " in interest.");
		else if (amountSpent > FIVEHUN)
			System.out.println("A interest rate of 12% was applied to your 1st 500 spent and an interest rate of 18% was applied to your remainder of " + remainder + " which is a total of " + totalInt + " in interest.");
    
  }

}