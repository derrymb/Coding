class jlabs53

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				25/10/2017
// Purpose : 			Modify the program at (2) so that it outputs the number of words in the user's input, 
//						with the average, minimum and maximum number of characters in the words



{
    public static void main(String[] args)
    {
    	String sentence ;
    	int spPos ;
    	String lastWord ;
    	int maxChar ;
    	int minChar ;
    	double avgChar ;
    	int totalChar ;
    	int index ;
    	
    	
    	
    	
    	System.out.println("Enter a sentence ");   
		sentence = EasyIn.getString() ;
		sentence = sentence + " " ;
		spPos = sentence.indexOf(" ") ;
		lastWord = "" ;
		index = 0 ;
		maxChar = 0 ;
		minChar = 0 ;
		avgChar = 0 ;
		totalChar = 0;
		
		while (sentence.length() != 0)
		{
			
			lastWord = sentence.substring(0, spPos) ;
			totalChar = totalChar + lastWord.length();
			
			if (maxChar < lastWord.length())
			{
				maxChar = lastWord.length() ;
			}
			if (minChar == 0)
			{
				minChar = lastWord.length() ;
			}
			if (minChar > lastWord.length())
			{
				minChar = lastWord.length() ;
			}
			
			//make the code only run if the character after the space is not another space
			
			//now remove the first word
			sentence = sentence.substring(spPos +1, sentence.length()) ;
			spPos = sentence.indexOf(" ") ;
			System.out.println("\n\t" + "'" +lastWord+ "'" + " has " + lastWord.length() + " Characters in it.");
			index++ ;
		}   
		avgChar = (double)totalChar/index ;
		
    	System.out.println("\nYour sentence has " + index +  " words in it") ;
    	System.out.println("\nThe minimum characters in your words was " + minChar) ;
    	System.out.println("\nThe maximum characters in your words was " + maxChar) ;
    	System.out.println("\nThe average characters of the words in your sentence was " + avgChar) ;
    	System.out.println("\nLucky you.") ;
    }
}
