class Jlabs31
// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				26/09/2017
// Purpose : 			make a menu driven program to convert 
//						1.	Fahrenheit to celcius
//						2.	Celcius to Fahrenheit
//						3.	Inches to centimetres
//						4.	Centimetres to inches
//						5.	Pounds to Kilograms
//						6.	Kilograms to Pounds
//						7.	Exit
//						Have the list offer options to the user until they press 7 to exit.
{

  public static void main (String args[]) 
  {

    int choice ;
    boolean exit = false;
    
   	while(!exit)
   	{
   	
    	System.out.println("Please make your choice by entering the corresponding number.");
    	System.out.println("1.	Fahrenheit to celcius");
    	System.out.println("2.	Celcius to Fahrenheit");
    	System.out.println("3.	Inches to centimetres");
    	System.out.println("4.	Centimetres to inches");
    	System.out.println("5.	Pounds to Kilograms");
    	System.out.println("6.	Kilograms to Pounds");
    	System.out.println("7.	Exit");
    	
    	choice = EasyIn.getInt() ;
    	switch (choice)
    
    	{
    		case 1:
    	
    		int fahren;
    		double celcius;
    	
    		System.out.println("Please enter the temprature in Fahreneit");
    		fahren = EasyIn.getInt() ;
	    	celcius = (fahren - 32) * ((double)5 / 9);
	    	System.out.println("The temprature in Celsius is " + celcius);
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
	    	break;
	    	
	    	
	    	
	    	default:
	    	
	    	System.out.println("That Number was not one of the options.");	
    	}
    }
    
  }

}