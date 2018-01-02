class Jlabs2b4b
// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				27/09/2017
// Purpose : 			Asks the user to enter 3 different numbers. The program then tells the user which number was the lowest number entered. 
{

  public static void main (String args[]) 
  {
		int number1 ; 	//
		int number2 ;	//
		int number3 ;	//
		int min ;		//
		int max ;		//
		int middle;		// Variable assignment

		System.out.println("Please enter your 1st interger number"); 	//Output
		number1 = EasyIn.getInt() ;										//Input
		System.out.println("Please enter your 2nd interger number");	//Output
		number2 = EasyIn.getInt() ;										//Input
		System.out.println("Please enter your 3rd interger number");	//Output
		number3 = EasyIn.getInt() ;										//Input
		
		max = 0;				//
								//
		if (number1 > max)		// Max number calculation
		max = number1;			//
		if (number2 > max)		//
		max = number2;			//
		if (number3 > max)		//
		max = number3;			//
		
		min = 99999999;		//
							//
		if (number1 < min)	//
		min = number1;		// Min number calculation
		if (number2 < min)	//
		min = number2;		//
		if (number3 < min)	//
		min = number3;		//
		
		middle = 0;								//
												//
		if (number1 > min && number1 < max)		// Middle number calculation
		middle = number1;						//
		if (number2 > min && number2 < max)		//
		middle = number2;						//
		if (number3 > min && number3 < max)		//
		middle = number3;						//
		
		System.out.println("Your numbers in ascending order are: ");//
		System.out.println (min) ;									// Output
		System.out.println (middle) ;								//	
		System.out.println (max) ; 									//
		
		
    
  }

}