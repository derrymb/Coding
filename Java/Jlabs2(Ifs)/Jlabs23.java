class Jlabs23  

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				06/10/2017
// Purpose : 			write a programme that determines if an entered number is odd or even



 
{
    public static void main(String[] args)
	{

		int number1; 
		int remainder; 
	    final int DIVISOR;
	    
	    DIVISOR = 2;
	    		
		System.out.print("Enter your Interger number ->  "); 
		number1 = EasyIn.getInt();
		
		remainder = number1 % DIVISOR;
		
			if (remainder == 0)
				{
					System.out.println("The number you entered, " + number1 + " is an even number."); 
				}
		
			else
				{
					System.out.println("The number you entered, " + number1 + " is an odd number.");
				}
	}
}
