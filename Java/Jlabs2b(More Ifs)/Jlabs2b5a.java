class Jlabs2b5
// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				26/09/2017
// Purpose : 			takes as input the number of a month and outputs the name of that month

{

  public static void main (String args[]) 
  {

    int choice ;
    
    System.out.println("Please enter a number between 1-12");
    choice = EasyIn.getInt() ;
    
    if (choice == 1)
    {
    	System.out.println("January is the 1st Month.");
    } 
    if (choice == 2)
    {
    	System.out.println("February is the 2nd Month.");
   	}
  	if (choice == 3)
    {
    	System.out.println("March is the 3rd Month.");
   	} 
    if (choice == 4)
    {
    	System.out.println("April is the 4th Month.");
    } 
    if (choice == 5)
    {
    	System.out.println("May is the 5th Month.");
    }
    if (choice == 6)
    {
    	System.out.println("June is the 6th Month.");
    }  
    if (choice == 7)
    {
    	System.out.println("July is the 7th Month.");
    }  
    if (choice == 8)
    {
    	System.out.println("August is the 8th Month.");
    }  
    if (choice == 9)
    {
    	System.out.println("September is the 9th Month.");
    }  
    if (choice == 10)
    {
    	System.out.println("October is the 10th Month.");
   	}  
    if (choice == 11)
    {
    	System.out.println("November is the 11th Month.");
    }  
    if (choice == 12)
    {
    	System.out.println("December is the 12th Month.");
    }  
   	if (choice > 12)
    {
    	System.out.println("Your number does not correspond to a Month.");
    }
  }

}