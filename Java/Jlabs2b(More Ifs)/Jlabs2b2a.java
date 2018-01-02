class Jlabs2b2a
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
		int SIXTY ;

		System.out.println("Enter your amount spent on your credit card");
		amountSpent = EasyIn.getDouble() ;
		System.out.println("An interest rate of 12% is applied to the first 500 spent and a rate of 18% is applied to the rest");

		SIXTY = 60 ;
		remainder = amountSpent - 500 ;
		rate1st = amountSpent * 0.12 ;
		rate2nd = (remainder / 100) * 18 ;
		totalInt = SIXTY + rate2nd ;

		if (amountSpent <= 500)
			System.out.println("A interest rate of 12% was applied to your input of " + amountSpent + " which is an additional " + rate1st + " in interest.");
		else if (amountSpent > 500)
			System.out.println("A interest rate of 12% was applied to your 1st 500 spent and an interest rate of 18% was applied to your remainder of " + remainder + " which is a total of " + totalInt + " in interest.");
    
  }

}