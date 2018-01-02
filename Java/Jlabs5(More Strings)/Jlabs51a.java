class jlabs52

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				25/10/2017
// Purpose : 			Modify the program at (2) so that it outputs the words input by the user in reverse order 
//						("This word is 3 chars"   becomes "chars 3 is word This")


{
    public static void main(String[] args)
    {
    	String sentence ;
    	int index ;
    	int spPos ;
    	String reverse ;
    	String lastWord ;
    	
    	
    	
    	
    	System.out.println("Enter a sentence ");   
		sentence = EasyIn.getString() ;
		sentence = " " + sentence ;
		spPos = sentence.lastIndexOf(" ") ;
		reverse = "" ;
		lastWord = " " ;
	
		
		while (spPos > -1)
		{
			
			//make the code only run if the character after the space is not another space
			if (lastWord.length() > 0)
			{
				reverse = reverse+ " " + sentence.substring(spPos+1) ;
				//now remove the last word
				sentence = sentence.substring(0,spPos) ;	
			}
			spPos = sentence.lastIndexOf(" ") ;
		}   
		
		
    	System.out.println("Your sentence reversed is  " + reverse) ;
    	System.out.println("Lucky you.") ;
    }
}
