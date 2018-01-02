class Remainder 
// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				21/09/2017
// Purpose : 			to determine if a user entered number is positive or negative
{

  public static void main (String args[]) 
  {

    int number1 ;
    int remainder ; 

    System.out.println("Please enter your number");
    number1 = EasyIn.getInt() ;
    remainder = number1 % 2 ;
    if (remainder == 1)
    	System.out.println("Your number was odd");
    else if (remainder == 0)
    	System.out.println("Your number was even");
    
  }

}