class Jlabs44

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				25/10/2017
// Purpose : 			Modify the program produced in Jlabs41 so that it writes out the number of uppercase characters in the user's input.



{
    public static void main(String[] args)
    {
    	String name ;
    	int index ;
    	int noOfUpChars ;
    	
    	noOfUpChars =0 ;
    	
    
    	System.out.println("Enter your full name ");   
		name = EasyIn.getString() ;
		
		for (index = 0; index <= name.length()-1; index++)
		{
			if (name.charAt(index) >='A' && name.charAt(index) <='Z')
				{
					noOfUpChars++ ;
				}
		}
    	System.out.println("You have  " + noOfUpChars + " Uppercase characters in your name!") ;
    	System.out.println("Lucky you.") ;
    }
}
