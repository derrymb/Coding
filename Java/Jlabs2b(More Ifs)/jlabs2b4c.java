class Jlabs2b4c
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
		number3 = EasyIn.getInt() ;	//Input
		
		if (number1 < number2 && number1 < number3)
			{
				min = number1 ;
			}
		else if (number2 < number3)
			{
				min = number2 ;
			}									
		else
			{
				min = number3 ;
			}
		if (number1 > number2 && number1 > number3)
			{
				max = number1 ;
			}
		else if (number2 > number3)
			{
				max = number2 ;
			}									
		else
			{
				max = number3 ;
			}			
		if (number1 > min && number1 < max)
			{
				middle = number1 ;
			}
		else if (number2 > min && number2 < max)
			{
				middle = number2 ;
			}									
		else
			{
				middle = number3 ;
			}
		System.out.println("Your numbers in ascending order are: ");//
		System.out.println (min) ;									// Output
		System.out.println (middle) ;								//	
		System.out.println (max) ; 									//
		
		
    
  }

}