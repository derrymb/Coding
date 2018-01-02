public class noOf

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				22/11/2017
// Purpose : 			Modify the program produced at (1) so that it writes out the 
//						first name (everything up to the first space) instead of the surname.

{
    public static int chara(String name)
    {
    	String fullName ;
    	int index ;
    	int noOfChars ;
    	
    	fullName = name ;
    	noOfChars = 0 ;
		
		for (index = 0; index <= name.length()-1; index++)
		{
			noOfChars = index ;
		}
		return noOfChars ;
    }
}
