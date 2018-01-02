class Jlabs2b3
// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				27/09/2017
// Purpose : 			Asks the user to enter 3 different numbers. The program then tells the user which number was the lowest number entered. 
{

  public static void main (String args[]) 
  {
		int number1 ; 
		int number2 ;
		int number3 ;
		int smaller ;
		int smallest ;

		System.out.println("Please enter your 1st interger number");
		number1 = EasyIn.getInt() ;
		System.out.println("Please enter your 2nd interger number");
		number2 = EasyIn.getInt() ;
		System.out.println("Please enter your 3rd interger number");
		number3 = EasyIn.getInt() ;

		
		smaller = Math.min(number1, number2);
		smallest = Math.min(smaller, number3);
		
		System.out.println("The smallest number you entered was " + smallest);
		
		
    
  }

}