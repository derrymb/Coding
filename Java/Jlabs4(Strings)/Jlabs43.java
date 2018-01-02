class Jlabs43

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				25/10/2017
// Purpose : 			Write and test a program which will prompt the user to enter their name, 
//						and read out how many characters are in thier name.



{
    public static void main(String[] args)
    {
    	String name ;
    	int index ;
    	int noOfChars ;
    	
    
    	System.out.println("Enter your full name ");   
		name = EasyIn.getString() ;
		
		for (index = 0; index <= name.length()-1; index++)
		{
			noOfChars = index ;
		}
    	System.out.println("You have  " + index + " characters in your name!") ;
    	System.out.println("Lucky you.") ;
    }
}
