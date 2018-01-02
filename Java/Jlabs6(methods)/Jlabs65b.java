class Jlabs65b
// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				26/09/2017
// Purpose : 			Rewrite the following program using a loop structure of your choice. But this time you implement a 
//						method called menu for the menu option, and a method for each conversion 
//						e.g. fahrToCel(), celToFahr(), inchToCent() etc. The program keeps presenting the user with 
//						options until the user enters the value 7 to exit


{

  public static void main (String args[]) 
  {
  	 	boolean exit;
    	exit = true;
		while (exit != false)
		 {
			int choice ;
			    
			System.out.println("Please make your choice by entering the corresponding number.");
			System.out.println("1.	Fahrenheit to celcius");
			System.out.println("2.	Celcius to Fahrenheit");
			System.out.println("3.	Inches to centimetres");
			System.out.println("4.	Centimetres to inches");
			System.out.println("5.	Pounds to Kilograms");
			System.out.println("6.	Kilograms to Pounds");
			System.out.println("7.  	Exit");
			choice = EasyIn.getInt() ;
  			switch (choice)
				{
			    	case 1:
			    	
			    	int fahr;
			    	
			    	
			    	System.out.println("Please enter the temprature in Fahreneit");
			    	fahr = EasyIn.getInt() ;
			    	System.out.println("The temprature in Celsius is " + easyCal.fahrToCel(fahr));
			    	break;
			    	
			    	case 2:
			    	
			    	double celi;
			    	double fah;
			    	
			    	System.out.println("Please enter the temprature in Celsius");
			    	celi = EasyIn.getInt() ;
			    	System.out.println("The temprature in Fahrenheit is " + easyCal.celToFahr(celi));
			    	break;
			    	
			    	case 3:
			    	
			    	int inches;
			    	double centimeters;
			    	
			    	System.out.println("Please enter the length in Inches");
			    	inches = EasyIn.getInt() ;
			    	System.out.println("The length in Centimeters is " + easyCal.inchToCent(inches));
			    	break;
			    	
			    	case 4:
			    	
			    	int centi;
			    	double inch;
			    	
			    	System.out.println("Please enter the length in Centimeters");
			    	centi = EasyIn.getInt() ;
			    	System.out.println("The length in Inches is " + easyCal.centToInch(centi));
			    	break;
			    	
			    	case 5:
			    	
			    	int pounds;
			    	double kilograms;
			    	
			    	System.out.println("Please enter the weight in Pounds");
			    	pounds = EasyIn.getInt() ;
			    	System.out.println("The weight in Kilograms is " + easyCal.lbsToKilo(pounds));
			    	break;
			    	
			    	case 6:
			    	
			    	int kilo;
			    	double lbs;
			    	
			    	System.out.println("Please enter the weight in Kilograms");
			    	kilo = EasyIn.getInt() ;
			    	System.out.println("The weight in Pounds is " + easyCal.kiloToLbs(kilo));
			    	break;
			    	
			    	case 7:
			    	exit =false;
			    	break;
			    	
			    	default:
			    	System.out.println("That Number was not one of the options.");
			    }	
    	}
    
  }

}