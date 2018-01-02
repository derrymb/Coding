class jlabs52

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
				lastWord = sentence.substring(spPos+1) ;
				reverse = reverse + ", " + sentence.substring(spPos+1) ;
				//now remove the last word
				sentence = sentence.substring(0,spPos) ;
				System.out.println("\n\t" + lastWord);
				
			}
			spPos = sentence.lastIndexOf(" ") ;
		}   
		
		
    	System.out.println("Your sentence reversed is  " + reverse) ;
    	System.out.println("Lucky you.") ;
    }
}
