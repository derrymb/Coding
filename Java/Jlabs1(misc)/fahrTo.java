public class fahrTo

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				17/11/2017
// Purpose : 			Rewrite the following program using a loop structure of your choice. But this time you implement a 
//						method called menu for the menu option, and a method for each conversion 
//						e.g. fahrToCel(), celToFahr(), inchToCent() etc. The program keeps presenting the user with 
//						options until the user enters the value 7 to exit


{
    public static double cel(int fahr)
    {
    	double cel;
    	cel = (fahr - 32) * ((double)5 / 9);
    	return cel ;
    }
}
