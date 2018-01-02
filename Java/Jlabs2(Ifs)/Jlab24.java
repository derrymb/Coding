class Jlabs24

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				21/09/2017
// Purpose : 			ask the user for 2 numbers, it then indicates whether the first number is exactly divisible by the second number.
{

  public static void main (String args[]) 
  {

    int number1 ;
    int number2 ;
    int remainder ; 

    System.out.println("Please enter your 1st number");
    number1 = EasyIn.getInt() ;
    System.out.println("Please enter your 2nd number");
    number2 = EasyIn.getInt() ;
    
    //remainder = number1 % number2 ;
    
    if (number1 % number2 == 1)
    	{
    		System.out.println("Your 1st number " + number1 + " is not exactly divisible by the 2nd " + number2);
    	}	
    else 
    	{
    		System.out.println("Your 1st number " + number1 + " is exactly divisible by the 2nd " + number2);
    	}
  }

}