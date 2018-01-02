class Jlabs25

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				21/09/2017
// Purpose : 			ask the user for 3 numbers 1. The first number is exactly divisible by both numbers.
//	2. The first number is exactly divisible by one of the 2 numbers. If so, output which one it is. Also output if it is not exactly divisible by either number.

{

  public static void main (String args[]) 
  {

    int number1 ;
    int number2 ;
    int number3 ;
    int remainder ; 
    int remainder2 ; 

    System.out.println("Please enter your 1st integer number");
    number1 = EasyIn.getInt() ;
    System.out.println("Please enter your 2nd integer number");
    number2 = EasyIn.getInt() ;
    System.out.println("Please enter your 3rd integer number");
    number3 = EasyIn.getInt() ;
    
    remainder = number1 % number2 ;
    remainder2 = number1 % number3 ;
    
    if (remainder + remainder2 == 0)
    	System.out.println("Your 1st number was exactly divisible by both your 2nd and 3rd number");
    else if (remainder == 0)
    	System.out.println("Your 1st number is exactly divisible by the 2nd but not the 3rd");
   	else if (remainder2 == 0)
    	System.out.println("Your 1st number is exactly divisible by the 3nd but not the 2nd");
    else if (remainder2 + remainder != 0)
    	System.out.println("Your 1st number is not exactly divisible by the " 2nd " or the 3nd");
    
  }

}