public class firstName

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				22/11/2017
// Purpose : 			Modify the program produced at (1) so that it writes out the 
//						first name (everything up to the first space) instead of the surname.

{
    public static String first(String name)
    {
    	String fullName;
    	String firstName;
    	fullName = name ;
    	int spacePos ;
    	spacePos = fullName.indexOf(" ");
		firstName = fullName.substring(0, spacePos);
    	return firstName ;
    }
}
