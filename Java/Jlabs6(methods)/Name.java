public class lastname

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				22/11/2017
// Purpose : 			Rewrite the following program using a loop structure of your choice. But this time you implement a 
//						method called menu for the menu option, and a method for each conversion 
//						e.g. fahrToCel(), celToFahr(), inchToCent() etc. The program keeps presenting the user with 
//						options until the user enters the value 7 to exit


{
    public static String sur(String name)
    {
    	String name;
    	int spacePos ;
    	spacePos = name.indexOf(" ");
		surName = name.substring(spacePos + 1);
    	return surName ;
    }
}
