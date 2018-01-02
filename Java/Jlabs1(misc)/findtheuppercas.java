
class findtheuppercases

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				25/10/2017
// Purpose : 			Write and test a program which will prompt the user to enter their name, 
//						read in the name, and write to the screen just the surname.



{
    public static void main(String[] args)
    {
    	String sentence ;
    	int upperCase ;
    	int index;
    	
    	upperCase = 0;
    	System.out.println("Enter your sentence ");   
		sentence = EasyIn.getString() ;
		
		for (index = 0; index < sentence.length(); index++)
			{
				if (sentence.charAt(index) >= 'A' && sentence.charAt(index) <= 'Z')
					{
						upperCase++ ;
					}
			}
		
    	System.out.println("your sentence had " + upperCase + " Uppercase letters in it") ;
    	System.out.println("Have a nice day !") ;
    }
}

