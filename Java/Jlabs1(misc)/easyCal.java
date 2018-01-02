public class easyCal

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				05/12/2017
// Purpose : 			Library of my public non-void methods

{
    public static double celToFahr(double cel)
    {
    	double fahr;
    	fahr = (cel * ((double)9/5) + 32);
    	return fahr ;
    }
    public static double centToInch(int cent)
    {
    	double inch;
    	inch = cent * 0.39;
    	return inch ;
    }
    public static double fahrToCel(int fahr)
    {
    	double cel;
    	cel = (fahr - 32) * ((double)5 / 9);
    	return cel ;
    }
    public static double inchToCent(int inch)
    {
    	double cent;
    	cent = inch * 2.54;
    	return cent ;
    }
    public static double kiloToLbs(int kilo)
    {
    	double lbs;
    	lbs = kilo * 2.204622;
    	return lbs ;
    }
    public static double lbsToKilo(int lbs)
    {
    	double kilo;
    	kilo = lbs * 0.4536;
    	return kilo ;
    }
    public static int noOfChar(String name)
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
    public static String surName(String name)
    {
    	String fullName;
    	String surName;
    	fullName = name ;
    	int spacePos ;
    	spacePos = fullName.indexOf(" ");
		surName = fullName.substring(spacePos + 1);
    	return surName ;
    }
    public static int noOfUpper(String name)
    {
    	String fullName ;
    	int index ;
    	int noOfChars ;
    	
    	fullName = name ;
    	noOfChars = 0 ;
		
		for (index = 0; index <= name.length()-1; index++)
		{
			if (fullName.charAt(index) >= 'A' && fullName.charAt(index) <= 'Z')
				{
					noOfChars++ ;
				}
		}		
		return noOfChars ;
    }
    public static String firstName(String name)
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
