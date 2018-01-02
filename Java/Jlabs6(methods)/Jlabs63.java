public class Jlabs63

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				17/11/2017
// Purpose : 			Write a method alphaCount() that takes a string as its argument and 
//						returns the number of alphabetic characters in that string





{
    public static int alphaCount(String sentence)
    {
    	int index;
    	int count;
    	
    	count = 0;
    	index = 0;
    	
    	for (index = 0; index < sentence.length(); index++)
    		{
    		
    			if (sentence.charAt(index) >= 'A' && sentence.charAt(index) <= 'Z')  
		    		{
		    			count++;
		    		}
		    	else if (sentence.charAt(index) >= 'a' && sentence.charAt(index) <= 'z')
		    		{
		    			count++;
		    		}
		    }		
		return count;	
    }
}

