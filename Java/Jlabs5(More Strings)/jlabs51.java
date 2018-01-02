class jlabs51

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				25/10/2017
// Purpose : 			Write a program which will input a string from the keyboard, 
//						and output the number of separate words, where a word is one 
//						or more characters separated by spaces. Your program should only 
//						count as words groups of characters in the ranges A..Z and a..z



{
    public static void main(String[] args)
    {
    	String sentence ;
    	int index ;
    	int noOfWords ;
    	String split ;
    	int spPos ;
    	
    	
    	
    	
    	System.out.println("Enter a sentence ");   
		sentence = EasyIn.getString() ;
		split = " ";
		noOfWords = 0;
		for (index = 0; index <= sentence.length()-1; index++)
		{
			if (sentence.charAt(index) == ' ')
			{
				//sentence.lastindexof();
				noOfWords++ ;
			}
			
		}
		if (noOfWords > 0)
		{
			noOfWords++;
		}
		
    	System.out.println("You have  " + noOfWords + " in your sentence") ;
    	System.out.println("Lucky you.") ;
    }
}
