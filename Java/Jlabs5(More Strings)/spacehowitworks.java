class spacehowitworks

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
    	
 		sentence = " " ;
		spPos = sentence.indexOf(" ") ;
		
		while (sentence.length() != 0)
			{				
				while (sentence.charAt(spPos) == sentence.charAt(spPos+1))
					{
							spPos++ ;
					} 
				sentence = sentence.substring(spPos +1, sentence.length()) ;
			}   
		System.out.println("\nYour sentence has " + sentence.length() +  " words in it") ;
    
    }
}
	