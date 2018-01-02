class methods

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				15/11/2017
// Purpose : 			A Sample program to illustrate a method

{
	
	public static char findchar(String theString)
	{
		char theChar ;
		
		theChar = theString.charAt(1);
		
		return theChar ;
	}
		
	public static void printString(String theString)// parameter	
	
	{
	
	// This method takes a string and prints each 
	// character on a separate line 
	   
	int index; //local variable
    
    	for (index = 0; index <= theString.length() - 1; index ++)
   			{
       			System.out.println (theString.charAt(index));
   			}		
	}
		public static void main(String[] args)

    {
    	String sentence;
 
	       
	    System.out.print("Enter a sentence ");
		sentence = EasyIn.getString();
		printString(sentence); // sentence is the argument supplied to 
	    printString("What") ;
	    System.out.println ("the 2nd character in the sentence is " + findchar(sentence)) ;                     // the method
    }
}