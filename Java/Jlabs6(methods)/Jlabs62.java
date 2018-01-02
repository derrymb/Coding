public class Jlabs62

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				17/11/2017
// Purpose : 			Write a method called isAlpha() that takes a character as its argument 
//						and returns true if the character is alphabetic i.e. in the range A-Z, a-z, otherwise it returns false.



{
    public static boolean isAlpha(char character)
    {
    	///String tru;
    	//String fal;
    	boolean isAl ;
    	//tru = "True";
    	//fal = "False";
    	isAl = false;
    	
    	if (character >= 'A' && character <= 'Z')  
    		{
    			isAl = true; 
    		}
    	else if (character >= 'a' && character <= 'z')
    		{
				isAl = true;     		
			}
    	
    		return isAl ;
    }
}

