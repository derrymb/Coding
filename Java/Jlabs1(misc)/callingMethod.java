

class callingMethod
{


public static void main(String[] args)

    {	
	
	String word;

   	System.out.println ("Please type in a word");
   	
   	word = EasyIn.getString();
   	
   	System.out.println ("The word is " + word);

    System.out.println ("The number of letters in this word is " + library.countLetters(word));

  }

}


