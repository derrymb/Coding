class Jlabs2b1
// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				27/09/2017
// Purpose : 			Calculate insurance premium from last years premium + 5%, with a 40% discount without claims or else 20% extra per claim made.
//	
{

  public static void main (String args[]) 
  {

    double lastPremium ;		// user entered last year premium total
    int claims ;				// number of claims
    double fixed5 ;     		// discounted increase
    double claimspenalty ; 		// claims increase penalty
    double discount ; 			// calculation, cause my maths were not working all on one line
    final double FIXED5 ;		// constant 5% interest rate hike
    final double DISCOUNT ;		// 40% Discount for no claims
    final double CLAIMS ;
    
    FIXED5 = 5 ;					// assignment of constant
	DISCOUNT = 40 ;
	CLAIMS = 20 ;
	
    System.out.println("Please enter your last years Premium"); 		//input
    lastPremium = EasyIn.getDouble() ;
    System.out.println("Please enter your claims last year");			//input
    claims = EasyIn.getInt() ;
    
    fixed5 = (lastPremium / 100) * FIXED5 ;												//calculation of the 5% increase
    
    
    
    
    if (claims == 0)
    	{
    		discount = ((fixed5/100) * DISCOUNT) + lastPremium ;								//40% discount on the increase for no claims
    		System.out.println("Last years Premium: " + lastPremium);
    		System.out.println("5% standard increase: " + fixed5 + " A discount of 40% will be applied to this total for having no claims");
    		System.out.println("So your new Premium for this year will be " + discount);
    	}
    else
    	{
    		claimspenalty = lastPremium * ((FIXED5 + (claims * CLAIMS)) / 100) + lastPremium ;	//increase of 20% per claims applied to the standard 5% increase
    		System.out.println("Last years Premium: " + lastPremium);
    		System.out.println("5% standard increase: " + fixed5 + " A 20% increase per every claim is also added, you had " + claims + " claims");
    		System.out.println("Your new Premium for this year will be " + claimspenalty);
    	}	
    }

}