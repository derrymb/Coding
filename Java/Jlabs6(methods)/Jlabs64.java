class Jlabs64  

// Student Name : 		Derry Brennan
// Student Id Number : 	C00231080
// Date :				17/11/2017
// Purpose : 			Write a method award() that takes a mark as its argument and returns 
//						as its result a String containing the values of either "Distinction", 
//						"Merit1", "Merit2", "Pass" or "Fail" where these are calculated as follows
/*						Distinction	70 - 100
						Merit1		63 - 69
						Merit2		55 - 62
						Pass		40 - 54
						Fail		Less Than 40
*/




 
{
    public static String award(int mark)
	{

		String dis;
		String mer1;
		String mer2;
		String pass;
		String fail;
		String award;
		
		dis = "Distinction";
		mer1 = "Merit1";
		mer2 = "Merit2";
		pass = "Pass";
		fail = "Fail";	    
	    award = "";
		
		
			if (mark >= 70)
				{
					award = award + dis;
				}
			else if (mark >= 63)
				{
					award = award + mer1;
				}
		  	else if (mark >= 55)
			  	{
					award = award + mer2;
			  	}
		  	else if (mark >= 40)
			  	{
			  		award = award + pass;
			  	}
			else
				{
					award = award + fail;
				}
		return award;
	}
}
