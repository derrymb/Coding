
class Jlabs42

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				25/10/2017
// Purpose : 			Write and test a program which will prompt the user to enter their name, 
//						read in the name, and write to the screen just the First name.



{
    public static void main(String[] args)
    {
    	String name ;
    	String firstName ;
    	String surName ;
    	int spacePos ;
    
    	System.out.println("Enter your full name ");   
		name = EasyIn.getString() ;
		spacePos = name.indexOf(" ");
		surName = name.substring(spacePos + 1);
		firstName = name.substring(0, spacePos);  
		spacePos = name.indexOf(" ");
		
    	System.out.println("Hello " + firstName) ;
    	System.out.println("Have a nice day !") ;
    }
}
