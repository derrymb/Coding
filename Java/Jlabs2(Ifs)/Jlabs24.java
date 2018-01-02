class Jlabs24  

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				06/10/2017
// Purpose : 			which ask the user for 2 numbers, it then indicates whether the first number is exactly divisible by the second number.



 
{
    public static void main(String[] args)
	{

		int number1;
		int number2; 
		int remainder; 
	    
	   	System.out.println("Please enter 2 number and i will tell you if the 1st is exactly divisable by the 2nd.");
		System.out.println("Enter your Interger number ->  "); 
		number1 = EasyIn.getInt();
		System.out.println("Enter your Interger number ->  "); 
		number2 = EasyIn.getInt();
		
		remainder = number1 % number2;
		
			if (remainder == 0)
				{
					System.out.println("The first number you entered, " + number1 + " is exactly divisable by your second number " + number2); 
				}
		
			else
				{
					System.out.println("The first number you entered, " + number1 + " is not exactly divisable by your second number " + number2);
				}
	}
}
