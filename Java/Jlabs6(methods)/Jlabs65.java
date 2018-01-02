class Jlabs65
// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				17/11/2017
// Purpose : 			Rewrite the following program using a loop structure of your choice.
/* 						But this time you implement a method called menu for the menu option, 
 *						and a method for each conversion e.g. fahrToCel(), celToFahr(), inchToCent() etc. 
 *						The program keeps presenting the user with options until the user enters the value 7 to exit

						1.	Fahrenheit to celcius
						2.	Celcius to Fahrenheit
						3.	Inches to centimetres
						4.	Centimetres to inches
						5.	Pounds to Kilograms
						6.	Kilograms to Pounds
						7.	Exit Program
*/

{

  public static void main (String args[]) 
  {

    int choice ;
    boolean exit ;
    System.out.println("Please make your choice by entering the corresponding number.");
    System.out.println("1.	Fahrenheit to celcius");
    System.out.println("2.	Celcius to Fahrenheit");
    System.out.println("3.	Inches to centimetres");
    System.out.println("4.	Centimetres to inches");
    System.out.println("5.	Pounds to Kilograms");
    System.out.println("6.	Kilograms to Pounds");
    choice = EasyIn.getInt() ;
    exit = false ;
    
    while (exit != true)
    	{
    	
		    switch (choice)
		    {
		    	case 1:
		    	
		    	int fahren;
		    	double celcius;
		    	
		    	System.out.println("Please enter the temprature in Fahreneit");
		    	fahren = EasyIn.getInt() ;
		    	fahrto.cel(fahren)
		    	
		    	break;
		    	
		    	case 2:
		    	
		    	double cel;
		    	double fah;
		    	
		    	System.out.println("Please enter the temprature in Celsius");
		    	cel = EasyIn.getInt() ;
		    	fah = (cel * ((double)9/5) + 32);
		    	System.out.println("The temprature in Fahrenheit is " + fah);
		    	break;
		    	
		    	case 3:
		    	
		    	int inches;
		    	double centimeters;
		    	
		    	System.out.println("Please enter the length in Inches");
		    	inches = EasyIn.getInt() ;
		    	centimeters = inches * 2.54;
		    	System.out.println("The length in Centimeters is " + centimeters);
		    	break;
		    	
		    	case 4:
		    	
		    	int centi;
		    	double inch;
		    	
		    	System.out.println("Please enter the length in Centimeters");
		    	centi = EasyIn.getInt() ;
		    	inch = centi * 0.39;
		    	System.out.println("The length in Inches is " + inch);
		    	break;
		    	
		    	case 5:
		    	
		    	int pounds;
		    	double kilograms;
		    	
		    	System.out.println("Please enter the weight in Pounds");
		    	pounds = EasyIn.getInt() ;
		    	kilograms = pounds * 0.4536;
		    	System.out.println("The weight in Kilograms is " + kilograms);
		    	break;
		    	
		    	case 6:
		    	
		    	int kilo;
		    	double lbs;
		    	
		    	System.out.println("Please enter the weight in Kilograms");
		    	kilo = EasyIn.getInt() ;
		    	lbs = kilo * 2.204622;
		    	System.out.println("The weight in Pounds is " + lbs);
		    	break;
		    	
		    	case 7:
		    	
		    	exit = true;
		    	
		    	default:
		    	
		    	System.out.println("That Number was not one of the options.");	
		    }
    	}
  }

}