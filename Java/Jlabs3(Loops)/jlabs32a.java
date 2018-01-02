class Jlabs32a

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				10/10/2017
// Purpose : 			find the sum of a collection of data values. Your program should terminate when a zero value is read.



{
    public static void main(String[] args)
    {
    	int number;
    	int sum;
    	
    	sum = 0;
    	
    	
    	System.out.println("Please type in a number or type 0 to stop the loop: ");
		number = EasyIn.getInt();
		
		while (number != 0)
		{
			sum = sum + number; 
			System.out.println("The sum of the numbers entered so far is: " + sum);
			System.out.println("Please type in a number: ");
			number = EasyIn.getInt();
		}
			System.out.println("The final sum of the numbers entered is: " + sum);

    }
    
}
